/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.ThongKe;
import java.sql.ResultSet;
import Data.MyDataAccess;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class ThongKeDAO {

    public ThongKe getData(String start, String end) {
        ThongKe tk = new ThongKe();
        MyDataAccess my = new MyDataAccess("localhost", "root", "", "qltour");
        try {
            String qry = "SELECT count(DISTINCT(doan.madoan)) AS doan, count(DISTINCT(matour)) as tour\n"
                    + "from doan\n"
                    + "where DATEDIFF(ngaybd,'" + start + "') >= 0 and DATEDIFF(ngaykt,'" + end + "') <= 0";
            ResultSet rs = my.executeQuery(qry);
            rs.next();
            tk.setSoDoan(rs.getString(1));
            tk.setSoTour(rs.getString(2));

            qry = "SELECT count(DISTINCT(makhach)) as soKhach\n"
                    + "FROM chitietdoan, doan\n"
                    + "WHERE doan.madoan = chitietdoan.madoan and (DATEDIFF(ngaybd,'" + start + "') >= 0 and DATEDIFF(ngaykt,'" + end + "') <= 0)";
            rs = my.executeQuery(qry);
            rs.next();
            tk.setSoKhach(rs.getString(1));
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Lỗi đọc Database");
        } finally {
            try {
                my.close();
            } catch (Exception ex) {
                Logger.getLogger(ThongKeDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return tk;
    }

    public float doanhthu(String start, String end) {
        MyDataAccess my = new MyDataAccess("localhost", "root", "", "qltour");
        try {
            String qry = "SELECT\n"
                    + "    SUM(soluong * tien) AS doanhthu,\n"
                    + "    TongChi\n"
                    + "FROM\n"
                    + "    (\n"
                    + "    SELECT\n"
                    + "        madoan,\n"
                    + "        COUNT(makhach) AS soluong\n"
                    + "    FROM\n"
                    + "        `chitietdoan`\n"
                    + "    GROUP BY\n"
                    + "        madoan\n"
                    + ") AS temp1,\n"
                    + "(\n"
                    + "    SELECT\n"
                    + "        temp.madoan,\n"
                    + "        tien\n"
                    + "    FROM\n"
                    + "        doan,\n"
                    + "        (\n"
                    + "        SELECT\n"
                    + "            madoan,\n"
                    + "            SUM(giatien) AS tien\n"
                    + "        FROM\n"
                    + "            chiphi\n"
                    + "        GROUP BY\n"
                    + "            madoan\n"
                    + "    ) AS temp\n"
                    + "WHERE\n"
                    + "    (\n"
                    + "        DATEDIFF(ngaybd,'" + start + "') >= 0 and DATEDIFF(ngaykt,'" + end + "') <= 0\n"
                    + "    )\n"
                    + "GROUP BY\n"
                    + "    temp.madoan\n"
                    + ") AS temp2,\n"
                    + "(\n"
                    + "    SELECT\n"
                    + "        SUM(giatien) AS TongChi\n"
                    + "    FROM\n"
                    + "        chiphi,\n"
                    + "        (\n"
                    + "        SELECT\n"
                    + "            madoan\n"
                    + "        FROM\n"
                    + "            doan\n"
                    + "        WHERE\n"
                    + "            DATEDIFF(ngaybd,'" + start + "') >= 0 and DATEDIFF(ngaykt,'" + end + "') <= 0\n"
                    + "    ) AS thoigian\n"
                    + "WHERE\n"
                    + "    chiphi.madoan = thoigian.madoan\n"
                    + ") AS tongchi\n"
                    + "WHERE\n"
                    + "    temp1.madoan = temp2.madoan";
            ResultSet rs = my.executeQuery(qry);
            rs.next();
            Float a = Float.parseFloat(rs.getString(1));
            Float b = Float.parseFloat(rs.getString(2));
            return a - b;
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Khong ton tai doanh thu");
        } finally {
            try {
                my.close();
            } catch (Exception ex) {
                Logger.getLogger(ThongKeDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }
}
