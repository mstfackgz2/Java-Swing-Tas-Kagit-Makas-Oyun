/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nesnePaketi;

/**
 *
 * @author AsuS
 */
public class tasSinifi extends nesneSinifi{
    
    public double katilik=2;
    
    public tasSinifi() {
    }

    public tasSinifi(double katilik, double dayaniklilik, int seviyePuani) {
        super(dayaniklilik, seviyePuani);
        this.katilik = katilik;
    }
    
    public int getPuan() {
        return seviyePuani;
    }

    public void setPuan(int seviyePuani) {
        this.seviyePuani = seviyePuani;
    }
    
    
    public void nesnePuaniGoster(){
       
    
    }
    
    @Override
    public void durumGuncelle(double hit) {
        dayaniklilik -= hit;
    }
    

    @Override
    public double etkiHesapla(int a,int b,int c,int d) {
        double etki = katilik/((0.2*a*b)+(0.8*c*d)); 
        return etki;
    }




}
    
