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
public class DiaDiem {
    private int madiadiem;
    private String tendiadiem;
    
    public DiaDiem(){}
    public DiaDiem(int madiadiem, String tendiadiem) {
        this.madiadiem = madiadiem;
        this.tendiadiem = tendiadiem;
    }

    public int getMadiadiem() {
        return madiadiem;
    }

    public void setMadiadiem(int madiadiem) {
        this.madiadiem = madiadiem;
    }

    public String getTendiadiem() {
        return tendiadiem;
    }

    public void setTendiadiem(String tendiadiem) {
        this.tendiadiem = tendiadiem;
    }
    
}
