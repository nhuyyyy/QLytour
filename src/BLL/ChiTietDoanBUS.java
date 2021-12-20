/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.ChiTietDoanDAO;
import DAL.TourDAO;
import DTO.ChiTietDoan;
import DTO.LoaiTour;
import DTO.Tour;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author xenov
 */
public class ChiTietDoanBUS {
    public static ArrayList<ChiTietDoan> ds;

   public void docDuLieu() throws Exception{
       ChiTietDoanDAO data = new ChiTietDoanDAO();
       if(ds == null){
           ds = data.docDuLieu();
       }
   }

    public int them(ChiTietDoan ctd) {
       ChiTietDoanDAO dao = new ChiTietDoanDAO();
       int rs = dao.them(ctd);
       if(rs == 1)
       {
           ds.add(ctd);
       }
       return rs;
    }
     public int xoa(int vitri)
   {
       ChiTietDoanDAO dao = new ChiTietDoanDAO();
       int rs = dao.xoa(ds.get(vitri));
       if(rs == 1)
       {
           ds.remove(vitri);
       }
       return rs;
   }
    public int sua(int vitri, ChiTietDoan ctd)
   {
       ChiTietDoanDAO dao = new ChiTietDoanDAO();
       int rs = dao.sua(ds.get(vitri), ctd);
       if(rs == 1)
       {
           ds.set(vitri, ctd);
       }
       return rs;
   }

    public ArrayList<DTO.ChiTietDoan> findMaDoan(int madoan) {
        ArrayList<ChiTietDoan> array = new ArrayList<ChiTietDoan>();
        for(ChiTietDoan ctd:this.ds)
        {
            if(ctd.getMadoan() == madoan)
                array.add(ctd);
        }
        return array;
    }

    public void xoaKhachCoMaDoan(int madoan) {
        
        ChiTietDoanDAO dao  = new ChiTietDoanDAO();
        int rs = dao.xoaKhachcoMaDoan(madoan);
        if(rs == 1)
        {
            try {
                ds = dao.docDuLieu();
            } catch (Exception ex) {
                Logger.getLogger(ChiTietDoanBUS.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public int themAutoPrimaryKey(ArrayList<ChiTietDoan> array)
    {
        ChiTietDoanDAO dao  = new ChiTietDoanDAO();
        int rs = 0;
        for(ChiTietDoan ctd:array)
        {
            rs += dao.them(ctd);
        }
        if(rs == array.size())
        {
            try {
                ds = dao.docDuLieu();
                return 1;
            } catch (Exception ex) {
                Logger.getLogger(ChiTietDoanBUS.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return 0;
    }
}
