import java.util.Scanner;
public class day36 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Latihan: Menentukan bilangan ganjil atau genap 
        System.out.print("Masukkan bilangan: ");
        int angka = s.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Bilangan Genap");
        } else {
            System.out.println("Bilangan Ganjil");
        }
    }
}
