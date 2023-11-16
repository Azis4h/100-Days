package day39;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.print("masukkan angka pertama: ");
        int angka1 = input.nextInt();
        System.out.print("masukkan angka kedua: ");
        int angka2 = input.nextInt();
        
        int hasil = angka1 * angka2;
        int hasil1 = angka1/angka2;
        int hasil2 = hasil + hasil1;
        
        
        System.out.println("hasil perkalian: "+hasil);
        System.out.println("hasil pembagian: "+hasil1);
        System.out.println("hasil akhir : "+hasil2);
        
        
    }
    
}
