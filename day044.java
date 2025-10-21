import java.util.Scanner;
public class day044 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int angka = input.nextInt();
        
        if (angka >= 90) {
            System.out.println("Nilai A");
        } else if (angka >= 80) {
            System.out.println("Nilai B");
        } else if (angka >= 70) {
            System.out.println("Nilai C");
        } else if (angka >= 60) {
            System.out.println("Nilai D");
        } else {
            System.out.println("Nilai E");
        }
    }
}
