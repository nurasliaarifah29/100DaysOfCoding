import java.util.Scanner;
public class day56 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan N: ");
        int n = s.nextInt();

        System.out.println("Angka 1 sampai N:");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        System.out.println("Angka N sampai 1:");
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
