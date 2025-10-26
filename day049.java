import java.util.Scanner;
public class day049 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nilai: ");
        int nilai = input.nextInt();
        
        String hasil = nilai >= 80 && nilai <= 100 ? "Selamat Anda Lulus" : "Maaf Anda Tidak Lulus";

        System.out.println(hasil);
    }
}
