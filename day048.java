import java.util.Scanner;
public class day048 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Angka Pertama: ");
        double angka1 = input.nextInt();
        System.out.print("Pilih Operasi (+ - * / %): ");
        char operasi = input.next().charAt(0);
        System.out.print("Masukkan Angka Kedua: ");
        double angka2 = input.nextInt();

        switch (operasi) {
            case '+':
                System.out.println("Hasil: " + (angka1 + angka2));
                break;
            case '-':
                System.out.println("Hasil: " + (angka1 - angka2));
                break;
            case '*':
                System.out.println("Hasil: " + (angka1 * angka2));
                break;
            case '/':
                System.out.println("Hasil: " + (angka1 / angka2));
                break;
            case '%':
                System.out.println("Hasil: " + (angka1 % angka2));
                break;
            default:
                break;
        }
    }
}
