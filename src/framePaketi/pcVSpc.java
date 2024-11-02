/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package framePaketi;

import java.awt.Image;
import static java.lang.Thread.sleep;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import nesnePaketi.agirTasSinifi;
import nesnePaketi.kagitSinifi;
import nesnePaketi.makasSinifi;
import nesnePaketi.nesneSinifi;
import nesnePaketi.oyuncu;
import nesnePaketi.ozelKagitSinifi;
import nesnePaketi.tasSinifi;
import nesnePaketi.ustaMakasSinifi;

/**
 *
 * @author AsuS
 */
public class pcVSpc extends javax.swing.JFrame {

     public int oyunAdedi;
    int round=0;
    
    public int[] p2Nesneleri={0,0,0};
    public int[] p2NesneleriKont={0,0,0};
    public int[] p1Nesneleri={0,0,0};
    public int[] p1Nesnelerikont={0,0,0};
    
    public int[] p1NesneSeviye={0,0,0};
    public int[] p2NesneSeviye={0,0,0};
    
    public pcVSpc() {
        initComponents();
    }
    
    oyuncu p1,p2;
    
    public pcVSpc(int oyunAdedi, int[] p2Nesneleri, int[] p1Nesneleri,oyuncu p2,oyuncu p1) {
        initComponents();
        this.oyunAdedi = oyunAdedi;
        this.p2Nesneleri = p2Nesneleri;
        this.p1Nesneleri= p1Nesneleri;
        this.p2=p2;
        this.p1=p1;
        
    }

    nesneSinifi[] p1Nesne =new nesneSinifi[3];
    nesneSinifi[] p2Nesne =new nesneSinifi[3];
    
    boolean p2TasVarMi= false ;
    boolean p2KagitVarMi= false ;
    boolean p2MakasVarMi= false ;
    
    boolean p1TasVarMi= false ;
    boolean p1KagitVarMi= false ;
    boolean p1MakasVarMi= false ;
    
    nesneSinifi p1tas = new tasSinifi(2, 0, 0);
    nesneSinifi p1kagit = new kagitSinifi(2, 0, 0);
    nesneSinifi p1makas = new makasSinifi(2, 0, 0);
    
    nesneSinifi p2tas = new tasSinifi(2, 0, 0);
    nesneSinifi p2kagit = new kagitSinifi(2, 0, 0);
    nesneSinifi p2makas = new makasSinifi(2, 0, 0);
    
    nesneSinifi p1stas = new agirTasSinifi(2, 2, 0, 0);
    nesneSinifi p1skagit = new ozelKagitSinifi(2, 2, 0, 0);
    nesneSinifi p1smakas = new ustaMakasSinifi(2, 2, 0, 0);
    
    nesneSinifi p2stas = new agirTasSinifi(2, 2, 0, 0);
    nesneSinifi p2skagit = new ozelKagitSinifi(2, 2, 0, 0);
    nesneSinifi p2smakas = new ustaMakasSinifi(2, 2, 0, 0);
    
    public void p1NesneUret(){
        if (p1Nesnelerikont[0]!=p1Nesneleri[0] && p1TasVarMi==false){
            if(p1NesneSeviye[0]==1){
            p1stas.dayaniklilik=20;
            p1stas.seviyePuani=0;
            p1Nesne[0]=p1stas;
            p1TasVarMi=true;
            p1Nesnelerikont[0]+=1;
                System.out.println("Kullanici STas uretildi");
            }
            else if(p1NesneSeviye[0]==0){
            p1tas.dayaniklilik=20;
            p1tas.seviyePuani=0;
            p1Nesne[0]=p1tas;
            p1Nesnelerikont[0]+=1;
            p1TasVarMi=true;
            System.out.println("Kullanici Tas uretildi");
            }
            }
        if (p1Nesnelerikont[1]!=p1Nesneleri[1] && p1KagitVarMi==false){
            if(p1NesneSeviye[1]==1){
            p1skagit.dayaniklilik=20;
            p1skagit.seviyePuani=0;
            p1Nesne[1]=p1skagit;
            p1KagitVarMi=true;
            p1Nesnelerikont[1]+=1;
            System.out.println("Kullanici Skagit uretildi");
            }
            else if(p1NesneSeviye[1]==0){
            p1kagit.dayaniklilik=20;
            p1kagit.seviyePuani=0;
            p1Nesne[1]=p1kagit;
            p1Nesnelerikont[1]+=1;
            p1KagitVarMi=true;
            System.out.println("Kullanici Kagit uretildi");
            }
            }
        if (p1Nesnelerikont[2]!=p1Nesneleri[2] && p1MakasVarMi==false){
            if(p1NesneSeviye[2]==1){
            p1smakas.dayaniklilik=20;
            p1smakas.seviyePuani=0;
            p1Nesne[2]=p1smakas;
            p1MakasVarMi=true;
            p1Nesnelerikont[2]+=1;
            System.out.println("Kullanici Smakas uretildi");
            }
            else if(p1NesneSeviye[2]==0){
            p1makas.dayaniklilik=20;
            p1makas.seviyePuani=0;
            p1Nesne[2]=p1makas;
            p1Nesnelerikont[2]+=1;
            p1MakasVarMi=true;
            System.out.println("Kullanici makas uretildi");
            }
            }
    }
    
