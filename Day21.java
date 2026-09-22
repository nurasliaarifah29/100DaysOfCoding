public class day21 {
    public static void main(String[] args) {
        
        //Mengubah string menjadi tipe data primitif

        // String ke int
        String dataA = "80";
        int nilaiA = Integer.parseInt(dataA);
        System.out.println("String ke int : " + nilaiA);

        // String ke double
        String dataB = "85.5";
        double nilaiB = Double.parseDouble(dataB);
        System.out.println("String ke double : " + nilaiB);

        // String ke float
        String dataC = "72.8";
        float nilaiC = Float.parseFloat(dataC);
        System.out.println("String ke float : " + nilaiC);
    }
}
