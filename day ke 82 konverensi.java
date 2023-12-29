package kilometer;
import java.util.Scanner;
public class meter1 {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
        System.out.print("masukkan panjang meter : ");
        double panjangmeter = sc.nextDouble();
        
        double konverensi = panjangmeter / 1000;
        
        System.out.println(panjangmeter+" meter sama dengan "+konverensi);
        
        
        
}
}
