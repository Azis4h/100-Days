package gaji;
import java.util.Scanner;
public class ga {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("masukkan angka : ");
        int angka = sc.nextInt();
        if(angka % 3 == 0 && angka % 5 == 0){
            System.out.print("master class");
        }else if(angka % 3 == 0){
            System.out.print("pride of 3");
        }else if(angka % 5 == 0){
            System.out.print("prid of 5");
        }else{
            System.out.print("tidak ada");
        }
}
}
