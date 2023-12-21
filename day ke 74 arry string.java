package mencari;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] buah ={"tahu","tempe","telur"};
        for(int i = 0; i < buah.length; i++){
            System.out.println(buah[i]);
        }
        System.out.print("pilih buah kesukaan : ");
        String cari = sc.next();
        for(int i = 0; i < buah.length; i++){
            if(cari.equals(buah[i])){
                int hasil = i+1;
                System.out.println("pilihan ke-"+hasil);
                break;
            }else{
                System.out.println("pilihan tidak ada");
                break;
            }
        }
    }
    
}
