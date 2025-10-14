import java.util.Scanner;
public class day037 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();

        if (angka != 0) {
            if (angka % 2 == 0) {
                System.out.println("Genap");
            } else {
                System.out.println("Ganjil");
            }
        } else {
            System.out.println("Nol");
        }
    }
}
