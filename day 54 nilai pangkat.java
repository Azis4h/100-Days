package pangkat;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan,pangkat,hasil;
        System.out.print("masukkan bilangan : ");
        bilangan = sc.nextInt();
        System.out.print("masukkan pangkat  : ");
        pangkat = sc.nextInt();
        System.out.println("----------------------");
        System.out.print("hasil \t\t  : ");
        hasil = bilangan;
        for(int a = 1; a < pangkat; a++){
            hasil *= bilangan;
            
        }
        
        System.out.println(hasil);
    }
    
}
