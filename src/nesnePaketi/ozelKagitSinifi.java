/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nesnePaketi;

/**
 *
 * @author AsuS
 */
public class ozelKagitSinifi extends kagitSinifi{
    
    double kalinlik=2;

    public ozelKagitSinifi() {
    }

    public ozelKagitSinifi(double kalinlik, double nufuz, int dayaniklilik, int seviyePuani) {
        super(nufuz, dayaniklilik, seviyePuani);
        this.kalinlik = kalinlik;
    }
    public int getPuan() {
        return puan;
    }

    public void setPuan(int puan) {
        this.puan = puan;
    }

   
    
    
    public void nesnePuaniGoster(){
       
    
    }
    
    @Override
    public void durumGuncelle(double hit) {
        dayaniklilik -= hit;
    }
    

    @Override
    public double etkiHesapla(int a,int b,int c,int d) {
        double etki = kalinlik*2/((0.2*a*b)+(0.8*c*d)); 
        return etki;
    }
    
    
        
    
}
