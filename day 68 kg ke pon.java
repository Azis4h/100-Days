package data;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Kilogram ke Pon");

        for (int kg = 1; kg <= 40; kg++) {
            double pon = kg * 2.20462;
            System.out.println(kg + " kg = " + pon + " pon");
        }
    }
    
}
