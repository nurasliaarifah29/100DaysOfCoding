import java.util.Scanner;
public class day71 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int angka;
        int jumlah = 0;

        do {
            System.out.print("Masukkan angka: ");
            angka = s.nextInt();

            if (angka >= 0) {
                jumlah += angka;
            }

        } while (angka >= 0);

        System.out.println("Total penjumlahan = " + jumlah);
    }
}
