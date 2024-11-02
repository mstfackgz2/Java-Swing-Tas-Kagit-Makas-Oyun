/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nesnePaketi;

/**
 *
 * @author AsuS
 */
public abstract class oyuncu {
    public int id;
    public double skor;
    public  String oyuncuAdi;

    public oyuncu() {
    }

    public oyuncu(int id, int skor, String oyuncuAdi) {
        this.id = id;
        this.skor = skor;
        this.oyuncuAdi = oyuncuAdi;
    }
    
    
    double skorGoster(){
        return skor;
    }
    
          
    
    
}
