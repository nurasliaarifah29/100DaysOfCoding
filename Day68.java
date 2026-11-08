import java.util.Scanner;
public class day68 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan panjang: ");
        int panjang = s.nextInt();

        System.out.print("Masukkan lebar: ");
        int lebar = s.nextInt();

        for (int i = 1; i <= lebar; i++) {
            for (int j = 1; j <= panjang; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
