import java.util.Scanner;
public class day48 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Angka pertama: ");
        double a = s.nextDouble();

        System.out.print("Angka kedua: ");
        double b = s.nextDouble();

        System.out.print("Operator (+, -, *, /): ");
        char operator = s.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Hasil = " + (a + b));
                break;
            case '-':
                System.out.println("Hasil = " + (a - b));
                break;
            case '*':
                System.out.println("Hasil = " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Hasil = " + (a / b));
                } else {
                    System.out.println("Tidak bisa membagi dengan nol");
                }
                break;
            default:
                System.out.println("Operator tidak tersedia");
        }
    }
}
