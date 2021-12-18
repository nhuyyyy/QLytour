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
public class Khach {
    private int makhach;
    private String tenkhach;
    private Date ngaysinh;
    private int cmnd;

    public Khach(int makhach, String tenkhach, Date ngaysinh, int cmnd) {
        this.makhach = makhach;
        this.tenkhach = tenkhach;
        this.ngaysinh = ngaysinh;
        this.cmnd = cmnd;
    }

    public Khach() {
        
    }

    public int getMakhach() {
        return makhach;
    }

    public void setMakhach(int makhach) {
        this.makhach = makhach;
    }

    public String getTenkhach() {
        return tenkhach;
    }

    public void setTenkhach(String tenkhach) {
        this.tenkhach = tenkhach;
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
