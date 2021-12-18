/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.LoaiChiPhi;
import DTO.Tour;
import Data.MyDataAccess;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author xenov
 */
public class LoaiChiPhiDAO {
    public ArrayList<LoaiChiPhi> docDuLieu() throws Exception{
		ArrayList<LoaiChiPhi> ds = new ArrayList<LoaiChiPhi>();
                MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
		try {
			String qry = "select * from loaichiphi";
			ResultSet rs = my.executeQuery(qry);
			while(rs.next()) {
				LoaiChiPhi diaDiem = new LoaiChiPhi();
				diaDiem.setMaloaichiphi(rs.getInt(1));
                                diaDiem.setTenloaichiphi((rs.getString(2)));
				ds.add(diaDiem);
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
     public int them(LoaiChiPhi dd) {
              
                    int res = 0;
                    try {
                        MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
			String qry = "Insert into loaichiphi Value(";
			qry += "'" + dd.getMaloaichiphi()+ "'";
			qry += ",'" + dd.getTenloaichiphi()+ "'";
			qry += ")";
			res = my.executeUpdate(qry);
                        }
                        catch(Exception e) {
                                System.out.println(e);
                                JOptionPane.showMessageDialog(null,"Lỗi thêm vào Database");
                        }
                    return res;
    }
    public int xoa(int malcp) {
            int res = 0;
		try {
			String qry = "delete from loaichiphi where malcp='" + malcp + "'";
			MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
                        res = my.executeUpdate(qry);
		}
		catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,"Lỗi xóa Database");
		}
            return res;
	}
   
	public int sua(LoaiChiPhi dd) {
                int res = 0;
		try {
			String qry = "Update loaichiphi set ";
			qry += "tenlcp='" + dd.getTenloaichiphi() + "'";
			qry += " where malcp='" + dd.getMaloaichiphi() + "'";
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
