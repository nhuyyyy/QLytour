/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.ChiTietTourDAO;
import DTO.ChiTietTour;
import DTO.DiaDiem;
import DTO.GiaTour;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author xenov
 */
public class ChiTietTourBUS {
   public static ArrayList<ChiTietTour> ds;

   public void docDuLieu() throws Exception{
       ChiTietTourDAO data = new ChiTietTourDAO();
       if(ds == null){
           ds = data.docDuLieu();
       }
   }
  
    public int them(ChiTietTour ctt) {
       ChiTietTourDAO dao = new ChiTietTourDAO();
       int rs = dao.them(ctt);
       if(rs == 1)
       {
           ds.add(ctt);
       }
       return rs;
    }
   
     public int xoa(int vitri)
   {
       ChiTietTourDAO dao = new ChiTietTourDAO();
       int rs = dao.xoa(ds.get(vitri).getId());
       if(rs == 1)
       {
           ds.remove(vitri);
       }
       return rs;
   }
    public int sua(int vitri, ChiTietTour ctt)
   {
       ChiTietTourDAO dao = new ChiTietTourDAO();
       int rs = dao.sua(ctt);
       if(rs == 1)
       {
           ds.set(vitri, ctt);
       }
       return rs;
   }
    public ArrayList<ChiTietTour> getChiTietTourTheoMatour(int matour)
    {
        ArrayList<ChiTietTour> array = new ArrayList<ChiTietTour>();
        for(ChiTietTour ctt: ds)
        {
            if(ctt.getMatour() == matour)
                array.add(ctt);
        }
        return array;
    }

    public int xoaChiTietTourCoMaTour(int matour) {
       ChiTietTourDAO dao = new ChiTietTourDAO();
       int rs = dao.xoaChiTietTourCoMaTour(matour);
       if(rs == 1)
       {
           try {
               ds = dao.docDuLieu();
           } catch (Exception ex) {
               Logger.getLogger(ChiTietTourBUS.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       return rs;
    }

    public int themAutoPrimaryKey(int matour, ArrayList<DiaDiem> arrayDiaDiem) {
       ChiTietTourDAO dao = new ChiTietTourDAO();
       int thutu = 1;
       int res = 0;
       for(DiaDiem dd:arrayDiaDiem)
       {
           ChiTietTour ctt = new ChiTietTour();
           ctt.setId(0);
           ctt.setMatour(matour);
           ctt.setMadiadiem(dd.getMadiadiem());
           ctt.setThutu(thutu);
           thutu++;
           res += dao.them(ctt);
       }
       if(res == arrayDiaDiem.size()) return 1;
       else return 0;
    }
     public String remindctt() {
        int max = 0;
        String s ="";
        for(ChiTietTour kh : ds) {
            int id = (kh.getId());
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
