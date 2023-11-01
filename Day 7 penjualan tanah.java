package latihan;
import java.util.Scanner ;
public class LatihanInput {
    public static void main(String[] args) {

    double hargapermeter = 3000000; 
    Scanner tanah = new Scanner(System.in);
        System.out.print("masukkan luas tanah :");
        double luastanah = tanah.nextDouble();
        
       double hargatanah = hargapermeter * luastanah;
       
       double pajak = 0;
       if (hargatanah > 100000000){
           pajak = 0.05;
       }
       else if (hargatanah > 50000000){
         pajak = 0.03;
    }
       else if (hargatanah < 50000000){
         pajak = 0.01 ;
               } 
        double jumlahpajak = hargatanah * pajak;
        double jumlahbersih = hargatanah - jumlahpajak;
        
        
        System.out.println("harga tanah jual Rp "+hargatanah);
        System.out.println("jumlah pajak Rp "+jumlahpajak);
        System.out.println("hasil bersih penjualan Rp "+jumlahbersih);
        
    }
}
