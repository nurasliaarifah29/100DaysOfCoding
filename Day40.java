import java.util.Scanner;
public class day41 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        //Latihan Menentukan temperatur ruangan menggunakan if
        System.out.print("Masukkan temperatur ruangan:");
        double suhu = s.nextDouble();
        if(suhu < 10){
            System.out.println("Ruangan terasa dingin");
        }else if(suhu <= 40){
            System.out.println("Ruangan terasa normal");
        }else{
            System.out.println("Ruangan terasa panas");
        }
    }
}
