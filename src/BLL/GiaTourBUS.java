/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.GiaTourDAO;
import DTO.GiaTour;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author xenov
 */
public class GiaTourBUS {
   public static ArrayList<GiaTour> ds;

   public void docDuLieu() throws Exception{
       GiaTourDAO data = new GiaTourDAO();
       if(ds == null){
           ds = data.docDuLieu();
       }
   }
   public ArrayList<DTO.GiaTour> getDSGia(int matour)
   {
       ArrayList<DTO.GiaTour> arr = new ArrayList<DTO.GiaTour>();
       for(DTO.GiaTour gt : this.ds)
       {
           if(gt.getMatour() == matour)
               arr.add(gt);
       }
       return arr;
   }
    public int them(GiaTour gt) {
       GiaTourDAO dao = new GiaTourDAO();
       int rs = dao.them(gt);
       if(rs == 1)
       {
           ds.add(gt);
       }
       return rs;
    }
    public int themAutoPrimaryKey(ArrayList<DTO.GiaTour> arr) {
       GiaTourDAO dao = new GiaTourDAO();
       int rs = 0;
       for(DTO.GiaTour gt : arr)
       {
           rs += dao.themAutoPrimaryKey(gt);
       }
       if(rs == arr.size())
       {
           try {
               this.docDuLieu();
           } catch (Exception ex) {
               Logger.getLogger(GiaTourBUS.class.getName()).log(Level.SEVERE, null, ex);
           }
           return 1;
       }
       return 0;
    }
     public int xoa(int vitri)
   {
       GiaTourDAO dao = new GiaTourDAO();
       int rs = dao.xoa(ds.get(vitri).getMagia());
       if(rs == 1)
       {
           ds.remove(vitri);
       }
       return rs;
   }
    public int sua(int vitri, GiaTour gt)
   {
       GiaTourDAO dao = new GiaTourDAO();
       int rs = dao.sua(gt);
       if(rs == 1)
       {
           ds.set(vitri, gt);
       }
       return rs;
   }
    public int xoaGiaCoMaTour(int matour)
    {
       GiaTourDAO dao = new GiaTourDAO();
       int rs = dao.xoaGiaCoMaTour(matour);
       if(rs == 1)
       {
           try {
               this.docDuLieu();
           } catch (Exception ex) {
               Logger.getLogger(GiaTourBUS.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       return rs;
    }
     public String remindGia() {
        int max = 0;
        String s ="";
        for(GiaTour kh : ds) {
            int id = (kh.getMagia());
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
