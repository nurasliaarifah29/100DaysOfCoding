public class Main {
    
    public static void main(String[] args) {
        //Membuat Biodata Diri
        String nama = "lia";
        int umur = 20;
        double tinggi = 150.0;
        
       // println digunakan untuk menampilkan teks lalu pindah ke baris berikutnya
        System.out.println("Nama : " + nama);
        
        //print digunakan untuk menampilkan teks tanpa langsung pindah baris
        System.out.print("umur : " + umur );
        
        /* printf digunakan untuk menampilkan teks dengan format tertentu.
         * %s digunakan untuk teks atau String
         * %d digunakan untuk bilangan bulat atau int
         * %.1f digunakan untuk angka desimal dengan 1 angka di belakang koma
         */
        System.out.printf("\nnama saya %s,aku berumur %d,dan tinggi aku adalah %.1f \n" ,nama,umur,tinggi);
    }
}
