package day24minmax;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan a: ");
        
        double a = input.nextDouble();
        
        System.out.print("Masukkan bilangan b: ");
        
        double b = input.nextDouble();
        
        double min = Math.min(a,b);
        double max = Math.max(a,b);
        
        
        System.out.println("Nilai Min: " + min);
        System.out.println("Nilai Max: " + max);
        
        input.close();
    }
    
}
