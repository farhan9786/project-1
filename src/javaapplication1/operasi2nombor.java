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
public class operasi2nombor {
    public static void main(String[]args) {
    Scanner input=new Scanner(System.in);
    double tambah;
    double tolak;
    double darab;
    double bahagi;
    
   System.out.print("Masukkan no pertama :");
   double no1=input.nextDouble();
   
   System.out.print("Masukkan no kedua :");
   double no2=input.nextDouble();
   
   tambah = no1+no2;
   tolak = no1-no2;
   darab = no1*no2;
   bahagi = no1/no2;
   
   System.out.println("------------------------------------------------------");
   System.out.println("Jumlah tambah " +no1+ " dan " +no2+ " ialah : " +tambah);
   System.out.println("Jumlah tolak " +no1+ " dan " +no2+ " ialah : " +tolak);
   System.out.println("Jumlah darab " +no1+ " dan " +no2+ " ialah : " +tolak);
   System.out.println("Jumlah bahagi " +no1+ " dan " +no2+ " ialah : " +bahagi);
   System.out.println("------------------------------------------------------");   
}
}
