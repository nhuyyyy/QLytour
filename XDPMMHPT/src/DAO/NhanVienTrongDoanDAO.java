/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import DTO.NhanVienTrongDoan;
import Data.MyDataAccess;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author xenov
 */
public class NhanVienTrongDoanDAO {
  public ArrayList<NhanVienTrongDoan> docDuLieu() throws Exception{
		ArrayList<NhanVienTrongDoan> ds = new ArrayList<NhanVienTrongDoan>();
                MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
		try {
			String qry = "select * from nhanvientrongdoan";
			ResultSet rs = my.executeQuery(qry);
			while(rs.next()) {
				NhanVienTrongDoan nhanvientrongdoan = new NhanVienTrongDoan();
				nhanvientrongdoan.setMadoan(rs.getInt(1));
				nhanvientrongdoan.setManhanvien(rs.getInt(2));
				nhanvientrongdoan.setNhiemvu(rs.getString(3));
				ds.add(nhanvientrongdoan);
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
 
    public int them(NhanVienTrongDoan nv) {
              
                    int res = 0;
                    try {
                        MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
			String qry = "Insert into nhanvientrongdoan Value(";
			qry += "'" + nv.getMadoan()+ "'";
			qry += ",'" + nv.getManhanvien()+ "'";
                        qry += ",'" + nv.getNhiemvu()+ "'";
			qry += ")";
			res = my.executeUpdate(qry);
                        }
                        catch(Exception e) {
                                System.out.println(e);
                                JOptionPane.showMessageDialog(null,"Lỗi thêm vào Database");
                        }
                    return res;
    }
    public int xoaNhanVienCoMaDoan(int madoan) {
            int res = 0;
		try {
			String qry = "delete from nhanvientrongdoan where madoan='" + madoan + "'";
			MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
                        res = my.executeUpdate(qry);
		}
		catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,"Lỗi xóa Database");
		}
            return res;
	}
   
}