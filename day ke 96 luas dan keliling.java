package day96;
import java.util.Scanner;
public class keliling {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("menghitung luas dan keliling persegi panjang");
        System.out.print("masukkan panjang persegi : ");
        int p = sc.nextInt();
        System.out.print("masukkan lebar persegi : ");
        int l = sc.nextInt();
        
        int L = p * l;
        
        int k = 2 * (p + l);
        
        System.out.println("\njadi luas persegi adalah : "+L+"\ndan keliling persegi adalah : "+k);
}
}
