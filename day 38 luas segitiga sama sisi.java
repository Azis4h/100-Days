package day38;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner ica = new Scanner(System.in);
        System.out.println("MENENTUKAN LUAS SEGITIGA SAMA SISI");
        
        System.out.print("tentukan nilai alas: ");
        int A = ica.nextInt();
        System.out.print("tentukan nilai tinggi: ");
        int T = ica.nextInt();
        double luas = 0.5*A*T;
        System.out.println("luas = "+luas);
        System.out.println("•••Gambar•••");
        for(int a = 1; a <= A; a++){
            for(int b = 1; b <= T; b++){
                System.out.print("∆ ");
            }
            System.out.println("∆");
        }
        
        
    }
    
}
