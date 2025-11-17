import java.util.Scanner;
public class day071 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0 && i % 2 == 0) {
                    System.out.print("*");
                } else if (j % 2 == 1 && i % 2 == 1) {
                    System.out.print("*");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
