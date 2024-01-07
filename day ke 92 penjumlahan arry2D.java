package day92;

public class input {
    public static void main(String[] args){
        int data [][] = {
            {72,7,55},
            {41,5,8},
            {32,33,10}
        };
        int jumlah = 0;
        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data[i].length; j++){
                jumlah += data[i][j];
            }
        }
        System.out.println("jumlahnya adalah : "+jumlah);
}
}
