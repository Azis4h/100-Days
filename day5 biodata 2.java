package javabyte;
import java.util.Scanner;
public class Javabyte {
    public static void main(String[] args) {
        Scanner adhy = new Scanner(System.in);
        System.out.print("silahkan ketik umur anda : ");
        byte angka = adhy.nextByte();
        System.out.print("silahkan ketik berat badan anda : ");
        float beratbadan = adhy.nextFloat();
        System.out.print("silahkan ketik tinggi anda : ");
        float tinggi = adhy.nextFloat();
        System.out.println(" umur "+angka+" berat badan  "+beratbadan+" tinggi  "+tinggi);
    }
    
}
