/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.ChiTietTour;
import DTO.DiaDiem;
import Data.MyDataAccess;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author xenov
 */
public class ChiTietTourDAO {
     public ArrayList<ChiTietTour> docDuLieu() throws Exception{
		ArrayList<ChiTietTour> ds = new ArrayList<ChiTietTour>();
                MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
		try {
			String qry = "select * from chitiettour";
			ResultSet rs = my.executeQuery(qry);
			while(rs.next()) {
				DTO.ChiTietTour ctt = new DTO.ChiTietTour();
                                ctt.setId(rs.getInt(1));
				ctt.setMatour(rs.getInt(2));
                                ctt.setMadiadiem(rs.getInt(3));
                                ctt.setThutu(rs.getInt(4));
				ds.add(ctt);
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
     public int them(ChiTietTour ctt) {
              
                    int res = 0;
                    try {
                        MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
			String qry = "Insert into chitiettour(matour,madd,thutu) Value(";
			qry += "'" + ctt.getMatour()+ "'";
			qry += ",'" + ctt.getMadiadiem()+ "'";
                        qry += ",'" + ctt.getThutu()+ "'";
			qry += ")";
			res = my.executeUpdate(qry);
                        }
                        catch(Exception e) {
                                System.out.println(e);
                                JOptionPane.showMessageDialog(null,"Lỗi thêm vào Database");
                        }
                    return res;
    }
    public int xoa(int id) {
            int res = 0;
		try {
			String qry = "delete from chitiettour where id='" + id + "'";
			MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
                        res = my.executeUpdate(qry);
		}
		catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,"Lỗi xóa Database");
		}
            return res;
	}
   
	public int sua(ChiTietTour ctt) {
                int res = 0;
		try {
			String qry = "Update chitiettour set ";
			qry += "matour='" + ctt.getMatour()+ "'";
                        qry += ", madd='" + ctt.getMadiadiem()+ "'";
                        qry += ", thutu='" + ctt.getThutu()+ "'";
			qry += " where id='" + ctt.getId() + "'";
			MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
                        res = my.executeUpdate(qry);
		}
		catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,"Lỗi sửa Database");
		}
                return res;
	}

    public int xoaChiTietTourCoMaTour(int matour) {
        int res = 0;
		try {
			String qry = "delete from chitiettour where matour='" + matour + "'";
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
