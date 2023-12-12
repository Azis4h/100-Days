package username;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        String username = "azisah";
        String password = "azisah27";
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String usernameinput = sc.nextLine();

        System.out.print("Masukkan password: ");
        String passwordinput = sc.nextLine();
        
        if (usernameinput.equals(username) && passwordinput.equals(password)) {
            System.out.println("Login sukses");
        } else {
            System.out.println("Login gagal");
        }
    }
    
}
