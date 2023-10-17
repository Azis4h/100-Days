package day.pkg6;
import java.util.Scanner ;
public class Day6 {
public static void main(String[] args) {

    Scanner ica = new Scanner (System.in);
    System.out.print("Masukkan nilai A = ");
    int nilaiA = ica.nextInt();
    
    if (nilaiA >= 6){
        System.out.println(nilaiA +" >="+ 6);
    }
    else if (nilaiA <= 6){
        System.out.println(nilaiA + " <= "+ 6);
    }
    
}
    
}
