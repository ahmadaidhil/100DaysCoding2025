public class day096 {
    static double tambah(double a, double b) {
        return a + b;
    }
    static double kurang(double a, double b) {
        return a - b;
    }
    static double kali(double a, double b) {
        return a * b;
    }
    static double bagi(double a, double b) {
        return a / b;
    }
    public static void main(String[] args) {
        double a = 20.5;
        double b = 4.5;
        System.out.println("Penjumlahan: " + tambah(a, b));
        System.out.println("Pengurangan: " + kurang(a, b));
        System.out.println("Perkalian: " + kali(a, b));
        System.out.println("Pembagian: " + bagi(a, b));
    }
}
