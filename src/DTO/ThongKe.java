/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Admin
 */
public class ThongKe {
    private String soDoan;
    private String soTour;
    private String soKhach;
    private String ten;
    
    public ThongKe(){
        
    }   

    public ThongKe(String soDoan, String soTour, String soKhach) {
        this.soDoan = soDoan;
        this.soTour = soTour;
        this.soKhach = soKhach;
    }

    public String getSoDoan() {
        return soDoan;
    }

    public String getSoTour() {
        return soTour;
    }

    public String getSoKhach() {
        return soKhach;
    }

    public String getTen() {
        return ten;
    }
    
    public void setSoDoan(String soDoan) {
        this.soDoan = soDoan;
    }

    public void setSoTour(String soTour) {
        this.soTour = soTour;
    }

    public void setSoKhach(String soKhach) {
        this.soKhach = soKhach;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
