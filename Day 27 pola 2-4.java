package pola.pkg2.pkg4;
public class Pola24 {
    public static void main(String[] args) {
  System.out.println("---------------------");
        System.out.println("Pola 2");
        System.out.println("---------------------");
        int pola2 = 5;
        System.out.println("8");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < pola2; j++) {
                System.out.println("*");
            }
            System.out.println("");
        }

        System.out.println("---------------------");
        System.out.println("Pola 3");
        System.out.println("---------------------");
        int pola3x = 4;
        int pola3y = 8;
        System.out.println("4");
        System.out.println("8");
        for (int i = 0; i < pola3x; i++) {
            for (int j = 0; j < pola3y; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("----------------------");
        System.out.println("Pola 4");
        System.out.println("----------------------");
        int pola4 = 7;
        for (int i = 0; i < pola4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
 
    }
    
}
