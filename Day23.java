import java.util.Scanner;

public class day23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Program menghitung luas persegi
        System.out.print("Masukkan panjang sisi persegi : ");
        float sisi = s.nextFloat();
        float luas = sisi * sisi;
        System.out.println("Luas persegi : " + luas);
    }
}
