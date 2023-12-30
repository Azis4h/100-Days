package tahun;
import java.util.Scanner;
public class menghitung {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("masukan tahun lahir : ");
        int tahunlahir = sc.nextInt();
        
        System.out.print("masukkan tahun sekarang : ");
        int tahunsekarang = sc.nextInt();
        
        int umur = tahunlahir - tahunsekarang;
        
        System.out.println("umur anda "+ umur +" tahun");
}
}
