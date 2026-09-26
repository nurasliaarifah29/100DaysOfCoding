import java.util.Scanner;

public class day25 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        String input = s.nextLine();

        int r = Integer.parseInt(input);
        double jariJari = r;

        double luas = 3.14 * jariJari * jariJari;
        double hasil = luas - (luas * 2);

        String hasilString = String.valueOf(hasil);

        System.out.printf("Hasil akhir = %s%n", hasilString);
    }
}
