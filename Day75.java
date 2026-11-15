import java.util.Scanner;
public class day75 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan kata pertama: ");
        String kata1 = s.nextLine();

        System.out.print("Masukkan kata kedua: ");
        String kata2 = s.nextLine();

        System.out.println("Sama persis: " + kata1.equals(kata2));
        System.out.println("Sama tanpa melihat huruf besar: " + kata1.equalsIgnoreCase(kata2));
        System.out.println("Mengandung kata kedua: " + kata1.contains(kata2));
        System.out.println("Apakah kosong: " + kata1.isEmpty());
    }
}
