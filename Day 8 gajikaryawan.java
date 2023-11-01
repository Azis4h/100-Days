
package day8gajikaryawan;

import java.util.Scanner;

public class Day8gajikaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukkan gaji pokok bulanan : ");
        double gajipokok = input.nextDouble();
        
        System.out.print("masukkan waktu lembur : ");
        double waktulembur = input.nextDouble();
        
        double gajilembur = waktulembur * 55000;
        
        double gajibersih = gajipokok + gajilembur;
        
        System.out.println("gaji bersih karyawa "+ gajibersih );
        
        input.close();
    }
    
}
