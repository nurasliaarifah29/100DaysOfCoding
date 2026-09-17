import java.util.Scanner;

public class day16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Operator Aritmatika Modulus/Sisa bagi (%)
        System.out.print("Masukkan nilai a : ");
        int nilaiA = s.nextInt();
        System.out.print("Masukkan nilai b : ");
        int nilaiB = s.nextInt();

        int hasilModulus = nilaiA%nilaiB;
        System.out.println("Hasil Modulus : " + hasilModulus);
    }
}
