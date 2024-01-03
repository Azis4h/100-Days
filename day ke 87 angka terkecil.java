package day87;

public class coding {
    public static void main(String[] args){
        int angka [] = {11,5,31,2,6,8};
        int hasil  = angka [0];
        System.out.println("mencari angka terkecil");
        for(int i = 0; i < angka.length; i++){
            System.out.println(angka [i]+ " ");
        }
        
        for(int i = 0; i < angka.length; i++){
            if(angka [i] < hasil){
                hasil = angka [i];
            }
        }
        System.out.println("angka terkecil adalah : "+hasil);
}
}
