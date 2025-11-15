import java.util.Scanner;

public class day069 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char n1 = input.nextLine().toUpperCase().charAt(0);
        char n2 = input.nextLine().toUpperCase().charAt(0);

        for (char i = 'A'; i <= n1; i++) {
            if (n2 == i) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
