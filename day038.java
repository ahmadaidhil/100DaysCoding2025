import java.util.Scanner;
public class day038 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();

        if (angka > 0) {
            System.out.println("Positif");
        } else if (angka < 0) {
            System.out.println("Negatif");
        } else {
            System.out.println("Nol");
        }
    }
}
