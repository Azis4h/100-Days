import java.util.Scanner;
public class gajil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("angka : ");
            int angka = sc.nextInt();
            if(angka % 2 == 0){
                System.out.println("genap");
                
            }else{
                System.out.print("end");
                break;
            }
        }
}
}
