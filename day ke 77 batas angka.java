import java.util.Scanner;
public class iac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan batas : ");
        int batas = sc.nextInt();
        int jumlah = 0;
        for(int i = 1; i <= batas; i++){
            jumlah += i;
            if(i > 1){
                System.out.print("+");
            }
            
            
            System.out.print(i);
        }
        
    System.out.print(" = "+jumlah);
}
}
