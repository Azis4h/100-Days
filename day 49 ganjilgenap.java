package genap;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan jumlah angka : ");
        int angka = sc.nextInt();
        
        if(angka <= 3){
            System.out.print("masukkan angka lebih dari 3.");
        }else {
            System.out.println("angka ganjil ");
            for(int i = 0 + 1; i < angka + 1; i += 2){
                System.out.print(i +" ");
            }
            System.out.println();
            System.out.println("angka genap ");
            for(int a = 0; a < angka + 2; a += 2){
                System.out.print(a + " ");
            }
            System.out.println(" ");
        }
         
    }
    
}
