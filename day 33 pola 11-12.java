package zz;

public class Main {
    
    public static void main(String[] args) {
        int pola11 = 5;
        for(int a = 0; a < pola11; a++){
            for(int b = 0; b < pola11 -a; b++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int a = 0; a < pola11; a++){
            for(int b = 0; b <= a; b++){
                System.out.print("*");
            }
            System.out.println();
        }
        int pola12 = 5;
        for(int a = 0; a < pola12; a++){
            for(int b = 0; b < pola12 -a; b++){
                System.out.print(" ");
            }
            for(int b = 0; b <= a -1; b++){
                System.out.print("*");
            }
            System.out.println("");
           
        } 
        for(int a = pola12; a >= 0; a--){
            for(int b = 0; b < pola12 -a; b++){
                System.out.print(" ");
            }
            for(int b = 0; b <= a -1; b++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
    
}
