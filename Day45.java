import java.util.Scanner;
public class day45 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan angka 1-3: ");
        int pilihan = s.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Pilihan satu");
                break;
            case 2:
                System.out.println("Pilihan dua");
                break;
            case 3:
                System.out.println("Pilihan tiga");
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
        }
    }
}
