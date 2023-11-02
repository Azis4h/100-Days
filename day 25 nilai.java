package gradenilai;
import java.util.Scanner;
public class GradeNilai {
    public static void main(String[] args) {
     String nama , hasil ,grade;
     int Grade;
     Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
        System.out.println(i+"======>Nilai Mahasiswa<======");
        
        System.out.print("nama: " );
        nama = input.nextLine();
        System.out.print("Masukkan Nilai: ");
        Grade = input.nextInt();
        System.out.print("hasil: ");
        hasil = input.nextLine();
        if(Grade>=90){
            grade = "A";
        }else if(Grade>=80){
            grade = "B+";
        }else if(Grade>=70){
            grade = "B";
        }else if(Grade>=60){
            grade = "C";
        }else if(Grade>=50){
            grade = "D";
        }else grade = "E";    
    System.out.println(grade);
            }
    }
    }           
