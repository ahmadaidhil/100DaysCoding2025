import java.util.Scanner;
public class day078 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Lengkap: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Kode Negara (JP/KR/US/IND/SG): ");
        String kode = input.nextLine();

        System.out.print("Masukkan Catatan Tambahan (boleh kosong): ");
        String catatan = input.nextLine();

        System.out.println("=== HASIL PEMROSESAN DATA ===");

        boolean awalKata = true; 
        String namaLengkap = "";
        if (nama.length() > 5) {
            for (int i = 0; i < nama.length(); i++) {
                char huruf = nama.charAt(i); 
                if (huruf == ' ') {
                    namaLengkap += huruf;
                    awalKata = true;
                } else if (awalKata) {
                    namaLengkap += Character.toUpperCase(huruf);
                    awalKata = false;
                } else {
                    namaLengkap += huruf;
                }
            }
        } else {
            System.out.println(nama.isEmpty() ? "Nama Kosong" : "Nama Terlalu Singkat");
            return;
        }

        if (kode.equalsIgnoreCase("JP")) {
            kode = "JP";
        } else if (kode.equalsIgnoreCase("KR")) {
            kode = "KR";
        } else if (kode.equalsIgnoreCase("US")) {
            kode = "US";
        } else if (kode.equalsIgnoreCase("IND")) {
            kode = "IND";
        } else if (kode.equalsIgnoreCase("SG")) {
            kode = "SG";
        } else {
            kode = "Salah Kode Negara!";
        }

        String detail = "Catatan tidak urgent";
        if (catatan.isEmpty()) {
            catatan = "Tidak ada catatan.";
        } else if (catatan.contains("urgent")) {
            System.out.println("Catatan: " + detail.replace("tidak urgent", "bersifat URGENT"));
        }

        System.out.println("Nama\t: " + namaLengkap);
        System.out.println("Tujuan\t: " + kode);
        System.out.println("Catatan\t: " + detail);
        System.out.println("Detail\t: " + catatan.toLowerCase().replace("hotel", "akomodasi"));
        System.out.println("Panjang Nama : " + nama.length() + " karakter");
    }
}
