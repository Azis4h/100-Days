package data;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Banyak nilai : ");
        int banyak, nilai;
        
        banyak = sc.nextInt();
        int [] b = new int[banyak];
        for(int i = 0; i < banyak; i++){
            System.out.print("Nilai ke-"+(i+1)+" = ");
            b [i] = sc.nextInt();
        }
        for(int i = 0; i < banyak; i++){
            System.out.print(b [i]+" ");
        }
    }
    
}
