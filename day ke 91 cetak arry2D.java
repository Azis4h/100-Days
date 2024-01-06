package day91;

public class arry2D {
    public static void main(String[] args){
        String  [][] buah = {
            {"nanas","nangka"},
            {"salak","pisang"}
        };
        
        for(int i = 0; i < buah.length; i++){
            for(int j = 0; j < buah[i].length; j++){
                System.out.print(buah [i][j] + " ");
            }
        }
        System.out.println("");
}
}
