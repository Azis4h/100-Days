package zyy;

public class Main {
    
    public static void main(String[] args) {
        int pola15 = 7;
        System.out.println("7");
        for(int a = 0; a < pola15; a++){
            for(int b = 0; b <= a ; b++){
                System.out.print(" ");
            }
            System.out.println("*");
        } 
        
        int pola16 = 7;
        System.out.println("7");
        for(int a = 0; a < pola16; a++){
            for(int b = 0; b < pola16 -a; b++){
                System.out.print(" ");
            } 
            System.out.println("*");
        }
    }
    
}
