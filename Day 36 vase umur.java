package umur;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner ica = new Scanner(System.in);
        System.out.print("masukkan umur anda: ");
        int umur =ica.nextInt();
         if(umur <= 5){
             System.out.print(umur+" = vase anak balita");
         }else if(umur <= 11 ){
            System.out.println(umur+" = vase anak-anak");
        }else if(umur  <= 25 ){
            System.out.println(umur+" = vase remaja");
        }else if(umur <= 45 ){
            System.out.println(umur+" = vase dewasa");
        }else if(umur <= 65 ){
            System.out.println(umur+" = vase lansia");
        }
    }
    
}
