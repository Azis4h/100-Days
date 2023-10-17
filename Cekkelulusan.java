package cekkelulusan;

import java.util.Scanner;

public class Cekkelulusan {
    public static void main(String[] args) {
        Scanner hayo = new Scanner(System.in);
        // input
        System.out.print("nama : ");
         String nama = hayo.nextLine();
         System.out.print("nilai : ");
         int nilai = hayo.nextInt();
         
         // cek apakah dia lulus atau tdk
         
        if(nilai >= 70 ){
            System.out.println(" selamat " + nama + " anda dinyatakan lulus");
        }else{
            System.out.println(" maaf " + nama + " anda dinyatakan tidak lulus");
        }
    }
    
}
