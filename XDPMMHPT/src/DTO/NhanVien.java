/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Date;

/**
 *
 * @author xenov
 */
public class NhanVien {
    private int manhanvien;
    private String tennhanvien;
    private Date ngaysinh;
    private int cmnd;

    public NhanVien(int manhanvien, String tennhanvien, Date ngaysinh, int cmnd) {
        this.manhanvien = manhanvien;
        this.tennhanvien = tennhanvien;
        this.ngaysinh = ngaysinh;
        this.cmnd = cmnd;
    }

    public NhanVien() {
        
    }

    public int getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(int manhanvien) {
        this.manhanvien = manhanvien;
    }

    public String getTennhanvien() {
        return tennhanvien;
    }

    public void setTennhanvien(String tennhanvien) {
        this.tennhanvien = tennhanvien;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }
    
    
}
