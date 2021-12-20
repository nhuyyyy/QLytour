/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.LoaiTour;
import Data.MyDataAccess;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author xenov
 */
public class LoaiTourDAO {
    public ArrayList<LoaiTour> docDuLieu() throws Exception{
		ArrayList<LoaiTour> ds = new ArrayList<LoaiTour>();
                MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
		try {
			String qry = "select * from loaitour";
			ResultSet rs = my.executeQuery(qry);
			while(rs.next()) {
				LoaiTour tour = new LoaiTour();
				tour.setMaloaitour(rs.getInt(1));
				tour.setTenloaitour(rs.getString(2));
				
				ds.add(tour);
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
    public int them(LoaiTour nv) {
              
                    int res = 0;
                    try {
                        MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
			String qry = "Insert into loaitour Value(";
			qry += "'" + nv.getMaloaitour()+ "'";
			qry += ",'" + nv.getTenloaitour()+ "'";
			qry +=  ")";
			res = my.executeUpdate(qry);
                        }
                        catch(Exception e) {
                                System.out.println(e);
                                JOptionPane.showMessageDialog(null,"Lỗi thêm vào Database");
                        }
                    return res;
    }
     public int xoa(int maloaitour) {
            int res = 0;
		try {
			String qry = "delete from loaitour where maloaitour='" + maloaitour + "'";
			MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
                        res = my.executeUpdate(qry);
		}
		catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,"Lỗi xóa Database");
		}
            return res;
	}
    public int xoa(String tenloaitour) {
            int res = 0;
		try {
			String qry = "delete from loaitour where tenloaitour='" + tenloaitour + "'";
			MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
                        res = my.executeUpdate(qry);
		}
		catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,"Lỗi xóa Database");
		}
            return res;
	}
	public int sua(LoaiTour lt) {
                int res = 0;
		try {
			String qry = "Update loaitour set ";
			qry += "tenloaitour='" + lt.getTenloaitour() + "'";
			qry += " where maloaitour='" + lt.getMaloaitour() + "'";
			MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
                        res = my.executeUpdate(qry);
		}
		catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,"Lỗi sửa Database");
		}
                return res;
	}
                public List<LoaiTour> getLoaiTour(Map<String,String> nv)throws Exception{
               List<LoaiTour> ds = new ArrayList<LoaiTour>();
              MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
		try {
			StringBuffer query = new StringBuffer("Select * from loaitour where 1=1");
                        if(nv.get("Maloaitour")!= null && !nv.get("Maloaitour").equals("")){
                            query.append(" and maloaitour = "+nv.get("Maloaitour"));
                        }
                        if(nv.get("tenloaitour")!= null&& !nv.get("tenloaitour").equals("")){
                            query.append(" and tenloaitour ="+nv.get("tenloaitour"));
                            
                        }
                        System.out.println(query.toString());
			ResultSet rs = my.executeQuery(query.toString());
			while(rs.next()) {
				LoaiTour tour = new LoaiTour();
				tour.setMaloaitour(rs.getInt(1));
				tour.setTenloaitour(rs.getString(2));
				
				ds.add(tour);
			}
                        return ds;
		}catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,"Lỗi đọc Database");
		}
                finally{
                    my.close();
                }
                return null;
        }
                
}
