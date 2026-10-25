import java.util.Scanner;
public class day54 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int jumlah = 0;

        for(int i = 1; i <= n; i++){
            jumlah += i;
        }
        System.out.println(jumlah);
    }}
