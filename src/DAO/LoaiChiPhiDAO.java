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
import java.util.List;
import java.util.Map;
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
          public List<LoaiChiPhi> getLoaiCP(Map<String,String> nv)throws Exception{
               List<LoaiChiPhi> ds = new ArrayList<LoaiChiPhi>();
              MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
		try {
			StringBuffer query = new StringBuffer("Select * from loaichiphi where 1=1");
                        if(nv.get("Machiphi")!= null && !nv.get("Machiphi").equals("")){
                            query.append(" and malcp = "+nv.get("Machiphi"));
                        }
                        if(nv.get("tenchiphi")!= null&& !nv.get("tenchiphi").equals("")){
                            query.append(" and tenlcp ="+nv.get("tenchiphi"));
                            
                        }
                        System.out.println(query.toString());
			ResultSet rs = my.executeQuery(query.toString());
			while(rs.next()) {
				LoaiChiPhi diaDiem = new LoaiChiPhi();
				diaDiem.setMaloaichiphi(rs.getInt(1));
                                diaDiem.setTenloaichiphi((rs.getString(2)));
				ds.add(diaDiem);
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
