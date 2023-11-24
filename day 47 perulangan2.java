package perulangan2;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int awal,akhir;
        System.out.print("angka awal : ");
        awal = input.nextInt();
        System.out.print("angka akhir : ");
        akhir = input.nextInt();
        
        int a = awal;
        do{
            System.out.print(a+" ");
            a++;
        }while(a <= akhir);
        System.out.println("");
    }
    
}
