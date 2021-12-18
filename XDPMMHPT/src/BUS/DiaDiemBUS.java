/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.DiaDiemDAO;
import DAO.TourDAO;
import DTO.DiaDiem;
import DTO.LoaiTour;
import DTO.Tour;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author xenov
 */
public class DiaDiemBUS {
    public static ArrayList<DiaDiem> ds;

   public void docDuLieu() throws Exception{
       DiaDiemDAO data = new DiaDiemDAO();
       if(ds == null){
           ds = data.docDuLieu();
       }
   }

    public int them(DiaDiem dd) {
       DiaDiemDAO dao = new DiaDiemDAO();
       int rs = dao.them(dd);
       if(rs == 1)
       {
           ds.add(dd);
       }
       return rs;
    }
     public int xoa(int vitri)
   {
       DiaDiemDAO dao = new DiaDiemDAO();
       int rs = dao.xoa(ds.get(vitri).getMadiadiem());
       if(rs == 1)
       {
           ds.remove(vitri);
       }
       return rs;
   }
    public int sua(int vitri, DiaDiem dd)
   {
       DiaDiemDAO dao = new DiaDiemDAO();
       int rs = dao.sua(dd);
       if(rs == 1)
       {
           ds.set(vitri, dd);
       }
       return rs;
   }
    public String getTenDiaDiem(int madd)
    {
        for(DTO.DiaDiem dd: ds)
        {   
            if(dd.getMadiadiem() == madd)
                    return dd.getTendiadiem();
        }
        return null;
    }
    public int getMaDiaDiem(String tendiadiem)
    {
        for(DTO.DiaDiem dd: ds)
        {   
            if(dd.getTendiadiem()== tendiadiem)
                    return dd.getMadiadiem();
        }
        return -1;
    }
   public DTO.DiaDiem getDiaDiem(int madd)
   {
       for(DiaDiem dd: ds)
       {
           if(dd.getMadiadiem() == madd)
               return dd;
       }
       return null;
   }
   public DTO.DiaDiem getDiaDiem(String tendd)
   {
       for(DiaDiem dd: ds)
       {
           if(dd.getTendiadiem()== tendd)
               return dd;
       }
       return null;
   }
    public String remindDiadiem() {
        int max = 0;
        String s ="";
        for(DiaDiem kh : ds) {
            int id = (kh.getMadiadiem());
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
