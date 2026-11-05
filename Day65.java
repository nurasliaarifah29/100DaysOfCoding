import java.util.Scanner;
public class day65 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan angka a: ");
        int a = s.nextInt();

        for (int i = 1; i <= a; i++) {
            System.out.println("*");
        }
    }
}
