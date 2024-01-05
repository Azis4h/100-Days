package day89;
import java.util.Scanner;
public class arry2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan panjang sisi kubus : ");
        int sisi = sc.nextInt();
        
        int volume = sisi * sisi * sisi;
        
        System.out.println("volume kubus adalah : "+volume);
}
}
