/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.DiaDiem;
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
public class DiaDiemDAO {
    public ArrayList<DiaDiem> docDuLieu() throws Exception{
		ArrayList<DiaDiem> ds = new ArrayList<DiaDiem>();
                MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
		try {
			String qry = "select * from diadiem";
			ResultSet rs = my.executeQuery(qry);
			while(rs.next()) {
				DiaDiem diaDiem = new DiaDiem();
				diaDiem.setMadiadiem(rs.getInt(1));
                                diaDiem.setTendiadiem((rs.getString(2)));
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
     public int them(DiaDiem dd) {
              
                    int res = 0;
                    try {
                        MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
			String qry = "Insert into diadiem Value(";
			qry += "'" + dd.getMadiadiem()+ "'";
			qry += ",'" + dd.getTendiadiem()+ "'";
			qry += ")";
			res = my.executeUpdate(qry);
                        }
                        catch(Exception e) {
                                System.out.println(e);
                                JOptionPane.showMessageDialog(null,"Lỗi thêm vào Database");
                        }
                    return res;
    }
    public int xoa(int madd) {
            int res = 0;
		try {
			String qry = "delete from diadiem where madd='" + madd + "'";
			MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
                        res = my.executeUpdate(qry);
		}
		catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,"Lỗi xóa Database");
		}
            return res;
	}
   
	public int sua(DiaDiem dd) {
                int res = 0;
		try {
			String qry = "Update diadiem set ";
			qry += "tendd='" + dd.getTendiadiem() + "'";
			qry += " where madd='" + dd.getMadiadiem() + "'";
			MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
                        res = my.executeUpdate(qry);
		}
		catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,"Lỗi sửa Database");
		}
                return res;
	}
  public List<DiaDiem> getDiaDiem(Map<String,String> nv)throws Exception{
               List<DiaDiem> ds = new ArrayList<DiaDiem>();
              MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
		try {
			StringBuffer query = new StringBuffer("Select * from diadiem where 1=1");
                        if(nv.get("Madiadiem")!= null && !nv.get("Madiadiem").equals("")){
                            query.append(" and madd = "+nv.get("Madiadiem"));
                        }
                        if(nv.get("tendiadiem")!= null&& !nv.get("tendiadiem").equals("")){
                            query.append(" and tendd ="+nv.get("tendiadiem"));
                            
                        }
                        System.out.println(query.toString());
			ResultSet rs = my.executeQuery(query.toString());
			while(rs.next()) {
				DiaDiem diaDiem = new DiaDiem();
				diaDiem.setMadiadiem(rs.getInt(1));
                                diaDiem.setTendiadiem((rs.getString(2)));
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
        }}
