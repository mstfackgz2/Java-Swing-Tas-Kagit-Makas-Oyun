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

public class kullaniciVSpc extends javax.swing.JFrame {
    
    public int oyunAdedi;
    int round=0;
    
    public int pcNesneleri[]={0,0,0};
    public int pcNesneleriKont[]={0,0,0};
    public int kullaniciNesneleri[]={0,0,0};
    public int kullaniciNesnelerikont[]={0,0,0};
    
    public int kullaniciNesneSeviye[]={0,0,0};
    public int pcNesneSeviye[]={0,0,0};
    
    
    public kullaniciVSpc() {
        initComponents();
    }
    
    oyuncu k1,p1;
    
    public kullaniciVSpc(int oyunAdedi, int[] pcNesneleri, int[] kullaniciNesneleri,oyuncu p1,oyuncu k1) {
        initComponents();
        this.oyunAdedi = oyunAdedi;
        this.pcNesneleri = pcNesneleri;
        this.kullaniciNesneleri= kullaniciNesneleri;
        this.k1=k1;
        this.p1=p1;
        
    }
    
    
    /********************************************************************************************/
    //nesneler ve uretmeler
    nesneSinifi[] kullaniciNesne =new nesneSinifi[3];
    nesneSinifi[] pcNesne =new nesneSinifi[3];
    
    boolean pcTasVarMi= false ;
    boolean pcKagitVarMi= false ;
    boolean pcMakasVarMi= false ;
    
    boolean kTasVarMi= false ;
    boolean kKagitVarMi= false ;
    boolean kMakasVarMi= false ;
    
    nesneSinifi ktas = new tasSinifi(2, 0, 0);
    nesneSinifi kkagit = new kagitSinifi(2, 0, 0);
    nesneSinifi kmakas = new makasSinifi(2, 0, 0);
    
    nesneSinifi ptas = new tasSinifi(2, 0, 0);
    nesneSinifi pkagit = new kagitSinifi(2, 0, 0);
    nesneSinifi pmakas = new makasSinifi(2, 0, 0);
    
    nesneSinifi kstas = new agirTasSinifi(2, 2, 0, 0);
    nesneSinifi kskagit = new ozelKagitSinifi(2, 2, 0, 0);
    nesneSinifi ksmakas = new ustaMakasSinifi(2, 2, 0, 0);
    
    nesneSinifi pstas = new agirTasSinifi(2, 2, 0, 0);
    nesneSinifi pskagit = new ozelKagitSinifi(2, 2, 0, 0);
    nesneSinifi psmakas = new ustaMakasSinifi(2, 2, 0, 0);
    
    public void kNesneUret(){
        if (kullaniciNesnelerikont[0]!=kullaniciNesneleri[0] && kTasVarMi==false){
            if(kullaniciNesneSeviye[0]==1){
            kstas.dayaniklilik=20;
            kstas.seviyePuani=0;
            kullaniciNesne[0]=kstas;
            kTasVarMi=true;
            kullaniciNesnelerikont[0]+=1;
                System.out.println("Kullanici STas uretildi");
            }
            else if(kullaniciNesneSeviye[0]==0){
            ktas.dayaniklilik=20;
            ktas.seviyePuani=0;
            kullaniciNesne[0]=ktas;
            kullaniciNesnelerikont[0]+=1;
            kTasVarMi=true;
            System.out.println("Kullanici Tas uretildi");
            }
            }
        if (kullaniciNesnelerikont[1]!=kullaniciNesneleri[1] && kKagitVarMi==false){
            if(kullaniciNesneSeviye[1]==1){
            kskagit.dayaniklilik=20;
            kskagit.seviyePuani=0;
            kullaniciNesne[1]=kskagit;
            kKagitVarMi=true;
            kullaniciNesnelerikont[1]+=1;
            System.out.println("Kullanici Skagit uretildi");
            }
            else if(kullaniciNesneSeviye[1]==0){
            kkagit.dayaniklilik=20;
            kkagit.seviyePuani=0;
            kullaniciNesne[1]=kkagit;
            kullaniciNesnelerikont[1]+=1;
            kKagitVarMi=true;
            System.out.println("Kullanici Kagit uretildi");
            }
            }
        if (kullaniciNesnelerikont[2]!=kullaniciNesneleri[2] && kMakasVarMi==false){
            if(kullaniciNesneSeviye[2]==1){
            ksmakas.dayaniklilik=20;
            ksmakas.seviyePuani=0;
            kullaniciNesne[2]=ksmakas;
            kMakasVarMi=true;
            kullaniciNesnelerikont[2]+=1;
            System.out.println("Kullanici Smakas uretildi");
            }
            else if(kullaniciNesneSeviye[2]==0){
            kmakas.dayaniklilik=20;
            kmakas.seviyePuani=0;
            kullaniciNesne[2]=kmakas;
            kullaniciNesnelerikont[2]+=1;
            kMakasVarMi=true;
            System.out.println("Kullanici makas uretildi");
            }
            }
    }
    
