package hmm;

public class Main {
    
    public static void main(String[] args) {
        int pola13 = 5;
        for(int a = pola13; a > 0; a--){
            for(int b = 0; b <= pola13 - a; b++){
                System.out.print(" ");
            }
            for(int b = 0; b < a; b++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int a = 0; a < pola13; a++){
            for(int b = 0; b < pola13 - a; b++){
                System.out.print(" ");
            }
            for(int b = 0; b <= a; b++){
                System.out.print("*");
            }
            System.out.println("");
        }
        int pola14 = 5;
        for(int a = 0; a < pola14; a++){
            for(int b = 0; b < pola14 -a; b++){
                System.out.print(" ");
            }
            for(int b = 0; b < a; b++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        for(int a = pola14; a >= 0; a--){
            for(int b = 0; b < pola14 -a; b++){
                System.out.print(" ");
            }
            for(int b = 0; b < a; b++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
}
