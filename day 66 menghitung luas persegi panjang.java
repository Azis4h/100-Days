package menghitung;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int panjang,lebar,hasil;
        
        System.out.print("masukman Panjang : ");
        panjang = sc.nextInt();
        
        System.out.print("masukkan Lebar : ");
        lebar = sc.nextInt();
        
        hasil = panjang * lebar;
        System.out.println("maka "+panjang+" x "+lebar+" = "+hasil);
        System.out.println("jadi luas nya adalah "+ hasil);
        
    }
    
}
