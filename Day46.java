import java.util.Scanner;
public class day46 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("=== MENU ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Goreng");
        System.out.println("3. Ayam Goreng");

        System.out.print("Pilih menu: ");
        int pilihan = s.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Nasi Goreng");
                break;
            case 2:
                System.out.println("Anda memilih Mie Goreng");
                break;
            case 3:
                System.out.println("Anda memilih Ayam Goreng");
                break;
            default:
                System.out.println("Menu tidak tersedia");
        }
    }
}
