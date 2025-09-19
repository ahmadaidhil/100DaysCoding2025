import java.util.Scanner;

public class day012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();
        System.out.print("Masukkan Jurusan: ");
        String jurusan = input.nextLine();
        System.out.print("Masukkan Alamat: ");
        String alamat = input.nextLine();
        System.out.print("Masukkan Nomor HP: ");
        long hp = input.nextLong();

        System.out.println("========BIODATA========");
        System.out.println("Nama\t: " + nama);
        System.out.println("NIM\t: " + nim);
        System.out.println("Jurusan\t: " + jurusan);
        System.out.println("Alamat\t: " + alamat);
        System.out.println("Nomor HP: " + hp);
    }
}
