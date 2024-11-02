/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nesnePaketi;

/**
 *
 * @author AsuS
 */
public class kagitSinifi extends nesneSinifi{
    
    public double nufuz=2;
    int puan;

    
    public kagitSinifi(double nufuz, int dayaniklilik, int seviyePuani) {
        super(dayaniklilik, seviyePuani);
        this.nufuz = nufuz;
    }
    
    
    public kagitSinifi() {
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
        double etki = nufuz/((0.2*a*b)+(0.8*c*d)); 
        return etki;
    }
    
}
