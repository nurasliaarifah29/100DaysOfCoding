import java.util.Scanner;
public class day32 {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        //Latihan: Mengkombinasikan berbagai operator
        System.out.print("nilai a = ");
        int a = s.nextInt();
        System.out.print("nilai b = ");
        int b  = s.nextInt();
        System.out.print("nilai c = ");
        int c  = s.nextInt();
        //Update nilai a
        a = a + (b*c);
        boolean hasil = (a % 2 == 0 && a/b>c || a-b <=10);
        System.out.println("Nilai akhir = " + a);
        System.out.println("Hasil logika = " + hasil);
    }
    }


 
