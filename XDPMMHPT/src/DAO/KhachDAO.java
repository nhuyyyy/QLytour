/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Khach;
import Data.MyDataAccess;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author xenov
 */
public class KhachDAO {
    public ArrayList<Khach> docDuLieu() throws Exception{
		ArrayList<Khach> ds = new ArrayList<Khach>();
                MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
		try {
			String qry = "select * from khach";
			ResultSet rs = my.executeQuery(qry);
			while(rs.next()) {
				Khach khach = new Khach();
				khach.setMakhach(rs.getInt(1));
                                khach.setTenkhach(rs.getString(2));
                                khach.setNgaysinh(rs.getDate(3));
                                khach.setCmnd(rs.getInt(4));
				ds.add(khach);
			}
		}catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,"Lỗi đọc Database");
		}
                finally{
                    my.close();
                }
		return ds;
	}
    public int them(Khach khach) {
              
                    int res = 0;
                    try {
                        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
                        MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
			String qry = "Insert into khach Value(";
			qry += "'" + khach.getMakhach() + "'";
			qry += ",'" + khach.getTenkhach() + "'";
                        qry += ",'" + format.format(khach.getNgaysinh()) + "'";
                        qry += ",'" + khach.getCmnd() + "'";
			qry += ")";
			res = my.executeUpdate(qry);
                        }
                        catch(Exception e) {
                                System.out.println(e);
                                JOptionPane.showMessageDialog(null,"Lỗi thêm vào Database");
                        }
                    return res;
    }
   
    public int xoa(int makhach) {
            int res = 0;
		try {
			String qry = "delete from khach where makhach='" + makhach + "'";
			MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
                        res = my.executeUpdate(qry);
		}
		catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,"Lỗi xóa Database");
		}
            return res;
	}
   
	public int sua(Khach khach) {
                int res = 0;
		try {
                        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String qry = "Update khach set ";
			qry += "tenkh='"+ khach.getTenkhach() + "'";
                        qry += ",ngaysinh='"+ dateFormat.format(khach.getNgaysinh())+ "'";
                        qry += ",cmnd='"+ khach.getCmnd() + "'";
                       
			qry += " where makhach='" + khach.getMakhach() + "'";
			MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
                        res = my.executeUpdate(qry);
		}
		catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,"Lỗi sửa Database");
		}
                return res;
	}
}
