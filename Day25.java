import java.util.Scanner;

public class day25 {
    public static void main(String[] args) {
        
        //program menghitung luas lingkaran
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran : ");
        double r = s.nextDouble();
        double luas = Math.PI * r * r;
        System.out.println("Luas lingkaran = " + luas);
    }
}
