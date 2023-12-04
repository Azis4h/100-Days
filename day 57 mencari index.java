package faktorial;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arry [] = {1,4,6,8,5,3,9,7};
        System.out.print("masukka  nilai = ");
        int nilai = sc.nextInt();
        for(int a = 1; a < arry.length; a++){
            if(nilai == arry [a]){
                System.out.println(a);
            }
        }
         }
    
}
