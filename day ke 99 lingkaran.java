package day99;
import java.util.Scanner;
public class lingkaran1 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("mencarj luas dan keliling lingkaran");
        
        System.out.print("masukkan jari jari (r) : ");
        double r = sc.nextDouble();
        
        //nilai phi
        double phi = 3.14;
        
        // rumus diameter
        double d = 2 * r;
        
        //rumus luas
        double l = phi * r * r;
        
        //rumus keliling
        double k = phi * d;
        
        System.out.println("\njadi luas lingkaran adalah : "+l+"\ndan keliling lingkaran adalah : "+k);
}
}
