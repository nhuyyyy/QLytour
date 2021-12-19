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
public class ChiPhi {
    private int machiphi;
    private int maloaichiphi;
    private int madoan;
    private int giatien;
    
    
    public ChiPhi(int machiphi, int maloaichiphi, int madoan, int giatien) {
        this.machiphi = machiphi;
        this.maloaichiphi = maloaichiphi;
        this.madoan = madoan;
        this.giatien = giatien;
    }

    public ChiPhi() {
        
    }

    public int getMachiphi() {
        return machiphi;
    }

    public void setMachiphi(int machiphi) {
        this.machiphi = machiphi;
    }

    public int getMaloaichiphi() {
        return maloaichiphi;
    }

    public void setMaloaichiphi(int maloaichiphi) {
        this.maloaichiphi = maloaichiphi;
    }

    public int getMadoan() {
        return madoan;
    }

    public void setMadoan(int madoan) {
        this.madoan = madoan;
    }

    public int getGiatien() {
        return giatien;
    }

    public void setGiatien(int giatien) {
        this.giatien = giatien;
    }
    
}
