/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.TourDAO;
import DTO.LoaiTour;
import DTO.Tour;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author xenov
 */
public class TourBUS {
   public static List<Tour> ds;

    public static void setComboboxValues(JComboBox<String> cbLoaiTour) throws Exception {
        
        LoaiTourBUS loaiTourBus = new LoaiTourBUS();
        loaiTourBus.docDuLieu();
        List<LoaiTour> arrayListLoaiTour = loaiTourBus.ds;
        Vector vector = new Vector();
        for(LoaiTour lt : arrayListLoaiTour)
        {
            vector.add(lt.getTenloaitour());
        }
        cbLoaiTour.setModel(new DefaultComboBoxModel(vector));
    }
   
   public void docDuLieu() throws Exception{
       TourDAO data = new TourDAO();
       if(ds == null){
           ds = data.docDuLieu();
       }
   }
       public void docduLieusearch(Map<String,String> nv) throws Exception{
                 TourDAO tdao= new TourDAO();
       
                ds = tdao.getTour(nv);
             
}
   public int Them(Tour tour)
   {
       TourDAO dao = new TourDAO();
       int rs = dao.them(tour);
       if(rs == 1)
       {
           ds.add(tour);
       }
       return rs;
   }
   public int xoa(int vitri)
   {
       TourDAO dao = new TourDAO();
       int rs = dao.xoa(ds.get(vitri).getMatour());
       if(rs == 1)
       {
           ds.remove(vitri);
       }
       return rs;
   }
   public String getTenLoaiTour(int maloaitour) throws Exception
   {
       LoaiTourBUS loaiTourBus = new LoaiTourBUS();
       loaiTourBus.docDuLieu();
       return loaiTourBus.getTenLoaiTour(maloaitour);
   }
   public int getMaLoaiTour(String tenloaitour) throws Exception
   {
       LoaiTourBUS loaiTourBus = new LoaiTourBUS();
       loaiTourBus.docDuLieu();
       return loaiTourBus.getMaLoaiTour(tenloaitour);
   }

    public DTO.Tour find(int matour) throws Exception {
        System.out.println("BUS:" + matour);
        TourDAO dao = new TourDAO();
        return dao.find(matour);
    }
    public int sua(Tour tour)
   {
       TourDAO dao = new TourDAO();
       int rs = dao.sua(tour);
       if(rs == 1)
       {
           try {
               this.docDuLieu();
           } catch (Exception ex) {
               Logger.getLogger(TourBUS.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       return rs;
   }
             public List<Tour> getTour(Map<String,String> t) throws Exception {
              TourDAO tdao = new TourDAO();
              List<Tour> dst = tdao.getTour(t);
              return dst;
}
     public String remindMatour() {
        int max = 0;
        String s ="";
        for(Tour kh : ds) {
            int id = (kh.getMatour());
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
