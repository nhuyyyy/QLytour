/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.ChiPhi;
import Data.MyDataAccess;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author xenov
 */
public class ChiPhiDAO {
    public ArrayList<ChiPhi> docDuLieu() throws Exception{
		ArrayList<ChiPhi> ds = new ArrayList<ChiPhi>();
                MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
		try {
			String qry = "select * from chiphi";
			ResultSet rs = my.executeQuery(qry);
			while(rs.next()) {
				DTO.ChiPhi chiphi = new DTO.ChiPhi();
				chiphi.setMachiphi(rs.getInt(1));
				chiphi.setMaloaichiphi(rs.getInt(2));
				chiphi.setMadoan(rs.getInt(3));
                                chiphi.setGiatien(rs.getInt(4));
				ds.add(chiphi);
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
    public DTO.ChiPhi find(int maChiPhi) throws Exception
    {
        System.out.println(maChiPhi);
        DTO.ChiPhi chiphi =  null;
        MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
		try {
			String qry = "select * from chiphi where machiphi=" + maChiPhi + "";
			ResultSet rs = my.executeQuery(qry);
			while(rs.next()) {
				chiphi = new DTO.ChiPhi();
				chiphi.setMachiphi(rs.getInt(1));
				chiphi.setMaloaichiphi(rs.getInt(2));
				chiphi.setMadoan(rs.getInt(3));
                                chiphi.setGiatien(rs.getInt(4));
			}
		}catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,"Lỗi đọc Database");
		}
                finally{
                    my.close();
                }
        if(chiphi == null)
               System.out.println("DAO bi loi ko tim duoc chiphi");
        return chiphi;
    }
    public int them(ChiPhi cp) {
              
                    int res = 0;
                    try {
                        MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
			String qry = "Insert into chiphi Value(";
			qry += "'" + cp.getMachiphi()+ "'";
			qry += ",'" + cp.getMaloaichiphi()+ "'";
                        qry += ",'" + cp.getMadoan()+ "'";
                        qry += ",'" + cp.getGiatien()+ "'";
			qry += ",'" + 0 + "')";
			res = my.executeUpdate(qry);
                        }
                        catch(Exception e) {
                                System.out.println(e);
                                JOptionPane.showMessageDialog(null,"Lỗi thêm vào Database");
                        }
                    return res;
    }
    public int themAutoPrimaryKey(ChiPhi cp) {
              
                    int res = 0;
                    try {
                        MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
			String qry = "Insert into chiphi(malcp,madoan,giatien) Value(";
		
			qry += "'" + cp.getMaloaichiphi()+ "'";
                        qry += ",'" + cp.getMadoan()+ "'";
                        qry += ",'" + cp.getGiatien()+ "'";
			qry += ")";
			res = my.executeUpdate(qry);
                        }
                        catch(Exception e) {
                                System.out.println(e);
                                JOptionPane.showMessageDialog(null,"Lỗi thêm vào Database");
                        }
                    return res;
    }
    public int xoa(int machiphi) {
            int res = 0;
		try {
			String qry = "delete from chiphi where machiphi='" + machiphi + "'";
			MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
                        res = my.executeUpdate(qry);
		}
		catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,"Lỗi xóa Database");
		}
            return res;
	}
    public int xoaChiPhiCoMaDoan(int madoan)
    {
        int res = 0;
		try {
			String qry = "delete from chiphi where madoan='" + madoan + "'";
			MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
                        res = my.executeUpdate(qry);
		}
		catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,"Lỗi xóa Database");
		}
            return res;
    }
	public int sua(ChiPhi chiphi) {
                int res = 0;
		try {
			String qry = "Update chiphi set ";
			qry += "malcp='" + chiphi.getMaloaichiphi()+ "',";
                        qry += "madoan='" + chiphi.getMadoan()+ "'";
                        qry += "madoan='" + chiphi.getGiatien()+ "'";
			qry += " where machiphi='" + chiphi.getMachiphi()+ "'";
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
