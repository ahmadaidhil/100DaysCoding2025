import java.util.Scanner;
public class day097 {
    static double luasPersegi(double sisi) {
        return sisi * sisi;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi persegi: ");
        double sisi = scanner.nextDouble();
        System.out.println("Luas Persegi: " + luasPersegi(sisi));
    }
}
