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

public class MarkahKeseluruhan {
    public static void main(String[]args){
       
        int a=87;
        int b=90;
        int c=68;
        int d=50;
        int jumlah;
        int purata;
        double peratus;
        
    System.out.println("Markah bagi setiap matapelajaran; ");
    
    System.out.println("Fundamental of Programming :"+a+"              Computer Organization and Architecture :"+b);
  
    System.out.println("Web Programming :"+c+"                         System Interface :"+d);
    
    jumlah=a+b+c+d;
    purata=jumlah/4;
    peratus=jumlah*100/400;
    
    
    System.out.println("======================");
    System.out.println("Jumlah markah anda adalah :"+jumlah);
    System.out.println("Purata markah anda adalah :"+purata);
    System.out.println("Peratus markah anda adalah :"+peratus+"%");
    System.out.println("======================");
    }
}
