/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nesnePaketi;

/**
 *
 * @author AsuS
 */
public class ustaMakasSinifi extends makasSinifi{
    
    public double direnc=2;

    public ustaMakasSinifi() {
    }

    public ustaMakasSinifi(double direnc, double keskinlik, int dayaniklilik, int seviyePuani) {
        super(keskinlik, dayaniklilik, seviyePuani);
        this.direnc = direnc;
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
        double etki = 2*direnc/((0.2*a*b)+(0.8*c*d)); 
        return etki;
    }
    
}
