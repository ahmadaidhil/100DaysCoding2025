import java.util.Scanner;
public class day051 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        for (int i = 1; i <= angka; i++) {
            System.out.println(i);
        }
    }
}
