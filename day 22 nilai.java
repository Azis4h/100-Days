package nilai.java;
import java.util.Scanner;
public class NilaiJava {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("bilangan bulat N: ");
        n= input.nextInt();
        
        if (n<=9){
            System.out.println("satuan");
        }else if (n<=99){
            System.out.println("puluhan");
        }else if(n<=999){
            System.out.println("ratusan");
        }else if(n<=9999){
            System.out.println("ribuan");
        }else if(n<=99999){
            System.out.println("puluhan ribuan");
    }
        
    }
    
}
