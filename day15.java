import java.util.Scanner;

public class day15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Operator aritmatika Perkalian (*) dan Pembagian (/)
        System.out.print("Masukkan nilai a : ");
        int nilaiA = s.nextInt();
        System.out.print("Masukkan nilai b : ");
        int nilaiB = s.nextInt();
        //Perkalian
        int hasilPerkalian = nilaiA*nilaiB;
        //Pembagian
        int hasilPembagian = nilaiA/nilaiB;
        System.out.println("hasil perkalian : " + hasilPerkalian);
        System.out.println("hasil pembagian : " + hasilPembagian);
    }
}
