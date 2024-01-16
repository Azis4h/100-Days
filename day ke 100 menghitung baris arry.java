package day100;
import java.util.Scanner;
public class penjumlahan {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.print("masukkan baris : ");
        int baris = sc.nextInt();
        System.out.print("masukan kolom : ");
        int kolom = sc.nextInt();
        int nilai [][] = new int [baris][kolom];
        
        System.out.println();
        for(int i = 0; i < nilai.length; i++){
            System.out.println("baris ke : "+(i+1));
            for(int j = 0; j < nilai[i].length; j++){
                System.out.print("isi "+(j+1)+" : ");
                nilai[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        int hasil = 0;
        for(int i = 0; i < baris; i++){
            int a = 0;
            for(int j = 0; j < kolom; j++){
                a += nilai[i][j];
                hasil += nilai[i][j];
                if(j > 0){
                    System.out.print(" + ");
                }
                System.out.print(nilai[i][j]);
            }
            System.out.println(" : "+a);
        }
        System.out.println("hasil : "+hasil);
}
}
