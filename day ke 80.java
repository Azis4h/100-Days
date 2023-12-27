package tambh2;
import java.util.Scanner;
public class tambah {
     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
         System.out.print("awal : ");
         int awal = sc.nextInt();
         System.out.print("akhir : ");
         int akhir = sc.nextInt();
         int hasil = awal += akhir;
         
         if(hasil % 2 == 0){
             System.out.print(hasil += 1);
         }else {
             System.out.print(hasil += 2);
         }
}
}
