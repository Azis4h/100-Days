package harimu.java;

import java.util.Scanner;

public class HarimuJava {
    public static void main(String[] args) {
    String hari;
        Scanner input = new Scanner(System.in);
        
        System.out.println("inputlah angka (1-7)");
        hari = input.nextLine();
        
        switch  (hari){
            case"1":
                System.out.println("senin");
                break;
            case"2":
                 System.out.println("selasa");
                 break;
            case"3":
                System.out.println("rabu");
                break;
            case"4":
                System.out.println("kamis");
                break;
            case"5":
                System.out.println("jum'at");
                break;
            case"6":
                System.out.println("sabtu");
                break;
            case"7":
                System.out.println("ahad");
                break;
            case"8":
                System.out.println("apakah anda mempunyai hari lain?");
        } 
    }
    
}
