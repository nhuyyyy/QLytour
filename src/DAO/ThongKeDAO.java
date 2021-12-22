/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.ThongKe;
import java.sql.ResultSet;
import Data.MyDataAccess;
import java.util.ArrayList;
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

    public int[] dsTour() {
        int[] maTour = new int[100];
        MyDataAccess my = new MyDataAccess("localhost", "root", "", "qltour");
        try {
            String qry = "SELECT matour FROM doan GROUP BY matour";
            System.out.println(qry);
            ResultSet rs = my.executeQuery(qry);
            System.out.println(rs);
            int i = 0;
            while (rs.next()) {
                maTour[i++] = rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Lỗi đọc Database");
        }
        return maTour;
    }

    public ArrayList<ThongKe> getChiPhi(String maTour) {
        ArrayList<ThongKe> tk = new ArrayList<ThongKe>();
        MyDataAccess my = new MyDataAccess("localhost", "root", "", "qltour");
        try {
            String qry = "SELECT tenlcp, sum(giatien)\n"
                    + "FROM chiphi, loaichiphi, doan\n"
                    + "WHERE chiphi.malcp = loaichiphi.malcp AND chiphi.madoan = doan.madoan AND matour = '" + maTour + "'\n"
                    + "GROUP BY tenlcp";
            ResultSet rs = my.executeQuery(qry);
            while (rs.next()) {
                ThongKe thongke = new ThongKe();
                thongke.setSoDoan(rs.getString(1));
                thongke.setSoTour(rs.getString(2));
                tk.add(thongke);
            }
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

    public ArrayList<ThongKe> doanhthu() {
        ArrayList<ThongKe> tk = new ArrayList<ThongKe>();
        MyDataAccess my = new MyDataAccess("localhost", "root", "", "qltour");
        try {
            String qry = "SELECT temp1.matour, tentour, tong - tongchi as doanhthu, soDoan\n"
                    + "FROM (SELECT doan.matour, tentour, tong, COUNT(DISTINCT(madoan)) as soDoan\n"
                    + "FROM tour, doan\n"
                    + "WHERE tour.matour = doan.matour\n"
                    + "GROUP BY doan.matour) as temp1,\n"
                    + "(SELECT matour, sum(giatien) as tongchi\n"
                    + "FROM chiphi, loaichiphi, doan\n"
                    + "WHERE chiphi.malcp = loaichiphi.malcp AND chiphi.madoan = doan.madoan\n"
                    + "GROUP BY matour) as temp2\n"
                    + "WHERE temp1.matour = temp2.matour";
            ResultSet rs = my.executeQuery(qry);
            while (rs.next()) {
                ThongKe thongke = new ThongKe();
                thongke.setSoDoan(rs.getString(1));
                thongke.setSoTour(rs.getString(2));
                thongke.setSoKhach(rs.getString(3));
                thongke.setTen(rs.getString(4));
                tk.add(thongke);
            }
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
        return tk;
    }
}
