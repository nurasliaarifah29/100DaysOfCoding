import java.util.Scanner;
public class day37 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Latihan: Menentukan bilangan positif, negatif dan nol
        System.out.print("Angka: ");
        int angka = s.nextInt();
        if(angka > 0){
            System.out.println("angka " + angka + " harga baju naik karena banyak peminat - bilangan positif");
        }else if(angka < 0){
            System.out.println("angka " + angka + " harga jilbab turun ketika ada diskon besar - bilangan negatif");
        }else{
            System.out.println("angka ini seperti gratis ongkir - nol");
        }
    }
}

