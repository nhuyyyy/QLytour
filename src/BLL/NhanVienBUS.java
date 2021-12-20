/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.NhanVienDAO;
import DTO.NhanVien;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author xenov
 */
public class NhanVienBUS {
    public static List<NhanVien> ds;

   public void docDuLieu() throws Exception{
       NhanVienDAO data = new NhanVienDAO();
       if(ds == null){
           ds = data.docDuLieu();
       }
   }
    public void docduLieusearch(Map<String,String> nv) throws Exception{
                 NhanVienDAO nvdao= new NhanVienDAO();
       
                ds = nvdao.getNhanVien(nv);
             
}
    public int them(NhanVien dd) {
       NhanVienDAO dao = new NhanVienDAO();
       int rs = dao.them(dd);
       if(rs == 1)
       {
           ds.add(dd);
       }
       return rs;
    }
     public int xoa(int vitri)
   {
       NhanVienDAO dao = new NhanVienDAO();
       int rs = dao.xoa(ds.get(vitri).getManhanvien());
       if(rs == 1)
       {
           ds.remove(vitri);
       }
       return rs;
   }
    public int sua(int vitri, NhanVien dd)
   {
       NhanVienDAO dao = new NhanVienDAO();
       int rs = dao.sua(dd);
       if(rs == 1)
       {
           ds.set(vitri, dd);
       }
       return rs;
   }
    public DTO.NhanVien getNhanVien(int manv)
    {
        for(NhanVien nv: ds)
        {
            if(nv.getManhanvien() == manv)
                   return nv;
        }
        return null;
    }
      public String remindManhanvien() {
        int max = 0;
        String s ="";
        for(NhanVien kh : ds) {
            int id = (kh.getManhanvien());
            if(id > max) {
                max = id;
            }
        }
        for(int i = 0 ; i < 3-String.valueOf(max+1).length(); i++) {
            s+="0";
        }
        return s+(max+1);
    }
      public List<NhanVien> getNhanvien(Map<String,String> nv) throws Exception{
              NhanVienDAO nvdao= new NhanVienDAO();
              List<NhanVien> dsnv = nvdao.getNhanVien(nv);
              return dsnv;
}
}
