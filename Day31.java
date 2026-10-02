import java.util.Scanner;
public class day31 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        //Operator Logika AND(&&), OR(||), NOT(!)
        System.out.print("Angka1: ");
        int Angka1 = s.nextInt();

        System.out.print("Angka2: ");
        int Angka2 = s.nextInt();

        // AND
        System.out.println(Angka1 > 5 && Angka2 > 5);

        // OR
        System.out.println(Angka1 > 5 || Angka2 > 5);

        // NOT
        System.out.println(!(Angka1 > Angka2));
    }
}
    

