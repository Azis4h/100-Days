package mencari;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("masukan angka : ");
        int angka = sc.nextInt();
        
        int a = angka % 2;
        
        System.out.println("sisa bagi = " + a);
        String hasil = a == 0? "hasil = genap":"hasil = ganjil";
        System.out.println(hasil);
    }
    
}
