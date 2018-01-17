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
public class aksesjawatan {
    public static void main (String[]args){
    Scanner input=new Scanner (System.in);
    
    char kod;
    char a;
    char b;
    char c;
    char d;
    char e;
    
    System.out.println("Ini adalah sistem bagi memeriksa akses bagi sistem pendaftaran pelajar mengikut jawatan");
    System.out.println("Sila masukkan jawatan anda mengikut pilihan yang yang ditetapkan.");
    System.out.println("======================================================");
    System.out.println("|a.Kerani                                b.Juruteknik|");
    System.out.println("|                  c.Pentadbir                       |");
    System.out.println("|d.Pengurus                              e.Lain-lain |");
    System.out.println("======================================================");
    
    
    System.out.print("Jawatan :");
    kod=input.next().charAt(0);
    
    
        if (kod=='a'){
        System.out.println("Kerani :Capaian data sahaja.");
    }
        else if (kod=='b'){
        System.out.println("Juruteknik :Capaian sistem sahaja.");
    }
        else if (kod=='c'){
        System.out.println("Pentadbir :Capaian sistem&data sahaja.");
    }
        else if (kod=='d'){
        System.out.println("Pengurus :Capaian keseluruhan.");
    }  
        else if (kod=='e'){
        System.out.println("Lain-lain :Capaian tidak diterima.");
    }
        else {
        System.out.println("Input anda salah.");
        System.out.print("Masukkan jawatan yang betul :");
        kod=input.next().charAt(0);
    }
        System.out.println(+kod);
}  
}

