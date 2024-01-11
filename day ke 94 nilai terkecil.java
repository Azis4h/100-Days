package day94;

public class terkecil {
    public static void main(String[] args){
        int nilai [][] = {
            {43,6,3},
            {22,10,4},
            {34,6,1}
        };
        int hasil = nilai [0][0];
        for(int i = 0; i < nilai.length; i++){
            for(int j = 0; j < nilai[i].length; j++){
                if(nilai [i][j] < hasil){
                    hasil = nilai [i][j];
                }
            }
        }
        System.out.println("nilai terkecil adalah : "+hasil);
}
}
