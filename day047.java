import java.util.Scanner;

public class day047 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Pilih (1, 2, 3, 4, 5, 6, 7): ");
        int pilih = input.nextInt();

        switch (pilih) {
            case 1:
                System.out.println("Hari Senin");
                break;
            case 2:
                System.out.println("Hari Selesa");
                break;
            case 3:
                System.out.println("Hari Rabu");
                break;
            case 4:
                System.out.println("Hari Kamis");
                break;
            case 5:
                System.out.println("Hari Jumat");
                break;
            case 6:
                System.out.println("Hari Sabtu");
                break;
            case 7:
                System.out.println("Hari Minggu");
                break;
            default:
                System.out.println("Pilihan Salah");
        }
    }
}
