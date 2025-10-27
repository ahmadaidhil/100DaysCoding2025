import java.util.Scanner;
public class day050 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai: ");
        int nilai = input.nextInt();

        String hasil = nilai == 0 ? "Nol" : nilai % 2 == 0 ? "Genap" : "Ganjil";

        System.out.println(hasil);
    }
}
