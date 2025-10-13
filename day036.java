import java.util.Scanner;
public class day036 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai = input.nextInt();

        if (nilai >= 90) {
            System.out.println("Nilai A");
        } else if (nilai >= 80) {
            System.out.println("Nilai B");
        } else if (nilai >= 70) {
            System.out.println("Nilai C");
        } else if (nilai >= 60) {
            System.out.println("Nilai D");
        } else {
            System.out.println("Nilai E");
        }
    }
}
