import java.util.Scanner;
public class day63 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan angka a: ");
        int a = s.nextInt();

        System.out.print("Masukkan angka b: ");
        int b = s.nextInt();

        int hasil = 1;

        for (int i = 1; i <= b; i++) {
            hasil *= a;
        }

        System.out.println(a + " pangkat " + b + " = " + hasil);
    }
}
