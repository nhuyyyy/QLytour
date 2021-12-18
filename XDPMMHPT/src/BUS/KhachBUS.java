/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.KhachDAO;
import DTO.Khach;
import java.util.ArrayList;

/**
 *
 * @author xenov
 */
public class KhachBUS {
   public static ArrayList<Khach> ds;

   public void docDuLieu() throws Exception{
       KhachDAO data = new KhachDAO();
       if(ds == null){
           ds = data.docDuLieu();
       }
   }

    public int them(Khach dd) {
       KhachDAO dao = new KhachDAO();
       int rs = dao.them(dd);
       if(rs == 1)
       {
           ds.add(dd);
       }
       return rs;
    }
     public int xoa(int vitri)
   {
       KhachDAO dao = new KhachDAO();
       int rs = dao.xoa(ds.get(vitri).getMakhach());
       if(rs == 1)
       {
           ds.remove(vitri);
       }
       return rs;
   }
    public int sua(int vitri, Khach dd)
   {
       KhachDAO dao = new KhachDAO();
       int rs = dao.sua(dd);
       if(rs == 1)
       {
           ds.set(vitri, dd);
       }
       return rs;
   }

    public DTO.Khach getKhach(int makhach) {
        for(Khach kh:ds)
        {
            if(kh.getMakhach() == makhach)
                   return kh;
        }
        return null;
    }
     public String remindKhachhang() {
        int max = 0;
        String s ="";
        for(Khach kh : ds) {
            int id = (kh.getMakhach());
            if(id > max) {
                max = id;
            }
        }
        for(int i = 0 ; i < 3-String.valueOf(max+1).length(); i++) {
            s+="0";
        }
        return s+(max+1);
    }
}
