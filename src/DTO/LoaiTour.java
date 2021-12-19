/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author xenov
 */
public class LoaiTour {
    private int maloaitour;
    private String tenloaitour;
    
    public LoaiTour(){}
    public LoaiTour(int maloaitour, String tenloaitour) {
        this.maloaitour = maloaitour;
        this.tenloaitour = tenloaitour;
    }

    public int getMaloaitour() {
        return maloaitour;
    }

    public void setMaloaitour(int maloaitour) {
        this.maloaitour = maloaitour;
    }

    public String getTenloaitour() {
        return tenloaitour;
    }

    public void setTenloaitour(String tenloaitour) {
        this.tenloaitour = tenloaitour;
    }

   
}
