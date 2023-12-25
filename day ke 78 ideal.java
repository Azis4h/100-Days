package ideal;
import java.util.Scanner;
public class berat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("bb : ");
        double bb = sc.nextDouble();
        System.out.print("tb : ");
        double tb = sc.nextDouble();
        
     double  ideal = bb / (tb*tb);
        System.out.println(ideal);
    }
    
}
