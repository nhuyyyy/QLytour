/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.ChiTietDoan;
import DTO.Tour;
import Data.MyDataAccess;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author xenov
 */
public class ChiTietDoanDAO {
    public ArrayList<ChiTietDoan> docDuLieu() throws Exception{
		ArrayList<ChiTietDoan> ds = new ArrayList<ChiTietDoan>();
                MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
		try {
			String qry = "select * from chitietdoan";
			ResultSet rs = my.executeQuery(qry);
			while(rs.next()) {
				ChiTietDoan ctd = new ChiTietDoan();
				ctd.setMadoan(rs.getInt(1));
                                ctd.setMakhach((rs.getInt(2)));
				ds.add(ctd);
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
     public int them(ChiTietDoan ctd) {
              
                    int res = 0;
                    try {
                        MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
			String qry = "Insert into chitietdoan Value(";
			qry += "'" + ctd.getMadoan()+ "'";
			qry += ",'" + ctd.getMakhach()+ "'";
			qry += ")";
			res = my.executeUpdate(qry);
                        }
                        catch(Exception e) {
                                System.out.println(e);
                                JOptionPane.showMessageDialog(null,"Lỗi thêm vào Database");
                        }
                    return res;
    }
    
    public int xoa(ChiTietDoan ctd) {
            int res = 0;
		try {
			String qry = "delete from chitietdoan where madoan='" + ctd.getMadoan() + "' and makhach='" + ctd.getMakhach() + "'";
			MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
                        res = my.executeUpdate(qry);
		}
		catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,"Lỗi xóa Database");
		}
            return res;
	}
    public int xoaKhachcoMaDoan(int madoan) {
            int res = 0;
		try {
			String qry = "delete from chitietdoan where madoan='" + madoan + "'";
			MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
                        res = my.executeUpdate(qry);
		}
		catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,"Lỗi xóa Database");
		}
            return res;
	}
   
	public int sua(ChiTietDoan ctdc, ChiTietDoan ctdm) {
                int res = 0;
		try {
			String qry = "Update chitietdoan set ";
			qry += "madoan='" + ctdm.getMadoan() + "'";
                        qry += ", makhach='" + ctdm.getMakhach() + "'";
			qry += " where madoan='" + ctdc.getMadoan() + "' and makhach='" + ctdc.getMakhach() +"'";
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
