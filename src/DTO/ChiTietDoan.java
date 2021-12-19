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
public class ChiTietDoan {
    private int madoan;
    private int makhach;
    
    public ChiTietDoan(){}
    public ChiTietDoan(int madoan, int makhach) {
        this.madoan = madoan;
        this.makhach = makhach;
    }

    public int getMadoan() {
        return madoan;
    }

    public void setMadoan(int madoan) {
        this.madoan = madoan;
    }

    public int getMakhach() {
        return makhach;
    }

    public void setMakhach(int makhach) {
        this.makhach = makhach;
    }
    
    
}
