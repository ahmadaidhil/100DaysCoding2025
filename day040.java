import java.util.Scanner;
public class day040 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("----Kalkulator Sederhana----");
        double angka1, angka2, hasil;
        char operator;
        
        System.out.print("Masukkan angka pertama : ");
        angka1 = input.nextDouble();
        System.out.print("Pilih Operasi ( + - / x % ) : ");
        operator = input.next().charAt(0);
        System.out.print("Masukkan angka kedua : ");
        angka2 = input.nextDouble();
        
        if (operator == '+') {
            hasil = angka1 + angka2;
            System.out.println("Hasil : " + hasil);
        } else if (operator == '-') {
            hasil = angka1 - angka2;
            System.out.println("Hasil : " + hasil);
        } else if (operator == '/') {
            hasil = angka1 / angka2;
            System.out.println("Hasil : " + hasil);
        } else if (operator == 'x') {
            hasil = angka1 * angka2;
            System.out.println("Hasil : " + hasil);
        } else if (operator == '%') {
            hasil = angka1 % angka2;
            System.out.println("Hasil : " + hasil);
        } else {
            System.out.println("Ada Kesalahan Input");
        }
    }
}
