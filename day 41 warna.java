package day41;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan pilihan anda: ");
         String pilihan = input.nextLine();
        
        switch(pilihan){
            case "blue":
              System.out.println("adalah warna langit");
            break;
            case "purple":
              System.out.println("adalah warna fandom dari boy grup K- pop BTS");
            break;
            case "green":
              System.out.println("adalah warna rumput");
            break;
            case "white":
              System.out.println("adalah warna tissu");
            break;
            case "chocolate":
              System.out.println("adalah warna dari coklat");
            break;
            default:
              System.out.println("maaf hidup anda tidak berwarna");
        }
    }
    
}
