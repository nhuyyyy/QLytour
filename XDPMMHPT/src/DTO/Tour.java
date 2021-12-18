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
public class Tour {
    private int matour;
    private int maloaitour;
    private String tentour;
    
    public Tour(){}
    public Tour(int matour, int maloaitour, String tentour) {
        this.matour = matour;
        this.maloaitour = maloaitour;
        this.tentour = tentour;
    }

    public int getMatour() {
        return matour;
    }

    public void setMatour(int matour) {
        this.matour = matour;
    }

    public int getMaloaitour() {
        return maloaitour;
    }

    public void setMaloaitour(int maloaitour) {
        this.maloaitour = maloaitour;
    }

    public String getTentour() {
        return tentour;
    }

    public void setTentour(String tentour) {
        this.tentour = tentour;
    }
    
    
}
