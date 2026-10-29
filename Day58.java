import java.util.Scanner;

public class day58 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan N: ");
        int n = s.nextInt();

        System.out.println("Bilangan ganjil dari N ke 1:");
        for (int i = n; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        System.out.println("Bilangan genap dari N ke 1:");
        for (int i = n; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
