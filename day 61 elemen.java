package elemen;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukan jumlah array : ");
        int jumlahElemen = sc.nextInt();
        
        int [] nilaiArray = new int [jumlahElemen];
        
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("elemen ke- " + (i + 0) + " :");
            nilaiArray[i] = sc.nextInt();
        }
        System.out.println("Elemen beserta indeksnya :");
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.println("Indeks ke-" + i + " nilai : " + nilaiArray[i]);
        }
    }
    
}
