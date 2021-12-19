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
public class GiaTour {
    private int magia;
    private int matour;
    private double giatien;
    private Date tgbd;
    private Date tgkt;

    public GiaTour(int magia, int matour, double giatien, Date tgbd, Date tgkt) {
        this.magia = magia;
        this.matour = matour;
        this.giatien = giatien;
        this.tgbd = tgbd;
        this.tgkt = tgkt;
    }

    public GiaTour() {
        
    }

    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }

    public int getMatour() {
        return matour;
    }

    public void setMatour(int matour) {
        this.matour = matour;
    }

    public double getGiatien() {
        return giatien;
    }

    public void setGiatien(double giatien) {
        this.giatien = giatien;
    }

    public Date getTgbd() {
        return tgbd;
    }

    public void setTgbd(Date tgbd) {
        this.tgbd = tgbd;
    }

    public Date getTgkt() {
        return tgkt;
    }

    public void setTgkt(Date tgkt) {
        this.tgkt = tgkt;
    }
    
    
}
