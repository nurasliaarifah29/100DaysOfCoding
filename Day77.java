import java.util.Scanner;
public class day77 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = s.nextLine();

        System.out.println("Nama: " + nama);
        System.out.println("Panjang: " + nama.length());
        System.out.println("Huruf besar: " + nama.toUpperCase());
        System.out.println("Huruf kecil: " + nama.toLowerCase());
        System.out.println("Mengandung A: " + nama.contains("A"));
        System.out.println("Nama kosong: " + nama.isEmpty());
        System.out.println("Tanpa spasi luar: " + nama.trim());
    }
}
