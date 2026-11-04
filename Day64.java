import java.util.Scanner;
public class day64 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan angka a: ");
        int a = s.nextInt();

        long faktorial = 1;

        for (int i = 1; i <= a; i++) {
            faktorial *= i;
        }

        System.out.println(a + "! = " + faktorial);
    }
}
