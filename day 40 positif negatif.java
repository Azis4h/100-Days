package day40;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		       System.out.print("masukkan angka:");
	       	int angka = input.nextInt();
        
		
	   	      if(angka <= -2){
		          	System.out.println("angka negatif");
		         }
         else if(angka >= 5){
			         	System.out.println("angka positif");
    		  	}
        else{
			          	System.out.println("angka 0");
			
	}			
    }
    
}
