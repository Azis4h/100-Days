package data;

public class Main {
    
    public static void main(String[] args) {
        String pertama = "Hello";
        String kedua = "hEllO";
        
        if (pertama.equalsIgnoreCase(kedua)) {
            System.out.println("Kedua string sama.");
        } else {
            System.out.println("Kedua string berbeda.");
        }
    }
    
}
