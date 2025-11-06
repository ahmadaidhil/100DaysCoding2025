import java.util.Scanner;
public class day060 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int plus1 = 0, plus2 = 0;
        System.out.println("Genap :");
        for (int i = 2; i <= n; i+=2) {
            plus1 += i;
            System.out.print(i);
            if ((i + 2) <= n) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + plus1);
        System.out.println("Ganjil :");
        for (int i = n; i >= 1; i--) {
            if (i == 1) {
                plus2 += i;
                System.out.print(i);
            } else if (i % 2 != 0) {
                plus2 += i;
                System.out.print(i + " + ");
            }
        }
        System.out.println(" = " + plus2);
    }
}
