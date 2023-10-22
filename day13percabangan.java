package percabangan.java1;

import java.util.Scanner;

public class PercabanganJava1 {
    public static void main(String[] args) {
        int belanja = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("total belanja : Rp :");
        belanja = input.nextInt();
        
        if (belanja > 900){
            System.out.println("selamat, anda mendapatkan diskon yeeeee!");
        }
        System.out.println("terima kasih");
        System.out.println("total belanja :"+belanja);
    }
    
}
