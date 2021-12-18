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
public class NhanVienTrongDoan {
    private int madoan;
    private int manhanvien;
    private String nhiemvu;

    public NhanVienTrongDoan(int madoan, int manhanvien, String nhiemvu) {
        this.madoan = madoan;
        this.manhanvien = manhanvien;
        this.nhiemvu = nhiemvu;
    }

    public NhanVienTrongDoan() {
        
    }

    public int getMadoan() {
        return madoan;
    }

    public void setMadoan(int madoan) {
        this.madoan = madoan;
    }

    public int getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(int manhanvien) {
        this.manhanvien = manhanvien;
    }

    public String getNhiemvu() {
        return nhiemvu;
    }

    public void setNhiemvu(String nhiemvu) {
        this.nhiemvu = nhiemvu;
    }

    
    
}
