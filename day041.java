import java.util.Scanner;
public class soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        int l = input.nextInt();

        int lama = (s + l) % 24;
        int total;
        if (lama > 9) {
            total = 9 - lama + 24;
            System.out.println(total + " jam");
        }else if (lama <= 9) {
            total = 9 - lama;
            System.out.println(total + " jam");
        } else {
            System.out.println("0 jam");
        }
    }
}
