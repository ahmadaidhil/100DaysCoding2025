import java.util.Scanner;
public class BersarangMenuMakanan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pilihan, porsi=0, harga=0, jumlah, diskon=0;
        String menu = "";
        
        System.out.println("## Menu Makanan ##");
        System.out.println("1. Bakso Lokal\n2. Bakso Luar Negeri");
        System.out.print("Pilih Menu: ");
        pilihan = input.nextDouble();
        
        if (pilihan == 1) {
            System.out.print("Berapa Porsi : ");
            porsi = input.nextDouble();
            menu = "Bakso Lokal";
            harga = 10000;
        } else if (pilihan == 2) {
            System.out.print("Berapa Porsi : ");
            porsi = input.nextDouble();
            menu = "Bakso Luar Negeri";
            harga = 12000;
            
            if (porsi >= 10) {
                System.out.println("Dapat Diskon 10%");
                diskon = 10 *(harga *  porsi) / 100;
            } else {
                System.out.println("Diskon Minimal 10 Porsi");
            }
        } else {
            System.err.println("Pilihan tidak valid");
            System.exit(0);
        }
        
        System.out.println("======== Pesanan Anda =========");
        System.out.println("Menu : " + menu);
        int value = (int)porsi;
        System.out.println("Porsi : " + value);
        jumlah = (harga * porsi) - diskon;
        int value2 = (int)jumlah;
        System.out.println("Total Pesanan = Rp. " + value2);
    }
    
}
