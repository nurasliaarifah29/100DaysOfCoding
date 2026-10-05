import java.util.Scanner;
public class day34 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Percabangan (if-else if-else)
        System.out.print("Masukkan nilai: ");
        int nilai = s.nextInt();

        if (nilai >= 80) {
            System.out.println("Nilai A");
        } else if (nilai >= 70) {
            System.out.println("Nilai B");
        } else if (nilai >= 60) {
            System.out.println("Nilai C");
        } else {
            System.out.println("Nilai D");
        }
    }
}

