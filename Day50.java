import java.util.Scanner;
public class day50 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int angka = s.nextInt();

        String hasil = angka % 2 == 0
                ? "Bilangan Genap"
                : "Bilangan Ganjil";

        System.out.println(hasil);
    }
}
