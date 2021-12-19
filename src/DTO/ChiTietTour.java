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
public class ChiTietTour {
    private int id;
    private int matour;
    private int madiadiem;
    private int thutu;
    
    public ChiTietTour(){}
    public ChiTietTour(int id, int matour, int madiadiem, int thutu) {
        this.id = id;
        this.matour = matour;
        this.madiadiem = madiadiem;
        this.thutu = thutu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMatour() {
        return matour;
    }

    public void setMatour(int matour) {
        this.matour = matour;
    }

    public int getMadiadiem() {
        return madiadiem;
    }

    public void setMadiadiem(int madiadiem) {
        this.madiadiem = madiadiem;
    }

    public int getThutu() {
        return thutu;
    }

    public void setThutu(int thutu) {
        this.thutu = thutu;
    }

    
}
