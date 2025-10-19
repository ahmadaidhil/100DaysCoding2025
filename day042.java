import java.util.Scanner;
public class day042 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan gaji pokok: ");
        int pokok = input.nextInt();
        System.out.print("Masukkan jumlah jam lembur: ");
        int lembur = input.nextInt();

        int gajiLembur = 55000;
        int total = pokok + (lembur * gajiLembur);
        System.out.println("Gaji bersih yang diterima: " + total);
    }
}
