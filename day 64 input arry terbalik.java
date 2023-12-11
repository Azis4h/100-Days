package mencari;

public class Main {
    
    public static void main(String[] args) {
        String hari [] = {"senin","selasa","rabu","kamis"};
        
        for (int i = hari.length-1; i >= 0; i--) {
            System.out.println("indeks ke " + i + " = " + hari[i]); 
        }
    }
    
}
