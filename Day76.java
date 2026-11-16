import java.util.Scanner;
public class day76 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kalimat = s.nextLine();

        System.out.println("Substring: " + kalimat.substring(0, 3));
        System.out.println("Replace: " + kalimat.replace("a", "o"));
        System.out.println("Trim: " + kalimat.trim());
    }
}
