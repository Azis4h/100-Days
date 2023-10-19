package aritmatikainput2;

import java.util.Scanner;

public class Aritmatikainput2 {
    public static void main(String[] args) {
        int angka1;
        int angka2;
        int hasil;
        Scanner input = new Scanner(System.in);
         // pembagian
         
         System.out.print("input angka1 :");
         angka1 = input.nextInt();
         System.out.print("input angka2 :");
         angka2 = input.nextInt();
         
         hasil = angka1 / angka2;
         System.out.println("hasil "+hasil);
         
         //sisa bagi
         
        System.out.print("input angka1 :");
        angka1 = input.nextInt();
        System.out.print("input angka2 :");
        angka2 = input.nextInt();
        
        hasil = angka1 % angka2;
        System.out.println("hasil "+hasil);
         
    }
    
}
