/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.NhanVien;
import DTO.NhanVien;
import Data.MyDataAccess;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author xenov
 */
public class NhanVienDAO {
  public ArrayList<NhanVien> docDuLieu() throws Exception{
		ArrayList<NhanVien> ds = new ArrayList<NhanVien>();
                MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
		try {
			String qry = "select * from nhanvien";
			ResultSet rs = my.executeQuery(qry);
			while(rs.next()) {
				NhanVien nhanvien = new NhanVien();
				nhanvien.setManhanvien(rs.getInt(1));
                                nhanvien.setTennhanvien(rs.getString(2));
                                nhanvien.setNgaysinh(rs.getDate(3));
                                nhanvien.setCmnd(rs.getInt(4));
				ds.add(nhanvien);
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
    public int them(NhanVien nhanvien) {
              
                    int res = 0;
                    try {
                        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
                        MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
			String qry = "Insert into nhanvien Value(";
			qry += "'" + nhanvien.getManhanvien() + "'";
			qry += ",'" + nhanvien.getTennhanvien() + "'";
                        qry += ",'" + format.format(nhanvien.getNgaysinh()) + "'";
                        qry += ",'" + nhanvien.getCmnd() + "'";
			qry += ")";
			res = my.executeUpdate(qry);
                        }
                        catch(Exception e) {
                                System.out.println(e);
                                JOptionPane.showMessageDialog(null,"Lỗi thêm vào Database");
                        }
                    return res;
    }
   
    public int xoa(int manhanvien) {
            int res = 0;
		try {
			String qry = "delete from nhanvien where manv='" + manhanvien + "'";
			MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
                        res = my.executeUpdate(qry);
		}
		catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,"Lỗi xóa Database");
		}
            return res;
	}
   
	public int sua(NhanVien nhanvien) {
                int res = 0;
		try {
                        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String qry = "Update nhanvien set ";
			qry += "tennv='"+ nhanvien.getTennhanvien() + "'";
                        qry += ",ngaysinh='"+ dateFormat.format(nhanvien.getNgaysinh())+ "'";
                        qry += ",cmnd='"+ nhanvien.getCmnd() + "'";
                       
			qry += " where manv='" + nhanvien.getManhanvien() + "'";
			MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
                        res = my.executeUpdate(qry);
		}
		catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,"Lỗi sửa Database");
		}
                return res;
	}
        public List<NhanVien> getNhanVien(Map<String,String> nv)throws Exception{
               List<NhanVien> ds = new ArrayList<NhanVien>();
              MyDataAccess my = new MyDataAccess("localhost","root","","qltour");
		try {
			StringBuffer query = new StringBuffer("Select * from nhanvien where 1=1");
                        if(nv.get("Manhanvien")!= null && !nv.get("Manhanvien").equals("")){
                            query.append(" and manv = "+nv.get("Manhanvien"));
                        }
                        if(nv.get("tennhanvien")!= null&& !nv.get("tennhanvien").equals("")){
                            query.append(" and tennv = '"+nv.get("tennhanvien")+"'");
                            
                        }
                        System.out.println(query.toString());
			ResultSet rs = my.executeQuery(query.toString());
			while(rs.next()) {
				NhanVien nhanvien = new NhanVien();
				nhanvien.setManhanvien(rs.getInt(1));
                                nhanvien.setTennhanvien(rs.getString(2));
                                nhanvien.setNgaysinh(rs.getDate(3));
                                nhanvien.setCmnd(rs.getInt(4));
				ds.add(nhanvien);
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
