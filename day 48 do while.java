package perulangan;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        String nama,alamat,masuk;
        do{
            Scanner input = new Scanner(System.in);
            System.out.print("nama \t : ");
            nama = input.nextLine();
            System.out.print("alamat \t : ");
            alamat = input.nextLine();
            System.out.println("-----------------");
            System.out.println(nama+" tinggal di "+ alamat);
            System.out.print("ulangi (y/n) : ");
            masuk = input.next();
            
        }while (masuk.equals("y"));
        System.out.println("program selesai");
    }
    
}
