package imputjava;
import java.util.Scanner;
public class ImputJava {
    public static void main(String[] args) {
        Scanner adhy = new Scanner(System.in);
        System.out.print("nama saya : ");
        String nama = adhy.nextLine();
        
        System.out.print("alamat saya : ");
        String alamat = adhy.nextLine();
        
        System.out.println(" nama saya "+nama+" alamat saya "+alamat);
}
}
