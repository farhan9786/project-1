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
public class kiraluasdinding {
    public static void main (String[]args){
        Scanner input= new Scanner(System.in) ;
        
        int panjang_dinding;
        int lebar_dinding;
        int panjang_tingkap;
        int lebar_tingkap;
        int panjang_pintu;
        int lebar_pintu;
        int luas_dinding;
        int luas_tingkap;
        int luas_pintu;
        int luas_keseluruhan;
        
        
        System.out.print("Masukkan panjang pintu: ");
        panjang_pintu=input.nextInt();
        System.out.print("Masukkan lebar pintu: ");
        lebar_pintu=input.nextInt();
        
        System.out.print("Masukkan panjang tingkap: ");
        panjang_tingkap=input.nextInt();
        System.out.print("Masukkan lebar tingkap: ");
        lebar_tingkap=input.nextInt();
        
        System.out.print("Masukkan panjang dinding: ");
        panjang_dinding=input.nextInt();
        System.out.print("Masukkan lebar dinding: ");
        lebar_dinding=input.nextInt();
        
        luas_dinding=(panjang_dinding * lebar_dinding * 4);
        luas_tingkap=(panjang_tingkap * lebar_tingkap * 2);
        luas_pintu=(panjang_pintu * lebar_pintu);
        luas_keseluruhan=(luas_dinding)+(luas_tingkap)+(luas_pintu);
    
        System.out.println("===========================");
        System.out.println("===========================");
        System.out.println("Luas Pintu:"+luas_pintu+" meter persegi");
        System.out.println("Luas Tingkap:"+luas_tingkap+" meter persegi");
        System.out.println("Luas Dinding:"+luas_dinding+" meter persegi");
        System.out.println("Luas Keseluruhan:"+luas_keseluruhan+" meter persegi");
        System.out.println("===========================");
        System.out.println("===========================");
        
        
        System.out.println("Tahniah!!!!ANDA BERJAYA!!!!");

}
       
}
