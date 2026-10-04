import java.util.Scanner;
public class day33 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Percabangan (if-else)
        System.out.print("Masukkan umur = ");
        int umur = s.nextInt();
        if(umur >= 15){
            System.out.println("Kamu sudah dewasa");
        }else{
             System.out.println("Kamu masih bocil ");
        }
    }
}


  
