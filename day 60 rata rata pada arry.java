package nilai5;

public class Main {
    
    public static void main(String[] args) {
        int arry [] = {10,3,6,8,52,6};
        int total =0;
        double rata;
        int jumlah = arry.length;
        System.out.print("deret angka  = ");
        
        for(int i = 0; i < jumlah; i++){
            System.out.print(arry [i]+" ");
            total += arry [i];
        }
        System.out.println("");
        System.out.println("total \t     = "+total);
        rata = total / jumlah;
        System.out.println("rata \t     = "+rata);
    }
    
}
