import java.util.Scanner;
public class day59 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan M: ");
        int m = s.nextInt();

        System.out.print("Masukkan N: ");
        int n = s.nextInt();

        if (m <= 0) {
            System.out.println("M harus lebih dari 0");
            return;
        }

        System.out.println("Kelipatan " + m + ":");
        for (int i = m; i <= n; i += m) {
            System.out.println(i);
        }
    }
}
