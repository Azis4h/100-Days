package mencari;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] angka = new int[10];
        for(int i = 0; i < angka.length; i++){
            System.out.print("index ke-"+i+" : ");
            angka[i] = sc.nextInt();
        }
        for(int i = 0; i < angka.length; i++){
            if(5 == i){
                System.out.println("index ke-"+i+"adalah "+angka[i]);
            }if(9 == i){
                System.out.println("index ke-"+i+"adalah "+angka[i]);
            }
        }
    }
    
}
