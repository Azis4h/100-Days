package nilai3;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka_rahasia = 10;
        int nilai;
        do{
            System.out.print("masukkan angka : ");
            nilai = sc.nextInt();
            if(nilai < angka_rahasia){
                System.out.println("nilai terlalu kecil");
            }else if(nilai > angka_rahasia){
                System.out.println("nilai terlalu besar");
            }else if(nilai == angka_rahasia);
        }while(nilai != angka_rahasia);{
            System.out.println("program berhenti");
        }
              
    }
    
}
