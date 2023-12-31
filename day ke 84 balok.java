package arry;
import java.util.Scanner;
public class arry {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan panjang balok : ");
        double panjang = sc.nextDouble();
        
        System.out.print("masukkan lebar balok : ");
        double lebar = sc.nextDouble();
        
        System.out.print("masukkan tinggi balok : ");
        double tinggi = sc.nextDouble();
        
        double volume = panjang * lebar * tinggi;
        
        System.out.println("jadi volume balok adalah : "+volume);
}
    
}
