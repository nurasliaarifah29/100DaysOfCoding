import java.util.Scanner;
public class day60 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); {
  
        System.out.print("Masukkan a: ");
        int a = s.nextInt();

        int jumlah = 0;

        for (int i = 1; i <= a; i++) {
            jumlah += i;
        }

        System.out.println("Jumlah angka 1 sampai " + a + " = " + jumlah);
    }
}
}
