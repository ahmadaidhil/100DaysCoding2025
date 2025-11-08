import java.util.Scanner;
public class day062 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nilai N : ");
        int n = input.nextInt();

        int jumlah = 0;
        for (int i = 1; i <= n; i++) {
            if (i == n) {
                System.out.print(i + " = ");
            } else {
                System.out.print(i + " + ");
            }
            jumlah += i;
        }
        System.out.print(jumlah);
    }
}
