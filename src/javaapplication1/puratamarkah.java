/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Noor Aiman
 */
import java.util.Scanner;
public class puratamarkah {
    public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    
    int bm;
    int bi;
    int sejarah;
    int purata;
    
    System.out.print("Masukkan markah Bahasa Melayu :");
    bm=input.nextInt();
    
    System.out.print("Masukkan markah Bahasa Inggeris :");
    bi=input.nextInt();
    
    System.out.print("Masukkan markah Sejarah :");
    sejarah=input.nextInt();
    
    purata= (bm+bi+sejarah)/3;
    
    System.out.println("<==========================>");
    System.out.println("Purata markah anda adalah "+purata);
    
     if (purata > 89){
        System.out.println("Gred markah adalah A");
    }
     else if (purata > 79){
         System.out.println("Gred Mrkah adalah A-");
     }
     else if (purata > 69){
         System.out.println("Gred markah adalah B+");
     }
     else if (purata > 59){
         System.out.println("Gred markah adalah B");
     }
     else if (purata > 49){
         System.out.println("Gred markah adalah B-");
     }
     else if (purata > 39){
         System.out.println("Gred markah adalah C");
     }
     else if (purata > 29){
         System.out.println("Gred markah adalah D");
     }
     else if (purata > 19){
         System.out.println("Gred markah adalah E");
     }
     else {
        System.out.println("Gred markah adalah G");
    }
     System.out.println("<==========================>");
}
}
