import java.util.Scanner;
public class day059 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 2; i <= n; i+=2) {
            System.out.print(i);
            if ((i + 2) <= n) {
                System.out.print(" - ");
            }
        }
        
        System.out.println();

        for (int i = n; i >= 1; i--) {
            if (i % 2 != 0 && i == 1) {
                System.out.print(i);
            } else if (i % 2 != 0) {
                System.out.print(i + " - ");
            }
        }
    }
}
