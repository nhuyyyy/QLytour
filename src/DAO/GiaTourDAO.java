/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.GiaTour;
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
public class GiaTourDAO {
    public ArrayList<GiaTour> docDuLieu() throws Exception{
		ArrayList<GiaTour> ds = new ArrayList<GiaTour>();
                MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
		try {
			String qry = "select * from giatour";
			ResultSet rs = my.executeQuery(qry);
			while(rs.next()) {
				GiaTour gt = new GiaTour();
				gt.setMagia(rs.getInt(1));
                                gt.setMatour(rs.getInt(2));
                                gt.setGiatien(rs.getDouble(3));
                                gt.setTgbd(rs.getDate(4));
                                gt.setTgkt(rs.getDate(5));
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
    public int them(GiaTour gt) {
              
                    int res = 0;
                    try {
                        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
                        Calendar cal = Calendar.getInstance();
                        cal.setTime(gt.getTgbd());
                        Calendar cal2 = Calendar.getInstance();
                        cal2.setTime(gt.getTgkt());
                        MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
			String qry = "Insert into giatour Value(";
			qry += "'" + gt.getMagia()+ "'";
			qry += ",'" + gt.getMatour() + "'";
                        qry += ",'" + gt.getGiatien() + "'";
                        qry += ",'" + cal.get(Calendar.YEAR) + "-" + (cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.DATE) + "'";
                        qry += ",'" + cal2.get(Calendar.YEAR) + "-" + (cal2.get(Calendar.MONTH) + 1) + "-" + cal2.get(Calendar.DATE) +  "'";
			qry += ")";
			res = my.executeUpdate(qry);
                        }
                        catch(Exception e) {
                                System.out.println(e);
                                JOptionPane.showMessageDialog(null,"Lỗi thêm vào Database");
                        }
                    return res;
    }
    public int themAutoPrimaryKey(GiaTour gt) {
              
                    int res = 0;
                    try {
                        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
                        Calendar cal = Calendar.getInstance();
                        cal.setTime(gt.getTgbd());
                        Calendar cal2 = Calendar.getInstance();
                        cal2.setTime(gt.getTgkt());
                        MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
			String qry = "Insert into giatour(matour,giatien,tgbd,tgkt) Value(";		
			qry += "'" + gt.getMatour() + "'";
                        qry += ",'" + gt.getGiatien() + "'";
                        qry += ",'" + cal.get(Calendar.YEAR) + "-" + (cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.DATE) + "'";
                        qry += ",'" + cal2.get(Calendar.YEAR) + "-" + (cal2.get(Calendar.MONTH) + 1) + "-" + cal2.get(Calendar.DATE) +  "'";
			qry += ")";
			res = my.executeUpdate(qry);
                        }
                        catch(Exception e) {
                                System.out.println(e);
                                JOptionPane.showMessageDialog(null,"Lỗi thêm vào Database");
                        }
                    return res;
    }
    public int xoa(int magia) {
            int res = 0;
		try {
			String qry = "delete from giatour where magia='" + magia + "'";
			MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
                        res = my.executeUpdate(qry);
		}
		catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,"Lỗi xóa Database");
		}
            return res;
	}
   
	public int sua(GiaTour gt) {
                int res = 0;
		try {
                        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String qry = "Update giatour set ";
			qry += "matour='"+ gt.getMatour() + "'";
                        qry += ",giatien='"+ gt.getGiatien()+ "'";
                        qry += ",tgbd='"+ dateFormat.format(gt.getTgbd()) + "'";
                        qry += ",tgkt='"+ dateFormat.format(gt.getTgkt()) + "'";
                       
			qry += " where magia='" + gt.getMagia() + "'";
			MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
                        res = my.executeUpdate(qry);
		}
		catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,"Lỗi sửa Database");
		}
                return res;
	}
        public int xoaGiaCoMaTour(int matour) {
            int res = 0;
		try {
			String qry = "delete from giatour where matour='" + matour + "'";
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
