package perbandingan;
import java.util.Scanner;
public class Perbandingan {
    public static void main(String[] args) {
        Scanner woo = new Scanner(System.in);
        System.out.print("Masukkan angka :");
        int number= woo.nextInt();
        
        if (number % 10 == 0 && number % 5 == 0) {
            System.out.println("yaa class");
        } else if (number % 10 == 0) {
            System.out.println(" 10");
        } else if (number % 5 == 0) {
            System.out.print (" 5");
        } else {
            System.out.println(" tidak masuk dalam ketentuan angkamu");
        }     

    }
    
}
