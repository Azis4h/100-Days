package ternary;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nilai = ");
        double nilai = sc.nextDouble();
        double ipk = 2.5;
        String hasil = nilai >= ipk?"tuntas":"tidak tuntas";
        System.out.println("nilai anda = "+nilai);
        System.out.println("anda dinyatakan = "+hasil);
    }
    
}
