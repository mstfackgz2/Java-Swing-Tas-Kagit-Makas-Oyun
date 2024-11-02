/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nesnePaketi;

/**
 *
 * @author AsuS
 */
public class agirTasSinifi extends tasSinifi{
    public double sicaklik=2;

    public agirTasSinifi() {
    }

    public agirTasSinifi(double sicaklik, double katilik, int dayaniklilik, int seviyePuani) {
        super(katilik, dayaniklilik, seviyePuani);
        this.sicaklik = sicaklik;
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
       double etki = 2*sicaklik/((0.2*a*b)+(0.8*c*d)); 
        return etki;
    }
}
