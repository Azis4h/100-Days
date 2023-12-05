package nilai2;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("bilangan genap");
        int awal,akhir,spesis;
        System.out.print("awal = ");
        awal = sc.nextInt();
        System.out.print("akhir = ");
        akhir = sc.nextInt();
        
        int a = awal;
        spesis = 1;
        while(a <= akhir){
            int hasil = a % 2;
            if(hasil == 0){
                System.out.print(a+" ");
                if(spesis == 8){
                    System.out.println("");
                    spesis = 0;
                }
                spesis++;
            }
             a++;
        }
        
    }
}
