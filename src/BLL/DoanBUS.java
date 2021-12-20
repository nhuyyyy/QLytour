/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DoanDAO;
import DTO.Doan;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author xenov
 */
public class DoanBUS {
    public static List<Doan> ds;

   public void docDuLieu() throws Exception{
       DoanDAO data = new DoanDAO();
       if(ds == null){
           ds = data.docDuLieu();
       }
   }
             public void docduLieusearch(Map<String,String> d) throws Exception{
                DoanDAO nvdao= new DoanDAO();
       
                ds = nvdao.getDoan(d);
             
}
    public int them(Doan gt) {
       DoanDAO dao = new DoanDAO();
       int rs = dao.them(gt);
       if(rs == 1)
       {
           ds.add(gt);
       }
       return rs;
    }
  
     public int xoa(int vitri)
   {
       DoanDAO dao = new DoanDAO();
       int rs = dao.xoa(ds.get(vitri).getMadoan());
       if(rs == 1)
       {
           ds.remove(vitri);
       }
       return rs;
   }
    public int sua(int vitri, Doan gt)
   {
       DoanDAO dao = new DoanDAO();
       int rs = dao.sua(gt);
       if(rs == 1)
       {
           ds.set(vitri, gt);
       }
       return rs;
   }
   public int sua(Doan gt)
   {
       DoanDAO dao = new DoanDAO();
       int rs = dao.sua(gt);
       return rs;
   }
   public DTO.Doan getDoan(int madoan)
   {
       for(Doan doan:ds)
       {
           if(doan.getMadoan() == madoan)
               return doan;
       }
       return null;
   }
    public String remindMaDoan() {
        int max = 0;
        String s ="";
        for(Doan kh : ds) {
            int id = (kh.getMadoan());
            if(id > max) {
                max = id;
            }
        }
        for(int i = 0 ; i < 3-String.valueOf(max+1).length(); i++) {
            s+="0";
        }
        return s+(max+1);
    }
     public List<Doan> getDoan(Map<String,String> d) throws Exception{
              DoanDAO ddao= new DoanDAO();
              List<Doan> dsd = ddao.getDoan(d);
              return dsd;
}
}
