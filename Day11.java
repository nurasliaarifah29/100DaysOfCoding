import java.util.Scanner;

public class day11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       
        System.out.print("Nama:");
        String nama = s.nextLine();
        
        System.out.print("Umur:");
        int umur = s.nextInt();
        
        System.out.print("Tinggi Badan:");
        Double tb = s.nextDouble();
    
        System.out.print("Berat Badan:");
        Float bb = s.nextFloat();
       
        System.out.print("Bestie:");
        Byte bestie = s.nextByte();
       
        System.out.print("Saudara:");
        Long saudara = s.nextLong();
        
        System.out.print("No_Sepatu:");
        Short no_sepatu = s.nextShort();
    
        System.out.print("Gender:");
        char gender = s.next().charAt(0);
        
        System.out.print("Sehat:");
        boolean sehat = s.nextBoolean();
       
         System.out.println("Nama:"+nama);
         System.out.println("Umur:"+umur);
         System.out.println("Tinggi Badanli:"+tb);
         System.out.println("Berat Badan:"+bb);
         System.out.println("Bestie:"+bestie);
         System.out.println("Saudara:"+saudara);
         System.out.println("No_Sepatu:"+no_sepatu);
         System.out.println("Gender:"+gender);
         System.out.println("Sehat:"+sehat);

        /*Scanner adalah alat atau kelas dalam pemrograman 
         * yang digunakan untuk membaca input dari pengguna, 
         * seperti keyboard atau file, dan mengkonversi data 
         * menjadi format yang dapat diproses oleh komputer.
         */ 

    }
}
