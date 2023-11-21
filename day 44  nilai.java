package nilai;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan nilai anda:");
        int nilai = input.nextInt();
        
        if(nilai > 90 && nilai <= 100){
            System.out.println("anda mendapatkan predikat A");
        }else if(nilai > 80 && nilai <= 89){
            System.out.println("anda mendapatkan predikat B");
        }else if(nilai > 70 && nilai <= 79){
            System.out.println("anda mendapatkan predikat C");
        }else if(nilai > 60 && nilai <= 69){
            System.out.println("anda mendapatkan predikat D");
        }else if(nilai >= 0 && nilai <= 59){
            System.out.println("anda mendapatkan predikat E");
        }
        
    }
    
}
