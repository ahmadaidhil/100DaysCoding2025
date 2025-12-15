import java.util.Scanner;
public class day099 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas atas deretan bilangan prima: ");
        int n = input.nextInt();
        
        System.out.print("Deretan Bilangan Prima hingga " + n + ": ");
        for (int i = 2; i <= n; i++) {
            boolean prima = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prima = false;
                    break;
                }
            }
            if (prima) {
                System.out.print(i + " ");
            }
        }
    }
}
