public class day87 {
    public static void main(String[] args) {

        int[] angka = {10, 20, 30, 40, 50};

        System.out.println("Array awal:");

        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }

        angka[2] = 100;

        System.out.println("\nSetelah diubah:");

        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
    }
}
