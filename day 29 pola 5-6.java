package hmmmmm;
public class Hmmmmm {
    public static void main(String[] args) {
         int pola5 = 7;
         for(int a = pola5; a >= 0; a-- ){
             for(int b = 0; b < a; b++){
                 System.out.print("*");
             }
             System.out.println("*");
    }
        int pola6 = 5;
        for(int a = 0; a < pola6; a++){
            for( int b = 0; b < pola6 -a; b++){
                System.out.print(" ");
            }
            for(int b = 0; b <= a; b++){
                System.out.print("*");
        }
            System.out.println(" ");
    }   
}
}
