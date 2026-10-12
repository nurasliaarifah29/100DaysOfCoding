import java.util.Scanner;
public class day41 {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Angka:");
        double angka = s.nextDouble();
        if(angka %  1 == 0){
            if(angka %  5 == 0){
                System.out.println("Bilangan Bulat - Kelipatan 5");
            }else{
                System.out.println("Bilangan Bulat - Bukan Kelipatan 5");
            }
            }else{ 
            System.out.println("Bilangan Desimal");
            }
        }
}

