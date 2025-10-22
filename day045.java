import java.util.Scanner;
public class day045 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Pilihan (1, 2): ");
        int pilih = input.nextInt();

        switch (pilih) {
            case 1 :
                System.out.println("Laki-laki");
                break;
            case 2 :
                System.out.println("Perempuan");
                break;
            default:
                System.out.println("Pilihan Salah");
        }
    }
}
