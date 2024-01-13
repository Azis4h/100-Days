package day97;
import java.util.Scanner;
public class ganjil {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("masukkan baris : ");
        int baris = sc.nextInt();
        
        System.out.print("masukkan kolom : ");
        int kolom = sc.nextInt();
        
        int nilai [][] = new int [baris] [kolom];
        
        System.out.println();
        
        for(int i = 0; i < nilai.length; i++){
            for(int j = 0; j < nilai.length; j++){
                System.out.print("masukkan nilai : ");
                 nilai [i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < nilai.length; i++){
            for(int j = 0; j < nilai.length; j++){
                System.out.print(nilai [i][j]+" ");
                
            }
            System.out.println();
        }
        int hasil = 0;
        for(int i = 0; i < nilai.length; i++){
            for(int j = 0; j < nilai.length; j++){
                if(nilai [i][j] % 2 == 1){
                    hasil++;
                }
            }
        }
        System.out.println("\njumlah angka ganjil adalah : "+hasil);
}
}
