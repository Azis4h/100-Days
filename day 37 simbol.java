package thn;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka anda: ");
        int simbol = input.nextInt();
        switch(simbol){
           case 1:
            System.out.println("simbol yang Anda pilih : *");
            break;
            case 2:
            System.out.println("simbol yang Anda pilih : #");
            break;
            case 3:
            System.out.println("simbol yang Anda pilih : _");
            break;
            case 4:
            System.out.println("simbol yang anda pilih : -");
            break;
            case 5:
            System.out.println("simnbol yang Anda pilih : +");
            break;
            case 6:
            System.out.println("simbol yang anda pilih : @");
            break;
            case 7:
            System.out.println("simbol yang anda pilih : $");
            break;
            case 8:
            System.out.println("simbol yang anda pilih : &");
            break;
            case 9:
            System.out.println("simbol yang anda pilih : ?");
            break;
            case 10:
            System.out.println("simbol yang anda pilih : !");
            break;
            
            default:
            System.out.println("tidak ada simbol");
        }
        
    }
    
}