    public void pNesneUret(){
        if (pcNesneleriKont[0]!=pcNesneleri[0] && pcTasVarMi==false){
            if(pcNesneSeviye[0]==1){
            pstas.dayaniklilik=20;
            pstas.seviyePuani=0;
            pcNesne[0]=pstas;
            pcTasVarMi=true;
            pcNesneleriKont[0]+=1;
            System.out.println("pc Stass uretildi");
            }
            else if(pcNesneSeviye[0]==0){
            ptas.dayaniklilik=20;
            ptas.seviyePuani=0;
            pcNesne[0]=ptas;
            pcNesneleriKont[0]+=1;
            pcTasVarMi=true;
            System.out.println("pc tas uretildi");
            }
            }
        if (pcNesneleriKont[1]!=pcNesneleri[1] && pcKagitVarMi==false){
            if(pcNesneSeviye[1]==1){
            pskagit.dayaniklilik=20;
            pskagit.seviyePuani=0;
            pcNesne[1]=pskagit;
            pcKagitVarMi=true;
            pcNesneleriKont[1]+=1;
            System.out.println("pc Skagit uretildi");
            }
            else if(pcNesneSeviye[1]==0){
            pkagit.dayaniklilik=20;
            pkagit.seviyePuani=0;
            pcNesne[1]=pkagit;
            pcNesneleriKont[1]+=1;
            pcKagitVarMi=true;
            System.out.println("pc kagit uretildi");
            }
            }
        if (pcNesneleriKont[2]!=pcNesneleri[2] && pcMakasVarMi==false){
            if(pcNesneSeviye[2]==1){
            psmakas.dayaniklilik=20;
            psmakas.seviyePuani=0;
            pcNesne[2]=psmakas;
            pcMakasVarMi=true;
            pcNesneleriKont[2]+=1;
            System.out.println("pc SMakas uretildi");
            }
            else if(pcNesneSeviye[2]==0){
            pmakas.dayaniklilik=20;
            pmakas.seviyePuani=0;
            pcNesne[2]=pmakas;
            pcNesneleriKont[2]+=1;
            pcMakasVarMi=true;
                System.out.println("pc Makas uretildi");
            }
            }
    }
    
    /********************************************************************************************/
    
    public Image tasResim = new ImageIcon("src\\images\\tas.png").getImage();
    public Image kagitResim = new ImageIcon("src\\images\\kagit.png").getImage();
    public Image makasResim = new ImageIcon("src\\images\\makas.png").getImage();
    
    public Image stasResim = new ImageIcon("src\\images\\sTas.png").getImage();
    public Image skagitResim = new ImageIcon("src\\images\\sKagit.png").getImage();
    public Image smakasResim = new ImageIcon("src\\images\\sMakas.png").getImage();
    
    public Image soruResim = new ImageIcon("src\\images\\soru.png").getImage();
    
