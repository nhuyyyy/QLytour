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
public class LoaiChiPhi {
    private int maloaichiphi;
    private String tenloaichiphi;
    
    public LoaiChiPhi(){}
    public LoaiChiPhi(int maloaichiphi, String tenloaichiphi) {
        this.maloaichiphi = maloaichiphi;
        this.tenloaichiphi = tenloaichiphi;
    }

    public int getMaloaichiphi() {
        return maloaichiphi;
    }

    public void setMaloaichiphi(int maloaichiphi) {
        this.maloaichiphi = maloaichiphi;
    }

    public String getTenloaichiphi() {
        return tenloaichiphi;
    }

    public void setTenloaichiphi(String tenloaichiphi) {
        this.tenloaichiphi = tenloaichiphi;
    }
    
}
