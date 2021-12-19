/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.LoaiChiPhiDAO;
import DAO.TourDAO;
import DTO.LoaiChiPhi;
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
public class LoaiChiPhiBUS {
    public static ArrayList<LoaiChiPhi> ds;

   public void docDuLieu() throws Exception{
       LoaiChiPhiDAO data = new LoaiChiPhiDAO();
       if(ds == null){
           ds = data.docDuLieu();
       }
   }

    public int them(LoaiChiPhi cp) {
       LoaiChiPhiDAO dao = new LoaiChiPhiDAO();
       int rs = dao.them(cp);
       if(rs == 1)
       {
           ds.add(cp);
       }
       return rs;
    }
     public int xoa(int vitri)
   {
       LoaiChiPhiDAO dao = new LoaiChiPhiDAO();
       int rs = dao.xoa(ds.get(vitri).getMaloaichiphi());
       if(rs == 1)
       {
           ds.remove(vitri);
       }
       return rs;
   }
    public int sua(int vitri, LoaiChiPhi cp)
   {
       LoaiChiPhiDAO dao = new LoaiChiPhiDAO();
       int rs = dao.sua(cp);
       if(rs == 1)
       {
           ds.set(vitri, cp);
       }
       return rs;
   }
    public String getTenLoaiChiPhi(int malcp)
    {
        for(DTO.LoaiChiPhi cp: ds)
        {   
            if(cp.getMaloaichiphi() == malcp)
                    return cp.getTenloaichiphi();
        }
        return null;
    }
    public int getMaLoaiChiPhi(String tenloaichiphi)
    {
        for(DTO.LoaiChiPhi cp: ds)
        {   
            if(cp.getTenloaichiphi()== tenloaichiphi)
                    return cp.getMaloaichiphi();
        }
        return -1;
    }
   public DTO.LoaiChiPhi getLoaiChiPhi(int malcp)
   {
       for(LoaiChiPhi cp: ds)
       {
           if(cp.getMaloaichiphi() == malcp)
               return cp;
       }
       return null;
   }
   public DTO.LoaiChiPhi getLoaiChiPhi(String tenlcp)
   {
       for(LoaiChiPhi cp: ds)
       {
           if(cp.getTenloaichiphi()== tenlcp)
               return cp;
       }
       return null;
   }
    public String remindMaloaichiphi() {
        int max = 0;
        String s ="";
        for(LoaiChiPhi kh : ds) {
            int id = (kh.getMaloaichiphi());
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
