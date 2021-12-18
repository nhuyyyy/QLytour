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
public class Doan {
    private int madoan;
    private Date nbd;
    private Date nkt;
    private int matour;

    public Doan(int madoan, Date nbd, Date nkt, int matour) {
        this.madoan = madoan;
        this.nbd = nbd;
        this.nkt = nkt;
        this.matour = matour;
    }

    public Doan() {
        
    }

    public int getMadoan() {
        return madoan;
    }

    public void setMadoan(int madoan) {
        this.madoan = madoan;
    }

    public Date getNbd() {
        return nbd;
    }

    public void setNbd(Date nbd) {
        this.nbd = nbd;
    }

    public Date getNkt() {
        return nkt;
    }

    public void setNkt(Date nkt) {
        this.nkt = nkt;
    }

    public int getMatour() {
        return matour;
    }

    public void setMatour(int matour) {
        this.matour = matour;
    }
    
}
