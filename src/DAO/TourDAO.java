/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.LoaiTour;
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
public class TourDAO {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
	public ArrayList<Tour> docDuLieu() throws Exception{
		ArrayList<Tour> ds = new ArrayList<Tour>();
                MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
		try {
			String qry = "select * from tour";
			ResultSet rs = my.executeQuery(qry);
			while(rs.next()) {
				Tour tour = new Tour();
				tour.setMatour(rs.getInt(1));
				tour.setMaloaitour(rs.getInt(2));
				tour.setTentour(rs.getString(3));
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
    public DTO.Tour find(int maTour) throws Exception
    {
        System.out.println(maTour);
        DTO.Tour tour =  null;
        MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
		try {
			String qry = "select * from tour where matour=" + maTour + "";
			ResultSet rs = my.executeQuery(qry);
			while(rs.next()) {
				tour = new DTO.Tour();
				tour.setMatour(rs.getInt(1));
				tour.setMaloaitour(rs.getInt(2));
				tour.setTentour(rs.getString(3));
			}
		}catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,"Lỗi đọc Database");
		}
                finally{
                    my.close();
                }
        if(tour == null)
               System.out.println("DAO bi loi ko tim duoc tour");
        return tour;
    }
    public int them(Tour nv) {
              
                    int res = 0;
                    try {
                        MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
			String qry = "Insert into tour Value(";
			qry += "'" + nv.getMatour()+ "'";
			qry += ",'" + nv.getMaloaitour()+ "'";
                        qry += ",'" + nv.getTentour() + "'";
			qry += ",'" + 0 + "')";
			res = my.executeUpdate(qry);
                        }
                        catch(Exception e) {
                                System.out.println(e);
                                JOptionPane.showMessageDialog(null,"Lỗi thêm vào Database");
                        }
                    return res;
    }
    public int xoa(int matour) {
            int res = 0;
		try {
			String qry = "delete from tour where matour='" + matour + "'";
			MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
                        res = my.executeUpdate(qry);
		}
		catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,"Lỗi xóa Database");
		}
            return res;
	}
   
	public int sua(Tour tour) {
                int res = 0;
		try {
			String qry = "Update tour set ";
			qry += "maloaitour='" + tour.getMaloaitour()+ "',";
                        qry += "tentour='" + tour.getTentour()+ "'";
			qry += " where matour='" + tour.getMatour()+ "'";
			MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
                        res = my.executeUpdate(qry);
		}
		catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,"Lỗi sửa Database");
		}
                return res;
	}
                public List<Tour> getTour(Map<String,String> nv)throws Exception{
               List<Tour> ds = new ArrayList<Tour>();
              MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
		try {
			StringBuffer query = new StringBuffer("Select * from tour where 1=1");
                        if(nv.get("Matour")!= null && !nv.get("Matour").equals("")){
                            query.append(" and matour = "+nv.get("Matour"));
                        }
                        if(nv.get("tentour")!= null&& !nv.get("tentour").equals("")){
                            query.append(" and tentour ="+nv.get("tentour"));
                            
                        }
                        System.out.println(query.toString());
			ResultSet rs = my.executeQuery(query.toString());
			while(rs.next()) {
				Tour tour = new Tour();
				tour.setMatour(rs.getInt(1));
				tour.setMaloaitour(rs.getInt(2));
				tour.setTentour(rs.getString(3));
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
