/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.ChiPhiDAO;
import DTO.LoaiChiPhi;
import DTO.ChiPhi;
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
public class ChiPhiBUS {
     public static ArrayList<ChiPhi>ds;

  
   public void docDuLieu() throws Exception{
       ChiPhiDAO data = new ChiPhiDAO();
       if(ds == null){
           ds = data.docDuLieu();
       }
   }
   public int Them(ChiPhi chiphi)
   {
       ChiPhiDAO dao = new ChiPhiDAO();
       int rs = dao.them(chiphi);
       if(rs == 1)
       {
           ds.add(chiphi);
       }
       return rs;
   }
   public int ThemAutoPrimaryKey(ArrayList<ChiPhi> array)
   {
       ChiPhiDAO dao = new ChiPhiDAO();
       int rs = 0;
       for(ChiPhi cp:array)
       {
           rs += dao.themAutoPrimaryKey(cp);
       }
       if(rs == array.size()){
           try {
               ds = dao.docDuLieu();
           } catch (Exception ex) {
               Logger.getLogger(ChiPhiBUS.class.getName()).log(Level.SEVERE, null, ex);
           }
           return 1;
       }
       return 0;
   }
   public int xoa(int vitri)
   {
       ChiPhiDAO dao = new ChiPhiDAO();
       int rs = dao.xoa(ds.get(vitri).getMachiphi());
       if(rs == 1)
       {
           ds.remove(vitri);
       }
       return rs;
   }
  public int xoaChiPhiCoMaDoan(int madoan)
   {
       ChiPhiDAO dao = new ChiPhiDAO();
       int rs = dao.xoaChiPhiCoMaDoan(madoan);
       if(rs == 1)
       {
           try {
               ds = dao.docDuLieu();
           } catch (Exception ex) {
               Logger.getLogger(ChiPhiBUS.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       return rs;
   }

    public DTO.ChiPhi find(int machiphi) throws Exception {
       
        ChiPhiDAO dao = new ChiPhiDAO();
        return dao.find(machiphi);
    }
    public ArrayList<DTO.ChiPhi> findMaDoan(int madoan) {

        ArrayList<DTO.ChiPhi> arrayChiPhi  = new ArrayList();
        for(DTO.ChiPhi cp : this.ds)
        {
            if(cp.getMadoan() == madoan)
                arrayChiPhi.add(cp);
        }
        return arrayChiPhi;
    }
    public int sua(ChiPhi chiphi)
   {
       ChiPhiDAO dao = new ChiPhiDAO();
       int rs = dao.sua(chiphi);
       if(rs == 1)
       {
           try {
               this.docDuLieu();
           } catch (Exception ex) {
               Logger.getLogger(ChiPhiBUS.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       return rs;
   }
     public String remindChiphi() {
        int max = 0;
        String s ="";
        for(ChiPhi kh : ds) {
            int id = (kh.getMachiphi());
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