    public void karistir(){
        jLabel5.setText("PC Secim Yapiyor"); 
        Thread shake = new Thread(){
            public void run(){
                for(;;){
                     
                       jLabel4.setIcon(new ImageIcon(tasResim));
                 try {
                     sleep(200);
                 }
                 catch (InterruptedException ex) {                
                 }
                 jLabel4.setIcon(new ImageIcon(kagitResim));
                 try {
                     sleep(200);
                 }
                 catch (InterruptedException ex) {                
                 }
                 jLabel4.setIcon(new ImageIcon(makasResim));
                 try {
                     sleep(200);
                 }
                 catch (InterruptedException ex) {                
                 }
                 jLabel4.setIcon(new ImageIcon(soruResim));
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
    // can hesaplama
    public void kazananKim(){
        double kullaniciKalanDayaniklilik = ktas.dayaniklilik+kkagit.dayaniklilik+kmakas.dayaniklilik+
            kskagit.dayaniklilik+kstas.dayaniklilik+ksmakas.dayaniklilik+
            ((kullaniciNesneleri[0]-kullaniciNesnelerikont[0])*20)+((kullaniciNesneleri[1]-kullaniciNesnelerikont[1])*20)+((kullaniciNesneleri[2]-kullaniciNesnelerikont[2])*20);
    
            double pcKalanDayaniklilik=ptas.dayaniklilik+pkagit.dayaniklilik+pmakas.dayaniklilik+
            pstas.dayaniklilik+pskagit.dayaniklilik+psmakas.dayaniklilik+
            ((pcNesneleri[0]-pcNesneleriKont[0])*20)+((pcNesneleri[1]-pcNesneleriKont[1])*20)+((pcNesneleri[2]-pcNesneleriKont[2])*20);
   
            p1.skor = pcKalanDayaniklilik ;
            k1.skor = kullaniciKalanDayaniklilik ;
        
        
            if(kullaniciKalanDayaniklilik>pcKalanDayaniklilik){
                    JOptionPane.showMessageDialog(null, "!!! Kullanici Kazandi !!!  Kullanıcı skor: "+k1.skor+" pc skor: "+p1.skor);
            }else if(pcKalanDayaniklilik>kullaniciKalanDayaniklilik)  {
                     JOptionPane.showMessageDialog(null, "!!! Pc Kazandi !!!  Kullanıcı skor: "+k1.skor+" pc skor: "+p1.skor);
            }else {
                JOptionPane.showMessageDialog(null, "!!! Berabere !!!  Kullanıcı skor: "+k1.skor+" pc skor: "+p1.skor);
            
            }
   } 
    
    /********************************************************************************************/
    Random r = new Random();
        
    double etkitas ;
    double etkikgt;
    double etkimks;
    int secim;
    
    public int pcSectir(){
         
        
        secim = r.nextInt(3);
        
        while(pcKagitVarMi || pcKagitVarMi || pcMakasVarMi){
            if(secim==0 && pcTasVarMi){
                System.out.println("pc: tas");
            break;}
            else if(secim==1 && pcKagitVarMi){
                System.out.println("pc: kagit");
                 break;}
            else if(secim==2 && pcMakasVarMi){
                System.out.println("pc: makas");
                break;}
            else secim = r.nextInt(3);
        }
        return secim;
    }
    
    public void canDusur(nesneSinifi nesne,double hitk){
        nesne.setDayaniklilik(nesne.getDayaniklilik()-hitk);
    }
    
    public void dynBas(){
        if(kullaniciNesneSeviye[0]==0){
            jLabel7.setText(""+ktas.getDayaniklilik());
        }else {
           jLabel7.setText(""+kstas.getDayaniklilik()); 
        }
        if(kullaniciNesneSeviye[1]==0){
            jLabel8.setText(""+kkagit.getDayaniklilik());
        }else {
           jLabel8.setText(""+kskagit.getDayaniklilik());
        }
        if(kullaniciNesneSeviye[2]==0){
             jLabel9.setText(""+kmakas.getDayaniklilik());
        }else {
            jLabel9.setText(""+ksmakas.getDayaniklilik());
        }
    }
    
    public void resBas(){
        if(kullaniciNesneSeviye[0]==1){
            jButton1.setIcon(new ImageIcon(stasResim));
        }else {
            jButton1.setIcon(new ImageIcon(tasResim));
        }
        if(kullaniciNesneSeviye[1]==1){
            jButton2.setIcon(new ImageIcon(skagitResim));
        }else {
            jButton2.setIcon(new ImageIcon(kagitResim));
        }
        if(kullaniciNesneSeviye[2]==1){
            jButton3.setIcon(new ImageIcon(smakasResim));
        }else {
            jButton3.setIcon(new ImageIcon(makasResim));
        }
    }
    
    boolean nesnelerTamMi(){
        if(ktas.dayaniklilik+kkagit.dayaniklilik+kmakas.dayaniklilik+
            kskagit.dayaniklilik+kstas.dayaniklilik+ksmakas.dayaniklilik+
            ((kullaniciNesneleri[0]-kullaniciNesnelerikont[0])*20)+((kullaniciNesneleri[1]-kullaniciNesnelerikont[1])*20)+((kullaniciNesneleri[2]-kullaniciNesnelerikont[2])*20)<0){
        return true;
        }else if (ptas.dayaniklilik+pkagit.dayaniklilik+pmakas.dayaniklilik+
            pstas.dayaniklilik+pskagit.dayaniklilik+psmakas.dayaniklilik+
            ((pcNesneleri[0]-pcNesneleriKont[0])*20)+((pcNesneleri[1]-pcNesneleriKont[1])*20)+((pcNesneleri[2]-pcNesneleriKont[2])*20)<0){
        return true;}else {
            return false;}
    
            
            }
    
    public void oyunuBitir(){
        kazananKim();
        System.exit(0);
    }
    
    public void oyun(int secim){
        if(oyunAdedi>=round){
        int pcSecim = pcSectir();
        karistir();
        kiyasla(pcSecim,secim);
            if (nesnelerTamMi()) {
                oyunuBitir();
            }
        kNesneUret();
        pNesneUret();
        dynBas();
        resBas();
        /*if(!secebilirMi(0) && !secebilirMi(1) && !secebilirMi(2)){
            
        }*/
        
        }
        
        else{
            oyunuBitir();
            
        }
    }
    
    
    public void kiyasla(int pc,int k){
        
        if(pc==0 && k==0 && pcTasVarMi==true && kTasVarMi==true){
            
            int hitpc,hitk;            
            //pc vurusu
            
            
            if(pcNesneSeviye[0]==1){
                //pcnesne superse
                hitpc=4;
                
                if(kullaniciNesneSeviye[0]==1){
                //vurudu superse 
                    canDusur(kstas, hitpc);
                    if(kstas.dayaniklilik<0){
                        kstas.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "k nesne kirildi yenisi varsa uretilir");
                        kTasVarMi=false;
                    }
                }else{
                //vurudu normalse
                    canDusur(ktas, hitpc);
                     if(ktas.dayaniklilik<0){
                         ktas.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "k nesne kirildi yenisi varsa uretilir");
                        kTasVarMi=false;
                    }
                }
                
                
            }else {
                //pcnesnee normalse
                hitpc=2;
                if(kullaniciNesneSeviye[0]==1){
                     //vurudu superse 
                     canDusur(kstas, hitpc);
                     if(kstas.dayaniklilik<0){
                         kstas.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "k nesne kirildi yenisi varsa uretilir");
                        kTasVarMi=false;
                    }
                }else{
                     //vurudu super degilse
                     canDusur(ktas, hitpc);
                     if(ktas.dayaniklilik<0){
                         ktas.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "k nesne kirildi yenisi varsa uretilir");
                        kTasVarMi=false;
                    }
                }
            }
            
            //kullanici vurusu
            if(kullaniciNesneSeviye[0]==1){
                //kullanici nesne superse
                hitk=4;
                if(pcNesneSeviye[0]==1){
                    //vurdugu nesne superse
                    canDusur(pstas, hitk);
                    if(pstas.dayaniklilik<0){
                        pstas.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "pc nesne kirildi yenisi varsa uretilir");
                        pcTasVarMi=false;
                    }
                }else{
                    //vurdugu nesne normalse
                    canDusur(ptas, hitk);
                    if(ptas.dayaniklilik<0){
                        ptas.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "pc nesne kirildi yenisi varsa uretilir");
                        pcTasVarMi=false;
                    }
                
                } 
                
            }else {
                //kullanici nesne normalse
                hitk=2;
                if(pcNesneSeviye[0]==1){
                    //vurdugu nesne superse
                    canDusur(pstas, hitk);
                    if(pstas.dayaniklilik<0){
                        pstas.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "pc nesne kirildi yenisi varsa uretilir");
                        pcTasVarMi=false;
                    }
                }else{
                   //vurdugu nesne normalse
                   canDusur(ptas, hitk);
                    if(ptas.dayaniklilik<0){
                        ptas.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "pc nesne kirildi yenisi varsa uretilir");
                        pcTasVarMi=false;
                    }
                }
            }
            
            System.out.println("berabere");
        }
        
        
        
        
        if(pc==1 && k==1 && pcKagitVarMi==true && kKagitVarMi==true){
            
            int hitpc,hitk;            
            //pc vurusu
            
            
            if(pcNesneSeviye[1]==1){
                //pcnesne superse
                hitpc=4;
                
                if(kullaniciNesneSeviye[1]==1){
                //vurudu superse 
                    canDusur(kskagit, hitpc);
                    if(kskagit.dayaniklilik<0){
                        kskagit.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "k nesne kirildi yenisi varsa uretilir");
                        kKagitVarMi=false;
                    }
                }else{
                //vurudu normalse
                    canDusur(kkagit, hitpc);
                     if(kkagit.dayaniklilik<0){
                         kkagit.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "k nesne kirildi yenisi varsa uretilir");
                        kKagitVarMi=false;
                    }
                }
                
                
            }else {
                //pcnesnee normalse
                hitpc=2;
                if(kullaniciNesneSeviye[1]==1){
                     //vurudu superse 
                     canDusur(kskagit, hitpc);
                     if(kskagit.dayaniklilik<0){
                         kskagit.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "k nesne kirildi yenisi varsa uretilir");
                        kKagitVarMi=false;
                    }
                }else{
                     //vurudu super degilse
                     canDusur(kkagit, hitpc);
                     if(kkagit.dayaniklilik<0){
                         kkagit.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "k nesne kirildi yenisi varsa uretilir");
                        kKagitVarMi=false;
                    }
                }
            }
            
            //kullanici vurusu
            if(kullaniciNesneSeviye[1]==1){
                //kullanici nesne superse
                hitk=4;
                if(pcNesneSeviye[1]==1){
                    //vurdugu nesne superse
                    canDusur(pskagit, hitk);
                    if(pskagit.dayaniklilik<0){
                        pskagit.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "pc nesne kirildi yenisi varsa uretilir");
                        pcKagitVarMi=false;
                    }
                }else{
                    //vurdugu nesne normalse
                    canDusur(pkagit, hitk);
                    if(pkagit.dayaniklilik<0){
                        pkagit.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "pc nesne kirildi yenisi varsa uretilir");
                        pcKagitVarMi=false;
                    }
                
                } 
                
            }else {
                //kullanici nesne normalse
                hitk=2;
                if(pcNesneSeviye[1]==1){
                    //vurdugu nesne superse
                    canDusur(pskagit, hitk);
                    if(pskagit.dayaniklilik<0){
                        pskagit.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "pc nesne kirildi yenisi varsa uretilir");
                        pcKagitVarMi=false;
                    }
                }else{
                   //vurdugu nesne normalse
                   canDusur(pkagit, hitk);
                    if(pkagit.dayaniklilik<0){
                        pkagit.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "pc nesne kirildi yenisi varsa uretilir");
                        pcKagitVarMi=false;
                    }
                }
            }
            
            System.out.println("berabere");
        }
        
        
        
        
        if(pc==2 && k==2 && pcMakasVarMi==true && kMakasVarMi== true){
            
            int hitpc,hitk;            
            //pc vurusu
            
            
            if(pcNesneSeviye[2]==1){
                //pcnesne superse
                hitpc=4;
                
                if(kullaniciNesneSeviye[2]==1){
                //vurudu superse 
                    canDusur(ksmakas, hitpc);
                    if(ksmakas.dayaniklilik<0){
                        ksmakas.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "k nesne kirildi yenisi varsa uretilir");
                        kMakasVarMi=false;
                    }
                }else{
                //vurudu normalse
                    canDusur(kmakas, hitpc);
                     if(kmakas.dayaniklilik<0){
                         kmakas.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "k nesne kirildi yenisi varsa uretilir");
                        kMakasVarMi=false;
                    }
                }
                
                
            }else {
                //pcnesnee normalse
                hitpc=2;
                if(kullaniciNesneSeviye[2]==1){
                     //vurudu superse 
                     canDusur(ksmakas, hitpc);
                     if(ksmakas.dayaniklilik<0){
                         ksmakas.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "k nesne kirildi yenisi varsa uretilir");
                        kMakasVarMi=false;
                    }
                }else{
                     //vurudu super degilse
                     canDusur(kmakas, hitpc);
                     if(kmakas.dayaniklilik<0){
                         kmakas.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "k nesne kirildi yenisi varsa uretilir");
                        kMakasVarMi=false;
                    }
                }
            }
            
            
            
            //kullanici vurusu
            if(kullaniciNesneSeviye[2]==1){
                //kullanici nesne superse
                hitk=4;
                if(pcNesneSeviye[2]==1){
                    //vurdugu nesne superse
                    canDusur(psmakas, hitk);
                    if(psmakas.dayaniklilik<0){
                        psmakas.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "pc nesne kirildi yenisi varsa uretilir");
                        pcMakasVarMi=false;
                    }
                }else{
                    //vurdugu nesne normalse
                    canDusur(pmakas, hitk);
                    if(pmakas.dayaniklilik<0){
                        pmakas.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "pc nesne kirildi yenisi varsa uretilir");
                        pcMakasVarMi=false;
                    }
                
                } 
                
            }else {
                //kullanici nesne normalse
                hitk=2;
                if(pcNesneSeviye[2]==1){
                    //vurdugu nesne superse
                    canDusur(psmakas, hitk);
                    if(psmakas.dayaniklilik<0){
                        psmakas.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "pc nesne kirildi yenisi varsa uretilir");
                        pcMakasVarMi=false;
                    }
                }else{
                   //vurdugu nesne normalse
                   canDusur(pmakas, hitk);
                    if(pmakas.dayaniklilik<0){
                        pmakas.dayaniklilik=0;
                        JOptionPane.showMessageDialog(null, "pc nesne kirildi yenisi varsa uretilir");
                        pcMakasVarMi=false;
                    }
                }
            }
            
            System.out.println("berabere");
        }
       
        
        if(pc==0 && k==1 && pcTasVarMi==true && kKagitVarMi==true){
            
            //pc vurusu
            if(pcNesneSeviye[0]==1){
                //pcnesne superse
                if(kullaniciNesneSeviye[1]==1){
                    //vurdugu nesne superse
                    etkitas = pstas.etkiHesapla(0, 0, 2, 2);
                    canDusur(kskagit, etkitas);
                    if(kskagit.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "k nesne kirildi yenisi varsa uretilir");
                        kKagitVarMi=false;
                    }
                    
                }else {
                    //vurdugu nesne normalse
                     etkitas = pstas.etkiHesapla(0, 0, 2, 1);
                     canDusur(kkagit, etkitas);
                     if(kkagit.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "k nesne kirildi yenisi varsa uretilir");
                        kKagitVarMi=false;
                    }
                     
                }
            }else {
                //pcnesnee normalse
                if(kullaniciNesneSeviye[1]==1){
                    //vurdugu nesne superse
                    etkitas = ptas.etkiHesapla(0, 0, 2, 2);
                    canDusur(kskagit, etkitas);
                    if(kskagit.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "k nesne kirildi yenisi varsa uretilir");
                        kKagitVarMi=false;
                    }
                }else {
                    //vurdugu nesne normalse
                    etkitas = ptas.etkiHesapla(0, 0, 2, 1);
                    canDusur(kkagit, etkitas);
                    if(kkagit.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "k nesne kirildi yenisi varsa uretilir");
                        kKagitVarMi=false;
                    }
                }
            }
            
            //kullanıcı vurusu
            if(kullaniciNesneSeviye[1]==1){
                if(pcNesneSeviye[0]==1){
                    //vurdugu nesne superse
                    etkikgt = kskagit.etkiHesapla(2, 2, 0, 0);
                    canDusur(pstas, etkikgt);
                    if(pstas.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "pc nesne kirildi yenisi varsa uretilir");
                        pcTasVarMi=false;
                    }
                    kskagit.seviyePuani=kskagit.seviyePuani+20;
                }else {
                    //vurdugu nesne normalse
                     etkikgt = kskagit.etkiHesapla(2, 1, 0, 0);
                     canDusur(ptas, etkikgt);
                     if(ptas.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "pc nesne kirildi yenisi varsa uretilir");
                        pcTasVarMi=false;
                    }
                    kskagit.seviyePuani=kskagit.seviyePuani+20;
                }
            }else {
                if(pcNesneSeviye[0]==1){
                    //vurdugu nesne superse
                    etkikgt = kkagit.etkiHesapla(2, 2, 0, 0);
                    canDusur(pstas, etkikgt);
                    if(pstas.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "pc nesne kirildi yenisi varsa uretilir");
                        pcTasVarMi=false;
                    }
                    kkagit.seviyePuani=kkagit.seviyePuani+20;
                    if(kkagit.seviyePuani>30){
                        kkagit.dayaniklilik=0;
                        kullaniciNesneSeviye[1]=1;
                        kskagit.dayaniklilik=20;
                    }
                }else {
                    //vurdugu nesne normalse
                     etkikgt = kkagit.etkiHesapla(2, 1, 0, 0);
                     canDusur(ptas, etkikgt);
                     if(ptas.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "pc nesne kirildi yenisi varsa uretilir");
                        pcTasVarMi=false;
                    }
                     kkagit.seviyePuani=kkagit.seviyePuani+20;
                     if(kkagit.seviyePuani>30){
                        kkagit.dayaniklilik=0;
                        kullaniciNesneSeviye[1]=1;
                        kskagit.dayaniklilik=20;
                    }
                }
            }
            
            
            
            
           System.out.println("kullanici kazandi");
        }
       
        if(pc==0 && k==2 && pcTasVarMi==true && kMakasVarMi== true){
            //pc vurusu
            if(pcNesneSeviye[0]==1){
                if(kullaniciNesneSeviye[2]==1){
                    //vurdugu nesne superse
                    etkitas = pstas.etkiHesapla(2, 2, 0, 0);
                    canDusur(ksmakas, etkitas);
                    if(ksmakas.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "son nesne kirildi yenisi varsa uretilir");
                    kMakasVarMi=false;
                    }
                    pstas.seviyePuani+=20;
                }else {
                    //vurdugu nesne normalse
                     etkitas = pstas.etkiHesapla(2, 1, 0, 0);
                     canDusur(kmakas, etkitas);
                     if(kmakas.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "son nesne kirildi yenisi varsa uretilir");
                    kMakasVarMi=false;
                    }
                     pstas.seviyePuani+=20;
                }
            }else {
                if(kullaniciNesneSeviye[2]==1){
                    //vurdugu nesne superse
                    etkitas = ptas.etkiHesapla(2, 2, 0, 0);
                    canDusur(ksmakas, etkitas);
                    if(ksmakas.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "son nesne kirildi yenisi varsa uretilir");
                    kMakasVarMi=false;
                    }
                    ptas.seviyePuani+=20;
                    if(ptas.seviyePuani>30){
                        ptas.dayaniklilik=0;
                        pcNesneSeviye[0]=1;
                        pstas.dayaniklilik=20;
                    }
                }else {
                    //vurdugu nesne normalse
                     etkitas = ptas.etkiHesapla(2, 1, 0, 0);
                     canDusur(kmakas, etkitas);
                     if(kmakas.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "son nesne kirildi yenisi varsa uretilir");
                    kMakasVarMi=false;
                    }
                     ptas.seviyePuani+=20;
                     if(ptas.seviyePuani>30){
                        ptas.dayaniklilik=0;
                        pcNesneSeviye[0]=1;
                        pstas.dayaniklilik=20;
                    }
                }
            }
            //kullanıcı vurusu
            if(kullaniciNesneSeviye[2]==1){
                if(pcNesneSeviye[0]==1){
                    //vurdugu nesne superse
                    etkimks = ksmakas.etkiHesapla(0, 0, 2, 2);
                    canDusur(pstas, etkimks);
                    if(pstas.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "son nesne kirildi yenisi varsa uretilir");
                        pcTasVarMi=false;
                    }
                }else {
                    //vurdugu nesne normalse
                     etkimks = ksmakas.etkiHesapla(0, 0, 2, 1);
                     canDusur(ptas, etkimks);
                     if(ptas.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "son nesne kirildi yenisi varsa uretilir");
                        pcTasVarMi=false;
                    }
                }
            }else {
                if(pcNesneSeviye[0]==1){
                    //vurdugu nesne superse
                    etkimks = kmakas.etkiHesapla(0, 0, 2, 2);
                    canDusur(pstas, etkimks);
                    if(pstas.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "son nesne kirildi yenisi varsa uretilir");
                        pcTasVarMi=false;
                    }
                }else {
                    //vurdugu nesne normalse
                     etkimks = kmakas.etkiHesapla(0, 0, 2, 1);
                     canDusur(ptas, etkimks);
                     if(ptas.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "son nesne kirildi yenisi varsa uretilir");
                        pcTasVarMi=false;
                    }
                }
            }

            System.out.println("pc kazandi");
        }

        if(pc==1 && k==0 && kTasVarMi==true && pcKagitVarMi==true){
            //pc vurusu
            if(pcNesneSeviye[1]==1){
                if(kullaniciNesneSeviye[0]==1){
                    //vurdugu nesne superse
                    etkikgt = pskagit.etkiHesapla(2, 2, 0, 0);
                    canDusur(kstas, etkikgt);
                    if(kstas.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "k nesne kirildi yenisi varsa uretilir");
                    kTasVarMi=false;
                    }
                    pskagit.seviyePuani+=20;
                }else {
                    //vurdugu nesne normalse
                     etkikgt = pskagit.etkiHesapla(2, 1, 0, 0);
                     canDusur(ktas, etkikgt);
                     if(ktas.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "k nesne kirildi yenisi varsa uretilir");
                    kTasVarMi=false;
                    }
                     pskagit.seviyePuani+=20;
                }
            }else {
                if(kullaniciNesneSeviye[0]==1){
                    //vurdugu nesne superse
                    etkikgt = pkagit.etkiHesapla(2, 2, 0, 0);
                    canDusur(kstas, etkikgt);
                    if(kstas.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "k nesne kirildi yenisi varsa uretilir");
                    kTasVarMi=false;
                    }
                    pkagit.seviyePuani+=20;
                    if(pkagit.seviyePuani>30){
                        pkagit.dayaniklilik=0;
                        pcNesneSeviye[1]=1;
                        pskagit.dayaniklilik=20;
                    }
                }else {
                    //vurdugu nesne normalse
                     etkikgt = pkagit.etkiHesapla(2, 1, 0, 0);
                     canDusur(ktas, etkikgt);
                     if(ktas.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "k nesne kirildi yenisi varsa uretilir");
                    kTasVarMi=false;
                    }
                     pkagit.seviyePuani+=20;
                     if(pkagit.seviyePuani>30){
                        pkagit.dayaniklilik=0;
                        pcNesneSeviye[1]=1;
                        pskagit.dayaniklilik=20;
                    }
                }
            }
            //kullanıcı vurusu
            if(kullaniciNesneSeviye[0]==1){
                if(pcNesneSeviye[1]==1){
                    //vurdugu nesne superse
                    etkitas = kstas.etkiHesapla(0, 0, 2, 2);
                    canDusur(pskagit, etkitas);
                    if(pskagit.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "pc nesne kirildi yenisi varsa uretilir");
                        pcKagitVarMi=false;
                    }
                }else {
                    //vurdugu nesne normalse
                     etkitas = kstas.etkiHesapla(0, 0, 2, 1);
                     canDusur(pkagit, etkitas);
                     if(pkagit.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "pc nesne kirildi yenisi varsa uretilir");
                        pcKagitVarMi=false;
                    }
                }
            }else {
                if(pcNesneSeviye[1]==1){
                    //vurdugu nesne superse
                    etkitas = ktas.etkiHesapla(0, 0, 2, 2);
                    canDusur(pskagit, etkitas);
                    if(pskagit.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "pc nesne kirildi yenisi varsa uretilir");
                        pcKagitVarMi=false;
                    }
                }else {
                    //vurdugu nesne normalse
                     etkitas = ktas.etkiHesapla(0, 0, 2, 1);
                     canDusur(pkagit, etkitas);
                     if(pkagit.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "pc nesne kirildi yenisi varsa uretilir");
                        pcKagitVarMi=false;
                    }
                }
            }

            System.out.println("pc kazandi");
        }
        
        if(pc==1 && k==2 && kMakasVarMi== true && pcKagitVarMi==true){
            //pc vurusu
            if(pcNesneSeviye[1]==1){
                //pcnesne superse
                if(kullaniciNesneSeviye[2]==1){
                    //vurdugu nesne superse
                    etkikgt = pskagit.etkiHesapla(0, 0, 2, 2);
                    canDusur(ksmakas, etkikgt);
                    if(ksmakas.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "son nesne kirildi yenisi varsa uretilir");
                    kMakasVarMi=false;
                    }
                }else {
                    //vurdugu nesne normalse
                     etkikgt = pskagit.etkiHesapla(0, 0, 2, 1);
                     canDusur(kmakas, etkikgt);
                     if(kmakas.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "son nesne kirildi yenisi varsa uretilir");
                    kMakasVarMi=false;
                    }
                }
            }else {
                //pcnesnee normalse
                if(kullaniciNesneSeviye[2]==1){
                    //vurdugu nesne superse
                    etkikgt = pkagit.etkiHesapla(0, 0, 2, 2);
                    canDusur(ksmakas, etkikgt);
                    if(ksmakas.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "son nesne kirildi yenisi varsa uretilir");
                    kMakasVarMi=false;
                    }
                }else {
                     //vurdugu nesne normalse
                     etkikgt = pkagit.etkiHesapla(0, 0, 2, 1);
                     canDusur(kmakas, etkikgt);
                     if(kmakas.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "son nesne kirildi yenisi varsa uretilir");
                    kMakasVarMi=false;
                    }
                }
            }
            
            
            //kullanıcı vurusu
            if(kullaniciNesneSeviye[2]==1){
                if(pcNesneSeviye[1]==1){
                    //vurdugu nesne superse
                    etkimks = ksmakas.etkiHesapla(2, 2, 0, 0);
                    canDusur(pskagit, etkimks);
                    if(pskagit.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "son nesne kirildi yenisi varsa uretilir");
                        pcKagitVarMi=false;
                    }
                    ksmakas.seviyePuani+=20;
                }else {
                    //vurdugu nesne normalse
                     etkimks = ksmakas.etkiHesapla(2, 1, 0, 0);
                     canDusur(pkagit, etkimks);
                     if(pkagit.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "son nesne kirildi yenisi varsa uretilir");
                        pcKagitVarMi=false;
                    }
                     ksmakas.seviyePuani+=20;
                }
            }else {
                if(pcNesneSeviye[1]==1){
                    //vurdugu nesne superse
                    etkimks = kmakas.etkiHesapla(2, 2, 0, 0);
                    canDusur(pskagit, etkimks);
                    kmakas.seviyePuani+=20;
                    if(kmakas.seviyePuani>30){
                        kmakas.dayaniklilik=0;
                        kullaniciNesneSeviye[2]=1;
                        ksmakas.dayaniklilik=20;
                    }
                    if(pskagit.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "son nesne kirildi yenisi varsa uretilir");
                        pcKagitVarMi=false;
                    }
                }else {
                    //vurdugu nesne normalse
                     etkimks = kmakas.etkiHesapla(2, 1, 0, 0);
                     canDusur(pkagit, etkimks);
                     kmakas.seviyePuani+=20;
                      if(kmakas.seviyePuani>30){
                        kmakas.dayaniklilik=0;
                        kullaniciNesneSeviye[2]=1;
                        ksmakas.dayaniklilik=20;
                    }
                    if(pkagit.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "son nesne kirildi yenisi varsa uretilir");
                        pcKagitVarMi=false;
                    }
                }
            }

           System.out.println("kullanici kazandi");
        
        }

        if(pc==2 && k==0 && kTasVarMi==true && pcMakasVarMi==true){
             //pc vurusu
            if(pcNesneSeviye[2]==1){
                //pcnesne superse
                if(kullaniciNesneSeviye[0]==1){
                    //vurdugu nesne superse
                    etkimks= psmakas.etkiHesapla(0, 0, 2, 2);
                    canDusur(kstas, etkimks);
                    if(kstas.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "k nesne kirildi yenisi varsa uretilir");
                    kTasVarMi=false;
                    }
                }else {
                    //vurdugu nesne normalse
                     etkimks = psmakas.etkiHesapla(0, 0, 2, 1);
                     canDusur(ktas, etkimks);
                     if(ktas.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "k nesne kirildi yenisi varsa uretilir");
                    kTasVarMi=false;
                    }
                }
            }else {
                //pcnesnee normalse
                if(kullaniciNesneSeviye[0]==1){
                    //vurdugu nesne superse
                    etkimks = pmakas.etkiHesapla(0, 0, 2, 2);
                    canDusur(kstas, etkimks);
                    if(kstas.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "k nesne kirildi yenisi varsa uretilir");
                    kTasVarMi=false;
                    }
                }else {
                     //vurdugu nesne normalse
                     etkimks = pmakas.etkiHesapla(0, 0, 2, 1);
                     canDusur(ktas, etkimks);
                     if(ktas.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "k nesne kirildi yenisi varsa uretilir");
                    kTasVarMi=false;
                    }
                }
            }
            
            //kullanıcı vurusu
            if(kullaniciNesneSeviye[0]==1){
                if(pcNesneSeviye[2]==1){
                    //vurdugu nesne superse
                    etkitas = kstas.etkiHesapla(2, 2, 0, 0);
                    canDusur(psmakas, etkitas);
                    kstas.seviyePuani+=20;
                    if(psmakas.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "pc nesne kirildi yenisi varsa uretilir");
                        pcMakasVarMi=false;
                    }
                }else {
                    //vurdugu nesne normalse
                     etkitas = kstas.etkiHesapla(2, 1, 0, 0);
                     canDusur(pmakas, etkitas);
                     kstas.seviyePuani+=20;
                     if(pmakas.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "pc nesne kirildi yenisi varsa uretilir");
                        pcMakasVarMi=false;
                    }
                }
            }else {
                if(pcNesneSeviye[2]==1){
                    //vurdugu nesne superse
                    etkitas = ktas.etkiHesapla(2, 2, 0, 0);
                    canDusur(psmakas, etkitas);
                    ktas.seviyePuani+=20;
                    if(ktas.seviyePuani>30){
                        ktas.dayaniklilik=0;
                        kullaniciNesneSeviye[0]=1;
                        kstas.dayaniklilik=20;
                    }
                    if(psmakas.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "pc nesne kirildi yenisi varsa uretilir");
                        pcMakasVarMi=false;
                    }
                }else {
                    //vurdugu nesne normalse
                     etkitas = ktas.etkiHesapla(2, 1, 0, 0);
                     canDusur(pmakas, etkitas);
                     ktas.seviyePuani+=20;
                    if(ktas.seviyePuani>30){
                        ktas.dayaniklilik=0;
                        kullaniciNesneSeviye[0]=1;
                        kstas.dayaniklilik=20;
                    }
                    if(pmakas.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "pc nesne kirildi yenisi varsa uretilir");
                        pcMakasVarMi=false;
                    }
                }
            }

           System.out.println("kullanici kazandi");
        }
        if(pc==2 && k==1 && pcMakasVarMi==true && kKagitVarMi==true){
             //pc vurusu
            if(pcNesneSeviye[2]==1){
                if(kullaniciNesneSeviye[1]==1){
                    //vurdugu nesne superse
                    etkimks = psmakas.etkiHesapla(2, 2, 0, 0);
                    canDusur(kskagit, etkimks);
                    if(kskagit.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "k nesne kirildi yenisi varsa uretilir");
                    kKagitVarMi=false;
                    }
                }else {
                    //vurdugu nesne normalse
                     etkimks = psmakas.etkiHesapla(2, 1, 0, 0);
                     canDusur(kkagit, etkimks);
                     if(kkagit.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "k nesne kirildi yenisi varsa uretilir");
                    kKagitVarMi=false;
                    }
                }
            }else {
                if(kullaniciNesneSeviye[1]==1){
                    //vurdugu nesne superse
                    etkimks = pmakas.etkiHesapla(2, 2, 0, 0);
                    canDusur(kskagit, etkimks);
                    if(kskagit.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "k nesne kirildi yenisi varsa uretilir");
                    kKagitVarMi=false;
                    }
                    pmakas.seviyePuani+=20;
                     if(pmakas.seviyePuani>30){
                        pmakas.dayaniklilik=0;
                        pcNesneSeviye[2]=1;
                        psmakas.dayaniklilik=20;
                    }
                }else {
                    //vurdugu nesne normalse
                     etkimks = pmakas.etkiHesapla(2, 1, 0, 0);
                     canDusur(kkagit, etkimks);
                     if(kkagit.dayaniklilik<0){
                    JOptionPane.showMessageDialog(null, "k nesne kirildi yenisi varsa uretilir");
                    kKagitVarMi=false;
                    }
                     pmakas.seviyePuani+=20;
                     if(pmakas.seviyePuani>30){
                        pmakas.dayaniklilik=0;
                        pcNesneSeviye[2]=1;
                        psmakas.dayaniklilik=20;
                    }
                }
            }
            //kullanıcı vurusu
            if(kullaniciNesneSeviye[1]==1){
                if(pcNesneSeviye[2]==1){
                    //vurdugu nesne superse
                    etkikgt = kskagit.etkiHesapla(0, 0, 2, 2);
                    canDusur(psmakas, etkikgt);
                    if(psmakas.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "pc nesne kirildi yenisi varsa uretilir");
                        pcMakasVarMi=false;
                    }
                    
                }else {
                    //vurdugu nesne normalse
                     etkikgt = kskagit.etkiHesapla(0, 0, 2, 1);
                     canDusur(pmakas, etkikgt);
                     if(pmakas.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "pc nesne kirildi yenisi varsa uretilir");
                        pcMakasVarMi=false;
                    }
                }
            }else {
                if(pcNesneSeviye[2]==1){
                    //vurdugu nesne superse
                    etkikgt = kkagit.etkiHesapla(0, 0, 2, 2);
                    canDusur(psmakas, etkikgt);
                    if(psmakas.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "pc nesne kirildi yenisi varsa uretilir");
                        pcMakasVarMi=false;
                    }
                }else {
                    //vurdugu nesne normalse
                     etkikgt = kkagit.etkiHesapla(0, 0, 2, 1);
                     canDusur(pmakas, etkikgt);
                     if(pmakas.dayaniklilik<0){
                        JOptionPane.showMessageDialog(null, "pc nesne kirildi yenisi varsa uretilir");
                        pcMakasVarMi=false;
                    }
                }
            }

            System.out.println("pc kazandi");
        }


        }
    /********************************************************************************************/
    //secebilir mi
    /*int tasSecSay=0;
    int kgtSecSay=0;
    int mksSecSay=0;
    public boolean secebilirMi(int girdi){
        
        switch (girdi) {
            case 0 -> {
                return tasSecSay<(kullaniciNesneleri[0]+1-kullaniciNesnelerikont[0]);
            }

            case 1 -> {
                return kgtSecSay<(kullaniciNesneleri[1]+1-kullaniciNesnelerikont[1]);
            }

            case 2 -> {
                return mksSecSay < (kullaniciNesneleri[2]+1-kullaniciNesnelerikont[2]);
            }


            default -> {
            }
        }
        
        return false;
    
    }
    
    */
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Kullanici1");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setText("-");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setText("Bilgisayar");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/soru.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Baslamak için tusa bas...  ->");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tas.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kagit.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/makas.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setText("Dyn : ");

        jLabel7.setText("20");

        jLabel8.setText("20");

        jLabel9.setText("20");

        jToggleButton1.setText("BASLA");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(75, 75, 75)
                .addComponent(jLabel3)
                .addGap(125, 125, 125))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel5)
                        .addGap(40, 40, 40)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jToggleButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(kMakasVarMi==false){
            JOptionPane.showMessageDialog(null, "Makas Kalmadi"); 
            return ;
        }
        else{
             
            round++;oyun(2);
           /* if(secebilirMi(2)){
                
                mksSecSay++;
               
            }else JOptionPane.showMessageDialog(null, "Maks Secim Sayisina Ulastiniz");
            
*/
        }
                
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(kTasVarMi==false){
            JOptionPane.showMessageDialog(null, "Tas Kalmadi");
            return;
        } else{
             
            round++;oyun(0);
            /*if(secebilirMi(0)){
                
               tasSecSay++;
               
            }else JOptionPane.showMessageDialog(null, "Maks Secim Sayisina Ulastiniz");
            */

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(kKagitVarMi==false){
            JOptionPane.showMessageDialog(null, "Kagit Kalmadi");
            return;
        } else{
            
             round++;oyun(1);
            /*if(secebilirMi(1)){
                
                kgtSecSay++;
               
            }else JOptionPane.showMessageDialog(null, "Maks Secim Sayisina Ulastiniz");
            */

        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        pNesneUret();
        kNesneUret();
        System.out.println(pcNesneleriKont[0]+" "+pcNesneleriKont[1]+" "+pcNesneleriKont[2]+" ");
        System.out.println(kullaniciNesnelerikont[0]+" "+kullaniciNesnelerikont[1]+" "+kullaniciNesnelerikont[2]+" ");
         jLabel5.setText("Secimini Yap"); 
        jToggleButton1.setVisible(false);
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
            java.util.logging.Logger.getLogger(kullaniciVSpc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kullaniciVSpc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kullaniciVSpc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kullaniciVSpc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kullaniciVSpc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
