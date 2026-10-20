import java.util.Scanner;
public class day49 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = s.nextInt();

        String hasil = nilai >= 60 ? "Lulus" : "Tidak lulus";

        System.out.println(hasil);
    }
}
