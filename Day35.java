import java.util.Scanner;
public class day35 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Nested if
        System.out.print("Masukkan nilai: ");
        int nilai = s.nextInt();

        if (nilai >= 60) {
            System.out.println("Lulus");

            if (nilai >= 80) {
                System.out.println("Nilai sangat baik");
            }
        } else {
            System.out.println("Tidak lulus");
        }
    }
}

