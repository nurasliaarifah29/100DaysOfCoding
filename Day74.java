import java.util.Scanner;
public class day74 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = s.nextLine();

        System.out.println("Panjang nama: " + nama.length());
        System.out.println("Huruf besar: " + nama.toUpperCase());
        System.out.println("Huruf kecil: " + nama.toLowerCase());
    }
}
