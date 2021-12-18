/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.NhanVienTrongDoanDAO;
import DTO.NhanVien;
import DTO.NhanVienTrongDoan;
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
public class NhanVienTrongDoanBUS {
     public static ArrayList<NhanVienTrongDoan>ds;

   
   
   public void docDuLieu() throws Exception{
       NhanVienTrongDoanDAO data = new NhanVienTrongDoanDAO();
       if(ds == null){
           ds = data.docDuLieu();
       }
   }
   public int Them(ArrayList<NhanVienTrongDoan> array)
   {
       NhanVienTrongDoanDAO dao = new NhanVienTrongDoanDAO();
       int rs = 0;
       for(NhanVienTrongDoan nv : array)
       {
           rs += dao.them(nv);
       }
       if(rs == array.size())
       {
           try {
               ds = dao.docDuLieu();
               return 1;
           } catch (Exception ex) {
               Logger.getLogger(NhanVienTrongDoanBUS.class.getName()).log(Level.SEVERE, null, ex);
           }
           
       }
       return 0;
   }
   public int xoaNhanVienCoMaDoan(int madoan)
   {
       NhanVienTrongDoanDAO dao = new NhanVienTrongDoanDAO();
       int rs = dao.xoaNhanVienCoMaDoan(madoan);
       if(rs == 1)
       {
           try {
               ds = dao.docDuLieu();
           } catch (Exception ex) {
               Logger.getLogger(NhanVienTrongDoanBUS.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       return rs;
   }

    public ArrayList<NhanVienTrongDoan> findMaDoan(int madoan) {
        ArrayList<NhanVienTrongDoan> arrayNv = new ArrayList<NhanVienTrongDoan>();
        for(DTO.NhanVienTrongDoan nv  : ds)
        {
            if(nv.getMadoan() == madoan)
                    arrayNv.add((nv));
        }
        return arrayNv;
    }
}
