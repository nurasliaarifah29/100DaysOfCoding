import java.util.Scanner;
public class day78 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String usernameBenar = "lia";
        String passwordBenar = "12345";

        String username;
        String password;

        do {
            System.out.print("Masukkan username: ");
            username = s.nextLine();

            System.out.print("Masukkan password: ");
            password = s.nextLine();

            if (username.equals(usernameBenar) &&
                password.equals(passwordBenar)) {
                System.out.println("Login berhasil");
            } else {
                System.out.println("Username atau password salah");
            }

        } while (!username.equals(usernameBenar) ||
                 !password.equals(passwordBenar));
    }
}
