package imput;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan jumlah imputan = ");
        int nilai = sc.nextInt();
        int b[] = new int [nilai];
        for(int a = 0; a < b.length; a++){
            System.out.print("masukkan nilai ke-"+a+" : ");
           b [a] = sc.nextInt();
        }
        for(int a = 0; a < b.length; a++){
            if(b [a] % 2 == 0){
                System.out.println("genap");
            }else{
                System.out.println("ganjil");
            }
            
        }
        
        
        
    }
    
}
