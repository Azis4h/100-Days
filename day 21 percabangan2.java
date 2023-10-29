
package percabangann.java;

import java.util.Scanner;

public class PercabangannJava {
    public static void main(String[] args) {
        System.out.println("--------------selamat datang-------------------");
        Scanner input = new Scanner(System.in);
        System.out.println("Daftar Menu:");
        System.out.println("1.mie goreng");
        System.out.println("2.bakso");
        
        
        System.out.print("silahkan pilih menu:");
        int pilihan  =input.nextInt();
        
        
        if(pilihan == 1){
            System.out.println("mie goreng"); 
            System.out.println("harga: 15/porsi");
            System.out.print("pilih porsi sesua isi dompet:");
            int porsi  =input.nextInt();
            System.out.println("---------------------------------------------");
            System.out.println("Pesanan Anda\t: ");
            System.out.println("Jenis Pesanan\t: Mie Goreng");
            int harga = 15000;
            System.out.println("Harga\t\t: "+harga);
            System.out.println("Jumlah Porsi\t: "+porsi);
            int rifky = harga * porsi;
            System.out.println("Harga Akhir\t: "+rifky);
            System.out.println("-------selamat menikmati makanan mahal -------");
            
        } else if(pilihan == 2){
            System.out.println("bakso");
            System.out.println("harga: 13/porsi");
            System.out.print("pilih makanan sesuai kapasitas perut:");
            int makanan = input.nextInt();
            System.out.println("----------------------------------------------");
            System.out.println("pesanan anda\t: ");
            System.out.println("jenis pesanan\t: bakso");
            int harga1 = 13000;
            System.out.println("harga/t/t: "+harga1);
            System.out.println("jumlah makanan\t: "+makanan);
            int ica = makanan * harga1;
            System.out.println("harga akhir\t: "+ica);
            System.out.println("--------selamat menikmati makanan mahal ");
            
        }
        
    }
    
}
