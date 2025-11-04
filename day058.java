import java.util.Scanner;
public class day058 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int jumlah = 0;
        int kali = 1;

        System.out.println("Penjumlahan :");
        for (int i = 1; i <= n; i++) {
            if (i == n) {
                System.out.print(i + " = ");
            } else {
                System.out.print(i + " + ");
            }
            jumlah += i;
        }
        System.out.print(jumlah);
        System.out.println("\nPerkalian :");

        for (int i = n; i >= 1; i--) {
             if (i == 1) {
                System.out.print(i + " = ");
            } else {
                System.out.print(i + " * ");
            }
            kali *= i;
        }
        System.out.print(kali);
    }
}
