import java.util.Scanner;

public class day12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Biodata Saya
       
        System.out.print("Masukkan Nama:");
        String nama = s.nextLine();

        System.out.print("Masukkan Umur:");
        int umur = s.nextInt();
        s.nextLine(); //saya gunakan ini agar enter dari input umur tidak ikut terbaca sebagai alamat

        System.out.print("Masukkan Alamat:");
        String alamat = s.nextLine();

        System.out.print("Masukkan Semester:");
        int semester = s.nextInt();

        System.out.println("Nama:"+nama);
        System.out.println("Umur:"+umur);
        System.out.println("Alamat:"+alamat);
        System.out.println("Semester:"+semester);
        


    }
}
