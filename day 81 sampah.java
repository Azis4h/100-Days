package sampah;
import java.util.Scanner;
public class daur {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("macam macam sampah : ");
        System.out.println("[1] sampah organik");
        System.out.println("[2] sampah anorganik");
        System.out.println("[3] sampah b3");
        System.out.println("[4] sampah kertas");
        System.out.print("< pilih sampah > : ");
        int sampah = sc.nextInt();
        
        if(sampah == 1){
            System.out.println("pupuk kompos");
        }else if(sampah == 2){
            System.out.println("kerajinan daur ulang");
        }else if(sampah == 3){
            System.out.println("di kelompok secara khusus dalam wadah");
        }else if(sampah == 4){
            System.out.println("daur ulang");
        }else{
            System.out.println("sampah tidak tercatat");
        }
        
    }
    
}
