

package aritmatikainput;

import java.util.Scanner;

public class Aritmatikainput {
    public static void main(String[] args) {
        int angka1;
        int angka2;
        int hasil;
               
        Scanner selasa = new Scanner(System.in);
        
        System.out.print("input angka-1 : ");
        angka1 = selasa.nextInt();
        System.out.print("input angka-2 : ");
        angka2 = selasa.nextInt();
        
        //penjumlahan
        hasil = angka1 + angka2;
        System.out.println("hasil " +hasil);
        
        System.out.print("input angka-1 : ");
        angka1 = selasa.nextInt();
        System.out.print("input angka-2 : ");
        angka2 = selasa.nextInt();
        
        //pengurangan
        hasil = angka1 - angka2;
        System.out.println("hasil " +hasil);
        
        System.out.print("input angka-1 : ");
        angka1 = selasa.nextInt();
        System.out.print("input angka-2 : ");
        angka2 = selasa.nextInt();
        
        //perkalian
        hasil = angka1 * angka2;
        System.out.println("hasil "+hasil);
        
            }
    
}
