import java.util.Scanner;

public class day24 {
    public static void main(String[] args) {
        //Program menghitung luas persegi panjang
        
        Scanner s = new Scanner(System.in);
        System.out.print("panjang : ");
        float panjang = s.nextFloat();
        System.out.print("lebar : ");
        float lebar = s.nextFloat();
        float luas = panjang * lebar;
        System.out.println("Luas persegi panjang : " + luas);
    }
}
