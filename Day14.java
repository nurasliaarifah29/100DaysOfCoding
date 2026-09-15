import java.util.Scanner;

public class day14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Operator aritmatika penjumlahan (+) dan pengurangan (-)
        System.out.print("Masukkan nilai a : ");
        int nilaiA = s.nextInt();
        System.out.print("Masukkan nilai b : ");
        int nilaiB = s.nextInt();
        //Penjumlahan
        int hasilPenjumlahan = nilaiA+nilaiB;
        //Pengurangan
        int hasilPengurangan = nilaiA-nilaiB;
        System.out.println("hasil penjumlahan : " + hasilPenjumlahan);
        System.out.println("hasil pengurangan : " + hasilPengurangan);
    }
}
