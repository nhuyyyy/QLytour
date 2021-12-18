/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Doan;
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
public class DoanDAO {
     public ArrayList<Doan> docDuLieu() throws Exception{
		ArrayList<Doan> ds = new ArrayList<Doan>();
                MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
		try {
			String qry = "select * from doan";
			ResultSet rs = my.executeQuery(qry);
			while(rs.next()) {
				Doan gt = new Doan();
				gt.setMadoan(rs.getInt(1));
                                gt.setMatour(rs.getInt(2));
                                gt.setNbd(rs.getDate(3));
                                gt.setNkt(rs.getDate(4));
				ds.add(gt);
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
    public int them(Doan gt) {
              
                    int res = 0;
                    try {
                        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                        MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
			String qry = "Insert into doan Value(";
			qry += "'" + gt.getMadoan()+ "'";
			qry += ",'" + gt.getMatour() + "'";
                        qry += ",'" + format.format(gt.getNbd()) + "'";
                        qry += ",'" + format.format(gt.getNkt()) +  "'";
			qry += ")";
			res = my.executeUpdate(qry);
                        }
                        catch(Exception e) {
                                System.out.println(e);
                                JOptionPane.showMessageDialog(null,"Lỗi thêm vào Database");
                        }
                    return res;
    }
   
    public int xoa(int madoan) {
            int res = 0;
		try {
			String qry = "delete from doan where madoan='" + madoan + "'";
			MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
                        res = my.executeUpdate(qry);
		}
		catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,"Lỗi xóa Database");
		}
            return res;
	}
   
	public int sua(Doan gt) {
                int res = 0;
		try {
                        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String qry = "Update doan set ";
			qry += "matour='"+ gt.getMatour() + "'";
                        qry += ",ngaybd='"+ dateFormat.format(gt.getNbd()) + "'";
                        qry += ",ngaykt='"+ dateFormat.format(gt.getNkt()) + "'";
			qry += " where madoan='" + gt.getMadoan() + "'";
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
