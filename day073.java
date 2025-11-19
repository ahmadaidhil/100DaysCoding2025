import java.util.Scanner;
public class day073 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hasil = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.print("Masukkan angka : ");
            int angka = input.nextInt();
            if (angka < 0) {
                hasil += Math.abs(angka);
                break;
            } else {
                hasil += angka;
            }
        }
        System.out.println("Hasil : " + hasil);
        
    }
}
