import java.util.Scanner;
public class day42 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan gaji pokok: ");
        double gaji = s.nextDouble();

        System.out.print("Masukkan potongan: ");
        double potongan = s.nextDouble();

        double gajiBersih = gaji - potongan;

        System.out.println("Gaji bersih = " + gajiBersih);
    }
}

