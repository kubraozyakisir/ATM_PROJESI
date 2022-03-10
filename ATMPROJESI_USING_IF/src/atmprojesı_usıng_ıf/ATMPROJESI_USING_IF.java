/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmprojesı_usıng_ıf;

import java.util.Scanner;

/**
 *
 * @author kubra
 */
public class ATMPROJESI_USING_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        double bakiye=15000;
        
        //1. İŞLEM = BAKİYE GÖRÜNTÜLE
        //2. İŞLEM=PARA ÇEKME
        //3.İŞLEM =PARA YATIRMA
        //4. ÇIKIŞ
        
       
 
       while(true){
           System.out.println("Bakiye görüntüle işlemi için 1' e basın \n"
                + "Para çekme işlemi için 2 ye basın\n"
                + "Para yatırma işlemi için 3 e basın\n"
                + "çıkış için 4 e basın");

     
        int cevap=scanner.nextInt();
            if(cevap==1){
                  System.out.println("Bakiyeniz : "+bakiye);      
            } 
            else if(cevap==2){
                System.out.println("çekmek istediğiniz limit nedir: ");
                double payable=scanner.nextDouble();
                bakiye=bakiye-payable;
                System.out.println("Çektiğiniz tutar: "+payable+" kalan bakiyeniz: "+bakiye);
                
             
             }
             else if(cevap==3){
                System.out.println("yatırmak isteidğiniz tutar nedir? ");
                 double balance=scanner.nextDouble();
                 bakiye=bakiye+balance;
                System.out.println("Yatırdığınız tutar: "+balance+" kalan bakiyeniz: "+bakiye);
           
             }
             else if(cevap==4){
                System.out.println("çıkış yapılıyor...");
             break;
             }
       
       }
       
      }
 }
    

