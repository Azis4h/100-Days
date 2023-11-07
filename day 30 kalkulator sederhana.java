package kalkulator;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Masukkan Angka :");
        int angka = input.nextInt();
        System.out.print("Masukkan Simbol :");
        char simbol = input.next().charAt(0);
        System.out.print("Masukkan Angka : ");
        int angka1 = input.nextInt();
        switch(simbol){
            case '+' :
               int hasil = angka + angka1;
                System.out.println("hasil dari penjumlahan "+angka+" + "+angka1+" = "+hasil);
                break;
            case '-':
                 hasil = angka - angka1;
                System.out.println("hasil dari penjumlahan "+angka+" - "+angka1+" = "+hasil);
                break;
                case '*':
                 hasil = angka * angka1;
                System.out.println("hasil dari penjumlahan "+angka+" * "+angka1+" = "+hasil);
                break;
                case '/':
                 hasil = angka / angka1;
                System.out.println("hasil dari penjumlahan "+angka+" / "+angka1+" = "+hasil);
                break;
                
        }
        
                
    }
    
}
