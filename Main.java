package day20array;

public class Main {
    
    public static void main(String[] args) {
        int[] Nilai = new int[5];
        
        Nilai[0] = 10;
        Nilai[1] = 20;
        Nilai[2] = 30;
        Nilai[3] = 40;
        Nilai[4] = 50;
        
        for (int i = 0; i < Nilai.length; i++) {
            System.out.println("Element ke-" + i + ": " + Nilai[i]);
        }
    }
    
}