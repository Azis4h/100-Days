package nilai5;

public class Main {
    
    public static void main(String[] args) {
        int arry [] = {10,3,6,8,52,6};
        int a = arry.length;
        int min = arry[0]; int max = arry[0];
        
        for(int i = 0; i < a; i++){
            if(arry [i] < min ){
                min = arry[i];
            }
            if(arry [i] > max ){
                max = arry[i];
            }
        }
        System.out.println("nilai min = "+min);
        System.out.println("nilai max = "+max);
    }
    
}
