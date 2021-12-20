/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.LoaiTourDAO;
import DTO.LoaiTour;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author xenov
 */
public class LoaiTourBUS {
     public static List<LoaiTour>ds;
   
   public void docDuLieu() throws Exception{
       LoaiTourDAO data = new LoaiTourDAO();
       if(ds == null){
           ds = data.docDuLieu();
       }
   }
   public void docduLieusearch(Map<String,String> nv) throws Exception{
               LoaiTourDAO nvdao= new LoaiTourDAO();
       
                ds = nvdao.getLoaiTour(nv);
             
}
   public int them(LoaiTour tour)
   {
       LoaiTourDAO dao = new LoaiTourDAO();
       int rs = dao.them(tour);
       if(rs == 1)
       {
           ds.add(tour);
       }
       return rs;
   }
   public int xoa(int vitri)
   {
       LoaiTourDAO dao = new LoaiTourDAO();
       int rs = dao.xoa(ds.get(vitri).getMaloaitour());
       if(rs == 1)
       {
           ds.remove(vitri);
       }
       return rs;
   }
    public int sua(int vitri, LoaiTour lt)
   {
       LoaiTourDAO dao = new LoaiTourDAO();
       int rs = dao.sua(lt);
       if(rs == 1)
       {
           ds.set(vitri, lt);
       }
       return rs;
   }
    public String getTenLoaiTour(int maloaitour) throws Exception
   {
       for(LoaiTour lt : ds)
       {
           if(lt.getMaloaitour() == maloaitour)
               return lt.getTenloaitour();
       }
       return "";
   }
   public int getMaLoaiTour(String tenloaitour) throws Exception
   {
       for(LoaiTour lt : ds)
       {
           if(lt.getTenloaitour().equals(tenloaitour))
               return lt.getMaloaitour();
       }
       return 1;
   }
   
    public String remindMaloaitour() {
        int max = 0;
        String s ="";
        for(LoaiTour kh : ds) {
            int id = (kh.getMaloaitour());
            if(id > max) {
                max = id;
            }
        }
        for(int i = 0 ; i < 3-String.valueOf(max+1).length(); i++) {
            s+="0";
        }
        return s+(max+1);
}
    public List<LoaiTour> getLoaiTour(Map<String,String> nv) throws Exception{
              LoaiTourDAO nvdao= new LoaiTourDAO();
              List<LoaiTour> dsnv = nvdao.getLoaiTour(nv);
              return dsnv;
}
}
