import java.util.Scanner;
public class day064 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nilai M : ");
        int m = input.nextInt();
        System.out.print("Masukkan Pangkat N : ");
        int n = input.nextInt();
        int hasil = 1;

        for (int i = 1; i <= n; i++) {
            if (i == n) {
                System.out.print(m + " = ");
            }else {
                System.out.print(m + " x ");
            }
            hasil *= m;
        }
        System.out.print(hasil);
    }
}
