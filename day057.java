import java.util.Scanner;
public class day057 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if (n == 0) {
            System.out.println("Kosong");
        } else if (n > 0) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (n < 0) {
            for (int i = n; i < 0; i++) {
                for (int j = i; j < 0; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
