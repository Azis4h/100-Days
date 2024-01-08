package lati;
import java.util.Scanner;
public class latihan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan baris : ");
        int baris = sc.nextInt();
        System.out.print("masukan kolom : ");
        int kolom = sc.nextInt();
        int nilai [][] = new int [baris][kolom];
        
        System.out.println();
        for(int i = 0; i < nilai.length; i++){
            for(int j = 0; j < nilai[i].length; j++){
                System.out.print("masukkan nilai : ");
                nilai[i][j] = sc.nextInt();
            }
        }
        System.out.println("hasil ");
        for(int i = 0; i < nilai.length; i++){
            for(int j = 0; j < nilai[i].length; j++){
                 System.out.print(nilai [i][j]+" ");
            }
            System.out.println();
        }
        
}
}
