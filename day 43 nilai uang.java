package day43;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan nilai uang:");
        int angka = input.nextInt();
        
        switch(angka){
            case 100:
            System.out.println("konverensi nilai uang adalah seratus ribu ");
            break;
            case 50000:
            System.out.println("konversi nilai uang adalah lima puluh ribu ");
            break;
            case 20000:
            System.out.println("konverensi nilai uang adalah dua puluh ribu ");
            break;
            case 10000:
            System.out.println("konverensi nilai uang adalah sepuluh ribu rupiah ");
            break;
            case 1000:
            System.out.println("konverensi nilai uang adalah seribu rupiah ");
            break;
            default:
            System.out.println("uang anda tidak ter konverensi ");
        }
    }
    
}
