package data;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan kalimat : ");
        String kalimat = sc.nextLine();
        
        String hasil [] = kalimat.split(" ");
        for(int a = 0; a < hasil.length;a++){
            System.out.println((a+1)+"-"+hasil[a]);
        }
        
    }
    
}
