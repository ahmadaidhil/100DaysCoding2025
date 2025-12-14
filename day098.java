import java.util.Scanner;
public class day098 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas deret Fibonacci: ");
        int n = input.nextInt();

        int fn1 = 1, fn2 = 1;
        System.out.print("Deret Fibonacci: " + fn1 + " " + fn2 + " ");
        for (int i = 2; i < n; i++) {
            int fn3 = fn1 + fn2;
            System.out.print(fn3 + " ");
            fn1 = fn2;
            fn2 = fn3;
        }
    }
}