    public void p2NesneUret(){
        if (p2NesneleriKont[0]!=p2Nesneleri[0] && p2TasVarMi==false){
            if(p2NesneSeviye[0]==1){
            p2stas.dayaniklilik=20;
            p2stas.seviyePuani=0;
            p2Nesne[0]=p2stas;
            p2TasVarMi=true;
            p2NesneleriKont[0]+=1;
            System.out.println("pc Stass uretildi");
            }
            else if(p2NesneSeviye[0]==0){
            p2tas.dayaniklilik=20;
            p2tas.seviyePuani=0;
            p2Nesne[0]=p2tas;
            p2NesneleriKont[0]+=1;
            p2TasVarMi=true;
            System.out.println("pc tas uretildi");
            }
            }
        if (p2NesneleriKont[1]!=p2Nesneleri[1] && p2KagitVarMi==false){
            if(p2NesneSeviye[1]==1){
            p2skagit.dayaniklilik=20;
            p2skagit.seviyePuani=0;
            p2Nesne[1]=p2skagit;
            p2KagitVarMi=true;
            p2NesneleriKont[1]+=1;
            System.out.println("pc Skagit uretildi");
            }
            else if(p2NesneSeviye[1]==0){
            p2kagit.dayaniklilik=20;
            p2kagit.seviyePuani=0;
            p2Nesne[1]=p2kagit;
            p2NesneleriKont[1]+=1;
            p2KagitVarMi=true;
            System.out.println("pc kagit uretildi");
            }
            }
        if (p2NesneleriKont[2]!=p2Nesneleri[2] && p2MakasVarMi==false){
            if(p2NesneSeviye[2]==1){
            p2smakas.dayaniklilik=20;
            p2smakas.seviyePuani=0;
            p2Nesne[2]=p2smakas;
            p2MakasVarMi=true;
            p2NesneleriKont[2]+=1;
            System.out.println("pc SMakas uretildi");
            }
            else if(p2NesneSeviye[2]==0){
            p2makas.dayaniklilik=20;
            p2makas.seviyePuani=0;
            p2Nesne[2]=p2makas;
            p2NesneleriKont[2]+=1;
            p2MakasVarMi=true;
                System.out.println("pc Makas uretildi");
            }
            }
    }
    
    /********************************************************************************************/
    
    public Image tasResim = new ImageIcon("D:\\yeni java proje\\TKM\\src\\images\\tas.png").getImage();
    public Image kagitResim = new ImageIcon("D:\\yeni java proje\\TKM\\src\\images\\kagit.png").getImage();
    public Image makasResim = new ImageIcon("D:\\yeni java proje\\TKM\\src\\images\\makas.png").getImage();
    
    public Image soruResim = new ImageIcon("D:\\yeni java proje\\TKM\\src\\images\\soru.png").getImage();
    
    public void karistir(){
        Thread shake = new Thread(){
            public void run(){
                for(;;){
                     
                       jLabel4.setIcon(new ImageIcon(tasResim));
                       jLabel5.setIcon(new ImageIcon(tasResim));
                 try {
                     sleep(200);
                 }
                 catch (InterruptedException ex) {                
                 }
                 jLabel4.setIcon(new ImageIcon(kagitResim));
                 jLabel5.setIcon(new ImageIcon(kagitResim));
                 try {
                     sleep(200);
                 }
                 catch (InterruptedException ex) {                
                 }
                 jLabel4.setIcon(new ImageIcon(makasResim));
                 jLabel5.setIcon(new ImageIcon(makasResim));
                 try {
                     sleep(200);
                 }
                 catch (InterruptedException ex) {                
                 }
                 jLabel4.setIcon(new ImageIcon(soruResim));
                 jLabel5.setIcon(new ImageIcon(soruResim));
                 try {
                     sleep(200);
                 }
                 catch (InterruptedException ex) {                
                 }
                 break;
                }
                
            }
        };  
        shake.start();
    }    
    
    /********************************************************************************************/
     /********************************************************************************************/
    // can hesaplama
    public void kazananKim(){
        double p1KalanDayaniklilik=p1tas.dayaniklilik+p1kagit.dayaniklilik+p1makas.dayaniklilik+
            p1skagit.dayaniklilik+p1stas.dayaniklilik+p1smakas.dayaniklilik+
            ((p1Nesneleri[0]-p1Nesnelerikont[0])*20)+((p1Nesneleri[1]-p1Nesnelerikont[1])*20)+((p1Nesneleri[2]-p1Nesnelerikont[2])*20);
    
            double p2KalanDayaniklilik=p2tas.dayaniklilik+p2kagit.dayaniklilik+p2makas.dayaniklilik+
            p2stas.dayaniklilik+p2skagit.dayaniklilik+p2smakas.dayaniklilik+
            ((p2Nesneleri[0]-p2NesneleriKont[0])*20)+((p2Nesneleri[1]-p2NesneleriKont[1])*20)+((p2Nesneleri[2]-p2NesneleriKont[2])*20);
   
            p1.skor=p1KalanDayaniklilik;
            p2.skor=p2KalanDayaniklilik;
            
        
            if(p1KalanDayaniklilik>p2KalanDayaniklilik){
                    JOptionPane.showMessageDialog(null, "!!! P1 Kazandi !!!  p1 skor: "+p1.skor+" p2 skor: "+p2.skor);
            }else if(p2KalanDayaniklilik>p1KalanDayaniklilik)  {
                     JOptionPane.showMessageDialog(null, "!!! P2 Kazandi !!!  p1 skor: "+p1.skor+" p2 skor: "+p2.skor);
            }else {
                JOptionPane.showMessageDialog(null, "!!! Berabere !!!  p1 skor: "+p1.skor+" p2 skor: "+p2.skor);
            
            }
   } 
    
    /********************************************************************************************/
    Random r = new Random();
        
    double etkitas ;
    double etkikgt;
    double etkimks;
    int secim;
    
