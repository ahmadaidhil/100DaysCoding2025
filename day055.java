import java.util.Scanner;
public class day055 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Batas Atas: ");
        int atas = input.nextInt();
        System.out.print("Batas Bawah: ");
        int bawah = input.nextInt();
        System.out.print("Angka: ");
        int angka = input.nextInt();

        if (angka > atas && angka < bawah) {
            System.out.println("YAYAYAYA");
        } else {
            System.out.println("NONONONO");
        }
    }
}
