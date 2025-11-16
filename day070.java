import java.util.Scanner;
public class day070 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Panjang : ");
        int p = input.nextInt();
        System.out.print("Masukkan Lebar : ");
        int l = input.nextInt();

        for (int i = 1; i <= p ; i++) {
            for (int j = 1; j <= l; j++) {
                if (j == 1 || j == l) {
                    System.out.print("|");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
