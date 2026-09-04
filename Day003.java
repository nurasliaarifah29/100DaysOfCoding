public class Day3 {
    public static void main(String[] args) {
        String nama = "Nur Aslia Arifah";
        String nama1 = "lia";
    
        // Escape Sequence \n -> untuk baris baru
        System.out.println("Hai \nSemuaa");

        // Escape Sequence \b -> untuk menghapus satu karakter
        System.out.println("Perkenalkan nama saya\b" + nama);

        // Escape Sequence \t -> untuk memberikan spasi didepan karakter
        System.out.println("Saya lahir pada tanggal\t29 April 2006");

        // Escape Sequence \s -> untuk memberikan satu spasi
        System.out.println("Nama panggilan saya\s" + nama1);

        // Escape Sequence \\ -> untuk menampilkan backslash
        System.out.println("Alamat saya \\Dipappota\\ belakang kantor pajak Majene");

        // Escape Sequence \" -> untuk menambah tanda kutip pada samping atas kata
        System.out.println("Saya kuliah di \"Universitas Sulawesi Barat\"");

        // Escape Sequence \' -> untuk menampilkan tanda kutip tunggal
        System.out.println("Saya mengambil prodi \'Informatika\' dengan NIM D0225023");
    }
}
