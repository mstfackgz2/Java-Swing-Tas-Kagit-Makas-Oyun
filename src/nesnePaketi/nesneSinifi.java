/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nesnePaketi;

/**
 *
 * @author AsuS
 */
public abstract class nesneSinifi {
    public int seviyePuani=0;
    public double dayaniklilik=20;

    public nesneSinifi() {
    }
    
    public nesneSinifi(double dayaniklilik,int seviyePuani) {
        this.dayaniklilik= dayaniklilik;
        this.seviyePuani=seviyePuani;
    }

    public int getSeviyePuani() {
        return seviyePuani;
    }

    public void setSeviyePuani(int seviyePuani) {
        this.seviyePuani = seviyePuani;
    }

    public double getDayaniklilik() {
        return dayaniklilik;
    }

    public void setDayaniklilik(double dayaniklilik) {
        this.dayaniklilik = dayaniklilik;
    }
    
    abstract void durumGuncelle(double hit);
    abstract public double etkiHesapla(int a,int b,int c,int d);
        
        
    
}