    public int p2Sectir(){
         
        
        secim = r.nextInt(3);
        
        while(p2KagitVarMi || p2KagitVarMi || p2MakasVarMi){
            if(secim==0 && p2TasVarMi){
                System.out.println("p2: tas");
            break;}
            else if(secim==1 && p2KagitVarMi){
                System.out.println("p2: kagit");
                 break;}
            else if(secim==2 && p2MakasVarMi){
                System.out.println("p2: makas");
                break;}
            else secim = r.nextInt(3);
        }
        return secim;
    }
    public int p1Sectir(){
         
        
        secim = r.nextInt(3);
        
        while(p1KagitVarMi || p1KagitVarMi || p1MakasVarMi){
            if(secim==0 && p1TasVarMi){
                System.out.println("p1: tas");
            break;}
            else if(secim==1 && p1KagitVarMi){
                System.out.println("p1: kagit");
                 break;}
            else if(secim==2 && p1MakasVarMi){
                System.out.println("p1: makas");
                break;}
            else secim = r.nextInt(3);
        }
        return secim;
    }
    
    
    
    
    
    
    public void canDusur(nesneSinifi nesne,double hitk){
        nesne.setDayaniklilik(nesne.getDayaniklilik()-hitk);
    }
    
    
   
    
    public void kiyasla(int p2,int p1){
        
        if(p2==0 && p1==0 && p2TasVarMi==true && p1TasVarMi==true){
            
            int hitpc,hitk;            
            //pc vurusu
            
            
            if(p2NesneSeviye[0]==1){
                //pcnesne superse
                hitpc=4;
                
                if(p1NesneSeviye[0]==1){
                //vurudu superse 
                    canDusur(p1stas, hitpc);
                    if(p1stas.dayaniklilik<0){
                        p1stas.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "p1 nesne kirildi yenisi varsa uretilir");
                        p1TasVarMi=false;
                    }
                }else{
                //vurudu normalse
                    canDusur(p1tas, hitpc);
                     if(p1tas.dayaniklilik<0){
                         p1tas.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "k nesne kirildi yenisi varsa uretilir");
                        p1TasVarMi=false;
                    }
                }
                
                
            }else {
                //pcnesnee normalse
                hitpc=2;
                if(p1NesneSeviye[0]==1){
                     //vurudu superse 
                     canDusur(p1stas, hitpc);
                     if(p1stas.dayaniklilik<0){
                         p1stas.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "k nesne kirildi yenisi varsa uretilir");
                        p1TasVarMi=false;
                    }
                }else{
                     //vurudu super degilse
                     canDusur(p1tas, hitpc);
                     if(p1tas.dayaniklilik<0){
                         p1tas.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "k nesne kirildi yenisi varsa uretilir");
                        p1TasVarMi=false;
                    }
                }
            }
            
            //kullanici vurusu
            if(p1NesneSeviye[0]==1){
                //kullanici nesne superse
                hitk=4;
                if(p2NesneSeviye[0]==1){
                    //vurdugu nesne superse
                    canDusur(p2stas, hitk);
                    if(p2stas.dayaniklilik<0){
                        p2stas.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "p2 nesne kirildi yenisi varsa uretilir");
                        p2TasVarMi=false;
                    }
                }else{
                    //vurdugu nesne normalse
                    canDusur(p2tas, hitk);
                    if(p2tas.dayaniklilik<0){
                        p2tas.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "p2 nesne kirildi yenisi varsa uretilir");
                        p2TasVarMi=false;
                    }
                
                } 
                
            }else {
                //kullanici nesne normalse
                hitk=2;
                if(p2NesneSeviye[0]==1){
                    //vurdugu nesne superse
                    canDusur(p2stas, hitk);
                    if(p2stas.dayaniklilik<0){
                        p2stas.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "p2 nesne kirildi yenisi varsa uretilir");
                        p2TasVarMi=false;
                    }
                }else{
                   //vurdugu nesne normalse
                   canDusur(p2tas, hitk);
                    if(p2tas.dayaniklilik<0){
                        p2tas.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "p2 nesne kirildi yenisi varsa uretilir");
                        p2TasVarMi=false;
                    }
                }
            }
            
            System.out.println("berabere");
        }
        
        
        
        
        if(p2==1 && p1==1 && p2KagitVarMi==true && p1KagitVarMi==true){
            
            int hitpc,hitk;            
            //pc vurusu
            
            
            if(p2NesneSeviye[1]==1){
                //pcnesne superse
                hitpc=4;
                
                if(p1NesneSeviye[1]==1){
                //vurudu superse 
                    canDusur(p1skagit, hitpc);
                    if(p1skagit.dayaniklilik<0){
                        p1skagit.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "p1 nesne kirildi yenisi varsa uretilir");
                        p1KagitVarMi=false;
                    }
                }else{
                //vurudu normalse
                    canDusur(p1kagit, hitpc);
                     if(p1kagit.dayaniklilik<0){
                         p1kagit.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "p1 nesne kirildi yenisi varsa uretilir");
                        p1KagitVarMi=false;
                    }
                }
                
                
            }else {
                //pcnesnee normalse
                hitpc=2;
                if(p1NesneSeviye[1]==1){
                     //vurudu superse 
                     canDusur(p1skagit, hitpc);
                     if(p1skagit.dayaniklilik<0){
                         p1skagit.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "p1 nesne kirildi yenisi varsa uretilir");
                        p1KagitVarMi=false;
                    }
                }else{
                     //vurudu super degilse
                     canDusur(p1kagit, hitpc);
                     if(p1kagit.dayaniklilik<0){
                         p1kagit.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "p1 nesne kirildi yenisi varsa uretilir");
                        p1KagitVarMi=false;
                    }
                }
            }
            
            //kullanici vurusu
            if(p1NesneSeviye[1]==1){
                //kullanici nesne superse
                hitk=4;
                if(p2NesneSeviye[1]==1){
                    //vurdugu nesne superse
                    canDusur(p2skagit, hitk);
                    if(p2skagit.dayaniklilik<0){
                        p2skagit.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "p2 nesne kirildi yenisi varsa uretilir");
                        p2KagitVarMi=false;
                    }
                }else{
                    //vurdugu nesne normalse
                    canDusur(p2kagit, hitk);
                    if(p2kagit.dayaniklilik<0){
                        p2kagit.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "p2 nesne kirildi yenisi varsa uretilir");
                        p2KagitVarMi=false;
                    }
                
                } 
                
            }else {
                //kullanici nesne normalse
                hitk=2;
                if(p2NesneSeviye[1]==1){
                    //vurdugu nesne superse
                    canDusur(p2skagit, hitk);
                    if(p2skagit.dayaniklilik<0){
                        p2skagit.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "p2 nesne kirildi yenisi varsa uretilir");
                        p2KagitVarMi=false;
                    }
                }else{
                   //vurdugu nesne normalse
                   canDusur(p2kagit, hitk);
                    if(p2kagit.dayaniklilik<0){
                        p2kagit.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "p2 nesne kirildi yenisi varsa uretilir");
                        p2KagitVarMi=false;
                    }
                }
            }
            
            System.out.println("berabere");
        }
        
        
        
        
        if(p2==2 && p1==2 && p2MakasVarMi==true && p1MakasVarMi== true){
            
            int hitpc,hitk;            
            //pc vurusu
            
            
            if(p2NesneSeviye[2]==1){
                //pcnesne superse
                hitpc=4;
                
                if(p1NesneSeviye[2]==1){
                //vurudu superse 
                    canDusur(p1smakas, hitpc);
                    if(p1smakas.dayaniklilik<0){
                        p1smakas.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "p1nesne kirildi yenisi varsa uretilir");
                        p1MakasVarMi=false;
                    }
                }else{
                //vurudu normalse
                    canDusur(p1makas, hitpc);
                     if(p1makas.dayaniklilik<0){
                         p1makas.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "p1 nesne kirildi yenisi varsa uretilir");
                        p1MakasVarMi=false;
                    }
                }
                
                
            }else {
                //pcnesnee normalse
                hitpc=2;
                if(p1NesneSeviye[2]==1){
                     //vurudu superse 
                     canDusur(p1smakas, hitpc);
                     if(p1smakas.dayaniklilik<0){
                         p1smakas.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "p1 nesne kirildi yenisi varsa uretilir");
                        p1MakasVarMi=false;
                    }
                }else{
                     //vurudu super degilse
                     canDusur(p1makas, hitpc);
                     if(p1makas.dayaniklilik<0){
                         p1makas.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "p1 nesne kirildi yenisi varsa uretilir");
                        p1MakasVarMi=false;
                    }
                }
            }
            
            
            
            //kullanici vurusu
            if(p1NesneSeviye[2]==1){
                //kullanici nesne superse
                hitk=4;
                if(p2NesneSeviye[2]==1){
                    //vurdugu nesne superse
                    canDusur(p2smakas, hitk);
                    if(p2smakas.dayaniklilik<0){
                        p2smakas.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "p2 nesne kirildi yenisi varsa uretilir");
                        p2MakasVarMi=false;
                    }
                }else{
                    //vurdugu nesne normalse
                    canDusur(p2makas, hitk);
                    if(p2makas.dayaniklilik<0){
                        p2makas.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "p2 nesne kirildi yenisi varsa uretilir");
                        p2MakasVarMi=false;
                    }
                
                } 
                
            }else {
                //kullanici nesne normalse
                hitk=2;
                if(p2NesneSeviye[2]==1){
                    //vurdugu nesne superse
                    canDusur(p2smakas, hitk);
                    if(p2smakas.dayaniklilik<0){
                        p2smakas.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "p2 nesne kirildi yenisi varsa uretilir");
                        p2MakasVarMi=false;
                    }
                }else{
                   //vurdugu nesne normalse
                   canDusur(p2makas, hitk);
                    if(p2makas.dayaniklilik<0){
                        p2makas.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "p2 nesne kirildi yenisi varsa uretilir");
                        p2MakasVarMi=false;
                    }
                }
            }
            
            System.out.println("berabere");
        }
       
        
        if(p2==0 && p1==1 && p2TasVarMi==true && p1KagitVarMi==true){
            
            //pc vurusu
            if(p2NesneSeviye[0]==1){
                //pcnesne superse
                if(p1NesneSeviye[1]==1){
                    //vurdugu nesne superse
                    etkitas = p2stas.etkiHesapla(0, 0, 2, 2);
                    canDusur(p1skagit, etkitas);
                    if(p1skagit.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "p1 nesne kirildi yenisi varsa uretilir");
                        p1KagitVarMi=false;
                    }
                    
                }else {
                    //vurdugu nesne normalse
                     etkitas = p2stas.etkiHesapla(0, 0, 2, 1);
                     canDusur(p1kagit, etkitas);
                     if(p1kagit.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "p1 nesne kirildi yenisi varsa uretilir");
                        p1KagitVarMi=false;
                    }
                     
                }
            }else {
                //pcnesnee normalse
                if(p1NesneSeviye[1]==1){
                    //vurdugu nesne superse
                    etkitas = p2tas.etkiHesapla(0, 0, 2, 2);
                    canDusur(p1skagit, etkitas);
                    if(p1skagit.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "p1 nesne kirildi yenisi varsa uretilir");
                        p1KagitVarMi=false;
                    }
                }else {
                    //vurdugu nesne normalse
                    etkitas = p2tas.etkiHesapla(0, 0, 2, 1);
                    canDusur(p1kagit, etkitas);
                    if(p1kagit.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "p1 nesne kirildi yenisi varsa uretilir");
                        p1KagitVarMi=false;
                    }
                }
            }
            
            //kullanıcı vurusu
            if(p1NesneSeviye[1]==1){
                if(p2NesneSeviye[0]==1){
                    //vurdugu nesne superse
                    etkikgt = p1skagit.etkiHesapla(2, 2, 0, 0);
                    canDusur(p2stas, etkikgt);
                    if(p2stas.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "p2 nesne kirildi yenisi varsa uretilir");
                        p2TasVarMi=false;
                    }
                    p1skagit.seviyePuani=p1skagit.seviyePuani+20;
                }else {
                    //vurdugu nesne normalse
                     etkikgt = p1skagit.etkiHesapla(2, 1, 0, 0);
                     canDusur(p2tas, etkikgt);
                     if(p2tas.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "p2 nesne kirildi yenisi varsa uretilir");
                        p2TasVarMi=false;
                    }
                    p1skagit.seviyePuani=p1skagit.seviyePuani+20;
                }
            }else {
                if(p2NesneSeviye[0]==1){
                    //vurdugu nesne superse
                    etkikgt = p1kagit.etkiHesapla(2, 2, 0, 0);
                    canDusur(p2stas, etkikgt);
                    if(p2stas.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "p2 nesne kirildi yenisi varsa uretilir");
                        p2TasVarMi=false;
                    }
                    p1kagit.seviyePuani=p1kagit.seviyePuani+20;
                    if(p1kagit.seviyePuani>30){
                        p1kagit.dayaniklilik=0;
                        p1NesneSeviye[1]=1;
                        p1skagit.dayaniklilik=20;
                    }
                }else {
                    //vurdugu nesne normalse
                     etkikgt = p1kagit.etkiHesapla(2, 1, 0, 0);
                     canDusur(p2tas, etkikgt);
                     if(p2tas.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "p2 nesne kirildi yenisi varsa uretilir");
                        p2TasVarMi=false;
                    }
                     p1kagit.seviyePuani=p1kagit.seviyePuani+20;
                     if(p1kagit.seviyePuani>30){
                        p1kagit.dayaniklilik=0;
                        p1NesneSeviye[1]=1;
                        p1skagit.dayaniklilik=20;
                    }
                }
            }
            
            
            
            
           System.out.println("kullanici kazandi");
        }
       
        if(p2==0 && p1==2 && p2TasVarMi==true && p1MakasVarMi== true){
            //pc vurusu
            if(p2NesneSeviye[0]==1){
                if(p1NesneSeviye[2]==1){
                    //vurdugu nesne superse
                    etkitas = p2stas.etkiHesapla(2, 2, 0, 0);
                    canDusur(p1smakas, etkitas);
                    if(p1smakas.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "p1 nesne kirildi yenisi varsa uretilir");
                    p1MakasVarMi=false;
                    }
                    p2stas.seviyePuani+=20;
                }else {
                    //vurdugu nesne normalse
                     etkitas = p2stas.etkiHesapla(2, 1, 0, 0);
                     canDusur(p1makas, etkitas);
                     if(p1makas.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "p1 nesne kirildi yenisi varsa uretilir");
                    p1MakasVarMi=false;
                    }
                     p2stas.seviyePuani+=20;
                }
            }else {
                if(p1NesneSeviye[2]==1){
                    //vurdugu nesne superse
                    etkitas = p2tas.etkiHesapla(2, 2, 0, 0);
                    canDusur(p1smakas, etkitas);
                    if(p1smakas.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "p1 nesne kirildi yenisi varsa uretilir");
                    p1MakasVarMi=false;
                    }
                    p2tas.seviyePuani+=20;
                    if(p2tas.seviyePuani>30){
                        p2tas.dayaniklilik=0;
                        p2NesneSeviye[0]=1;
                        p2stas.dayaniklilik=20;
                    }
                }else {
                    //vurdugu nesne normalse
                     etkitas = p2tas.etkiHesapla(2, 1, 0, 0);
                     canDusur(p1makas, etkitas);
                     if(p1makas.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "p1 nesne kirildi yenisi varsa uretilir");
                    p1MakasVarMi=false;
                    }
                     p2tas.seviyePuani+=20;
                     if(p2tas.seviyePuani>30){
                        p2tas.dayaniklilik=0;
                        p2NesneSeviye[0]=1;
                        p2stas.dayaniklilik=20;
                    }
                }
            }
            //kullanıcı vurusu
            if(p1NesneSeviye[2]==1){
                if(p2NesneSeviye[0]==1){
                    //vurdugu nesne superse
                    etkimks = p1smakas.etkiHesapla(0, 0, 2, 2);
                    canDusur(p2stas, etkimks);
                    if(p2stas.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "p2 nesne kirildi yenisi varsa uretilir");
                        p2TasVarMi=false;
                    }
                }else {
                    //vurdugu nesne normalse
                     etkimks = p1smakas.etkiHesapla(0, 0, 2, 1);
                     canDusur(p2tas, etkimks);
                     if(p2tas.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "p2 nesne kirildi yenisi varsa uretilir");
                        p2TasVarMi=false;
                    }
                }
            }else {
                if(p2NesneSeviye[0]==1){
                    //vurdugu nesne superse
                    etkimks = p1makas.etkiHesapla(0, 0, 2, 2);
                    canDusur(p2stas, etkimks);
                    if(p2stas.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "p2 nesne kirildi yenisi varsa uretilir");
                        p2TasVarMi=false;
                    }
                }else {
                    //vurdugu nesne normalse
                     etkimks = p1makas.etkiHesapla(0, 0, 2, 1);
                     canDusur(p2tas, etkimks);
                     if(p2tas.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "p2 nesne kirildi yenisi varsa uretilir");
                        p2TasVarMi=false;
                    }
                }
            }

            System.out.println("pc kazandi");
        }

        if(p2==1 && p1==0 && p1TasVarMi==true && p2KagitVarMi==true){
            //pc vurusu
            if(p2NesneSeviye[1]==1){
                if(p1NesneSeviye[0]==1){
                    //vurdugu nesne superse
                    etkikgt = p2skagit.etkiHesapla(2, 2, 0, 0);
                    canDusur(p1stas, etkikgt);
                    if(p1stas.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "p1 nesne kirildi yenisi varsa uretilir");
                    p1TasVarMi=false;
                    }
                    p2skagit.seviyePuani+=20;
                }else {
                    //vurdugu nesne normalse
                     etkikgt = p2skagit.etkiHesapla(2, 1, 0, 0);
                     canDusur(p1tas, etkikgt);
                     if(p1tas.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "p1 nesne kirildi yenisi varsa uretilir");
                    p1TasVarMi=false;
                    }
                     p2skagit.seviyePuani+=20;
                }
            }else {
                if(p1NesneSeviye[0]==1){
                    //vurdugu nesne superse
                    etkikgt = p2kagit.etkiHesapla(2, 2, 0, 0);
                    canDusur(p1stas, etkikgt);
                    if(p1stas.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "p1 nesne kirildi yenisi varsa uretilir");
                    p1TasVarMi=false;
                    }
                    p2kagit.seviyePuani+=20;
                    if(p2kagit.seviyePuani>30){
                        p2kagit.dayaniklilik=0;
                        p2NesneSeviye[1]=1;
                        p2skagit.dayaniklilik=20;
                    }
                }else {
                    //vurdugu nesne normalse
                     etkikgt = p2kagit.etkiHesapla(2, 1, 0, 0);
                     canDusur(p1tas, etkikgt);
                     if(p1tas.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "p1 nesne kirildi yenisi varsa uretilir");
                    p1TasVarMi=false;
                    }
                     p2kagit.seviyePuani+=20;
                     if(p2kagit.seviyePuani>30){
                        p2kagit.dayaniklilik=0;
                        p2NesneSeviye[1]=1;
                        p2skagit.dayaniklilik=20;
                    }
                }
            }
            //kullanıcı vurusu
            if(p1NesneSeviye[0]==1){
                if(p2NesneSeviye[1]==1){
                    //vurdugu nesne superse
                    etkitas = p1stas.etkiHesapla(0, 0, 2, 2);
                    canDusur(p2skagit, etkitas);
                    if(p2skagit.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "p2 nesne kirildi yenisi varsa uretilir");
                        p2KagitVarMi=false;
                    }
                }else {
                    //vurdugu nesne normalse
                     etkitas = p1stas.etkiHesapla(0, 0, 2, 1);
                     canDusur(p2kagit, etkitas);
                     if(p2kagit.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "p2 nesne kirildi yenisi varsa uretilir");
                        p2KagitVarMi=false;
                    }
                }
            }else {
                if(p2NesneSeviye[1]==1){
                    //vurdugu nesne superse
                    etkitas = p1tas.etkiHesapla(0, 0, 2, 2);
                    canDusur(p2skagit, etkitas);
                    if(p2skagit.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "p2 nesne kirildi yenisi varsa uretilir");
                        p2KagitVarMi=false;
                    }
                }else {
                    //vurdugu nesne normalse
                     etkitas = p1tas.etkiHesapla(0, 0, 2, 1);
                     canDusur(p2kagit, etkitas);
                     if(p2kagit.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "p2 nesne kirildi yenisi varsa uretilir");
                        p2KagitVarMi=false;
                    }
                }
            }

            System.out.println("pc kazandi");
        }
        
        if(p2==1 && p1==2 && p1MakasVarMi== true && p2KagitVarMi==true){
            //pc vurusu
            if(p2NesneSeviye[1]==1){
                //pcnesne superse
                if(p1NesneSeviye[2]==1){
                    //vurdugu nesne superse
                    etkikgt = p2skagit.etkiHesapla(0, 0, 2, 2);
                    canDusur(p1smakas, etkikgt);
                    if(p1smakas.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "p1 nesne kirildi yenisi varsa uretilir");
                    p1MakasVarMi=false;
                    }
                }else {
                    //vurdugu nesne normalse
                     etkikgt = p2skagit.etkiHesapla(0, 0, 2, 1);
                     canDusur(p1makas, etkikgt);
                     if(p1makas.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "p1 nesne kirildi yenisi varsa uretilir");
                    p1MakasVarMi=false;
                    }
                }
            }else {
                //pcnesnee normalse
                if(p1NesneSeviye[2]==1){
                    //vurdugu nesne superse
                    etkikgt = p2kagit.etkiHesapla(0, 0, 2, 2);
                    canDusur(p1smakas, etkikgt);
                    if(p1smakas.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "p1 nesne kirildi yenisi varsa uretilir");
                    p1MakasVarMi=false;
                    }
                }else {
                     //vurdugu nesne normalse
                     etkikgt = p2kagit.etkiHesapla(0, 0, 2, 1);
                     canDusur(p1makas, etkikgt);
                     if(p1makas.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "p1 nesne kirildi yenisi varsa uretilir");
                    p1MakasVarMi=false;
                    }
                }
            }
            
            
            //kullanıcı vurusu
            if(p1NesneSeviye[2]==1){
                if(p2NesneSeviye[1]==1){
                    //vurdugu nesne superse
                    etkimks = p1smakas.etkiHesapla(2, 2, 0, 0);
                    canDusur(p2skagit, etkimks);
                    if(p2skagit.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "p2 nesne kirildi yenisi varsa uretilir");
                        p2KagitVarMi=false;
                    }
                    p1smakas.seviyePuani+=20;
                }else {
                    //vurdugu nesne normalse
                     etkimks = p1smakas.etkiHesapla(2, 1, 0, 0);
                     canDusur(p2kagit, etkimks);
                     if(p2kagit.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "p2 nesne kirildi yenisi varsa uretilir");
                        p2KagitVarMi=false;
                    }
                     p1smakas.seviyePuani+=20;
                }
            }else {
                if(p2NesneSeviye[1]==1){
                    //vurdugu nesne superse
                    etkimks = p1makas.etkiHesapla(2, 2, 0, 0);
                    canDusur(p2skagit, etkimks);
                    p1makas.seviyePuani+=20;
                    if(p1makas.seviyePuani>30){
                        p1makas.dayaniklilik=0;
                        p1NesneSeviye[2]=1;
                        p1smakas.dayaniklilik=20;
                    }
                    if(p2skagit.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "p2 nesne kirildi yenisi varsa uretilir");
                        p2KagitVarMi=false;
                    }
                }else {
                    //vurdugu nesne normalse
                     etkimks = p1makas.etkiHesapla(2, 1, 0, 0);
                     canDusur(p2kagit, etkimks);
                     p1makas.seviyePuani+=20;
                      if(p1makas.seviyePuani>30){
                        p1makas.dayaniklilik=0;
                        p1NesneSeviye[2]=1;
                        p1smakas.dayaniklilik=20;
                    }
                    if(p2kagit.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "p2 nesne kirildi yenisi varsa uretilir");
                        p2KagitVarMi=false;
                    }
                }
            }

           System.out.println("kullanici kazandi");
        
        }

        if(p2==2 && p1==0 && p1TasVarMi==true && p2MakasVarMi==true){
             //pc vurusu
            if(p2NesneSeviye[2]==1){
                //pcnesne superse
                if(p1NesneSeviye[0]==1){
                    //vurdugu nesne superse
                    etkimks= p2smakas.etkiHesapla(0, 0, 2, 2);
                    canDusur(p1stas, etkimks);
                    if(p1stas.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "p1 nesne kirildi yenisi varsa uretilir");
                    p1TasVarMi=false;
                    }
                }else {
                    //vurdugu nesne normalse
                     etkimks = p2smakas.etkiHesapla(0, 0, 2, 1);
                     canDusur(p1tas, etkimks);
                     if(p1tas.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "p1 nesne kirildi yenisi varsa uretilir");
                    p1TasVarMi=false;
                    }
                }
            }else {
                //pcnesnee normalse
                if(p1NesneSeviye[0]==1){
                    //vurdugu nesne superse
                    etkimks = p2makas.etkiHesapla(0, 0, 2, 2);
                    canDusur(p1stas, etkimks);
                    if(p1stas.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "p1 nesne kirildi yenisi varsa uretilir");
                    p1TasVarMi=false;
                    }
                }else {
                     //vurdugu nesne normalse
                     etkimks = p2makas.etkiHesapla(0, 0, 2, 1);
                     canDusur(p1tas, etkimks);
                     if(p1tas.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "p1 nesne kirildi yenisi varsa uretilir");
                    p1TasVarMi=false;
                    }
                }
            }
            
            //kullanıcı vurusu
            if(p1NesneSeviye[0]==1){
                if(p2NesneSeviye[2]==1){
                    //vurdugu nesne superse
                    etkitas = p1stas.etkiHesapla(2, 2, 0, 0);
                    canDusur(p2smakas, etkitas);
                    p1stas.seviyePuani+=20;
                    if(p2smakas.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "p2 nesne kirildi yenisi varsa uretilir");
                        p2MakasVarMi=false;
                    }
                }else {
                    //vurdugu nesne normalse
                     etkitas = p1stas.etkiHesapla(2, 1, 0, 0);
                     canDusur(p2makas, etkitas);
                     p1stas.seviyePuani+=20;
                     if(p2makas.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "p2 nesne kirildi yenisi varsa uretilir");
                        p2MakasVarMi=false;
                    }
                }
            }else {
                if(p2NesneSeviye[2]==1){
                    //vurdugu nesne superse
                    etkitas = p1tas.etkiHesapla(2, 2, 0, 0);
                    canDusur(p2smakas, etkitas);
                    p1tas.seviyePuani+=20;
                    if(p1tas.seviyePuani>30){
                        p1tas.dayaniklilik=0;
                        p1NesneSeviye[0]=1;
                        p1stas.dayaniklilik=20;
                    }
                    if(p2smakas.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "p2 nesne kirildi yenisi varsa uretilir");
                        p2MakasVarMi=false;
                    }
                }else {
                    //vurdugu nesne normalse
                     etkitas = p1tas.etkiHesapla(2, 1, 0, 0);
                     canDusur(p2makas, etkitas);
                     p1tas.seviyePuani+=20;
                    if(p1tas.seviyePuani>30){
                        p1tas.dayaniklilik=0;
                        p1NesneSeviye[0]=1;
                        p1stas.dayaniklilik=20;
                    }
                    if(p2makas.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "p2 nesne kirildi yenisi varsa uretilir");
                        p2MakasVarMi=false;
                    }
                }
            }

           System.out.println("kullanici kazandi");
        }
        if(p2==2 && p1==1 && p2MakasVarMi==true && p1KagitVarMi==true){
             //pc vurusu
            if(p2NesneSeviye[2]==1){
                if(p1NesneSeviye[1]==1){
                    //vurdugu nesne superse
                    etkimks = p2smakas.etkiHesapla(2, 2, 0, 0);
                    canDusur(p1skagit, etkimks);
                    if(p1skagit.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "p1 nesne kirildi yenisi varsa uretilir");
                    p1KagitVarMi=false;
                    }
                }else {
                    //vurdugu nesne normalse
                     etkimks = p2smakas.etkiHesapla(2, 1, 0, 0);
                     canDusur(p1kagit, etkimks);
                     if(p1kagit.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "p1 nesne kirildi yenisi varsa uretilir");
                    p1KagitVarMi=false;
                    }
                }
            }else {
                if(p1NesneSeviye[1]==1){
                    //vurdugu nesne superse
                    etkimks = p2makas.etkiHesapla(2, 2, 0, 0);
                    canDusur(p1skagit, etkimks);
                    if(p1skagit.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "p1 nesne kirildi yenisi varsa uretilir");
                    p1KagitVarMi=false;
                    }
                    p2makas.seviyePuani+=20;
                     if(p2makas.seviyePuani>30){
                        p2makas.dayaniklilik=0;
                        p2NesneSeviye[2]=1;
                        p2smakas.dayaniklilik=20;
                    }
                }else {
                    //vurdugu nesne normalse
                     etkimks = p2makas.etkiHesapla(2, 1, 0, 0);
                     canDusur(p1kagit, etkimks);
                     if(p1kagit.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "p1 nesne kirildi yenisi varsa uretilir");
                    p1KagitVarMi=false;
                    }
                     p2makas.seviyePuani+=20;
                     if(p2makas.seviyePuani>30){
                        p2makas.dayaniklilik=0;
                        p2NesneSeviye[2]=1;
                        p2smakas.dayaniklilik=20;
                    }
                }
            }
            //kullanıcı vurusu
            if(p1NesneSeviye[1]==1){
                if(p2NesneSeviye[2]==1){
                    //vurdugu nesne superse
                    etkikgt = p1skagit.etkiHesapla(0, 0, 2, 2);
                    canDusur(p2smakas, etkikgt);
                    if(p2smakas.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "p2 nesne kirildi yenisi varsa uretilir");
                        p2MakasVarMi=false;
                    }
                    
                }else {
                    //vurdugu nesne normalse
                     etkikgt = p1skagit.etkiHesapla(0, 0, 2, 1);
                     canDusur(p2makas, etkikgt);
                     if(p2makas.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "p2 nesne kirildi yenisi varsa uretilir");
                        p2MakasVarMi=false;
                    }
                }
            }else {
                if(p2NesneSeviye[2]==1){
                    //vurdugu nesne superse
                    etkikgt = p1kagit.etkiHesapla(0, 0, 2, 2);
                    canDusur(p2smakas, etkikgt);
                    if(p2smakas.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "p2 nesne kirildi yenisi varsa uretilir");
                        p2MakasVarMi=false;
                    }
                }else {
                    //vurdugu nesne normalse
                     etkikgt = p1kagit.etkiHesapla(0, 0, 2, 1);
                     canDusur(p2makas, etkikgt);
                     if(p2makas.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "p2 nesne kirildi yenisi varsa uretilir");
                        p2MakasVarMi=false;
                    }
                }
            }

            System.out.println("pc kazandi");
        }


        }
    /********************************************************************************************/
    //secebilir mi
    int tasSecSay=0;
    int kgtSecSay=0;
    int mksSecSay=0;
    public boolean secebilirMi(int girdi){
        
        switch (girdi) {
            case 0 -> {
                return tasSecSay<(p2Nesneleri[0]+1-p2NesneleriKont[0]);
            }

            case 1 -> {
                return kgtSecSay<(p2Nesneleri[1]+1-p2NesneleriKont[1]);
            }

            case 2 -> {
                return mksSecSay < (p2Nesneleri[2]+1-p2NesneleriKont[2]);
            }


            default -> {
            }
        }
        
        return false;
    
    }
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Bilgisayar1");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setText("Bilgisayar2");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/soru.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/soru.png"))); // NOI18N

        jLabel2.setText("Round : ");

        jLabel6.setText("0");

        jToggleButton1.setText("Basla");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(203, 203, 203)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jToggleButton1)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    boolean nesnelerTamMi(){
        return !(p1.skor<0) || !(p2.skor<0) ;
    
    }
    
    
    
    public void oyun(){
        while(round<oyunAdedi){
            int secim1= p1Sectir();
            int secim2= p2Sectir();
            karistir();
            kiyasla(secim2,secim1);
            if(!(nesnelerTamMi())){
                break;
            }
            p1NesneUret();
            p2NesneUret();
            round++;
        }
        
        kazananKim();
    }
    
    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
       p1NesneUret();
       p2NesneUret();
       oyun();
        
        
        
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pcVSpc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pcVSpc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pcVSpc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pcVSpc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pcVSpc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
