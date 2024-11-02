/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nesnePaketi;

/**
 *
 * @author AsuS
 */
public class makasSinifi extends nesneSinifi{
    int puan;
    public double keskinlik=2;

    public makasSinifi() {
    }

    public makasSinifi(double keskinlik, int dayaniklilik, int seviyePuani) {
        super(dayaniklilik, seviyePuani);
        this.keskinlik = keskinlik;
    }

    public int getPuan() {
        return puan;
    }

    public void setPuan(int puan) {
        this.puan = puan;
    }
    
    

    @Override
    void durumGuncelle(double hit) {
        dayaniklilik -= hit;
    }

     @Override
    public double etkiHesapla(int a,int b,int c,int d) {
        double etki = keskinlik/((0.2*a*b)+(0.8*c*d)); 
        return etki;
    }
    
    
}
