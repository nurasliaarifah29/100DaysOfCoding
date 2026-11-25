public class day85 {
    public static void main(String[] args) {

        int[] angka = {10, 50, 20, 80, 30};

        int minimal = angka[0];

        for (int i = 1; i < angka.length; i++) {
            if (angka[i] < minimal) {
                minimal = angka[i];
            }
        }

        System.out.println("Angka minimal = " + minimal);
    }
}
