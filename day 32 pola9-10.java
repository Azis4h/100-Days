package pola9.pkg10;
public class Pola910 {
    public static void main(String[] args) {
int pola9 = 5;
    for(int a = 0; a <= pola9; a++ ){
        for(int b = 0; b < a ; b++ ){
            System.out.print(" ");
        }
        for(int b =0; b < pola9 -a; b++){
            System.out.print("* ");
        }
        System.out.println("");
    }
    int pola10 = 5;
     for(int a = 0; a <= pola10; a++){
         for(int b = 0; b < a; b++){
             System.out.print("*");
         }  
         System.out.println("");
             }
     for (int a = 0; a < pola10; a++) {
             for (int b = pola10; b > a; b--) {
                 System.out.print("*");
             
         }
             System.out.println("");
     }
    }
    
}
