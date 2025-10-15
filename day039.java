import java.util.Scanner;
public class day039 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan, harga = 0, porsi;
        String menu = null;
        
        System.out.println("## Menu Makanan ##");
        System.out.println("1. Bakso\n2. Mie Ayam\n3. Rujak");
        System.out.print("Pilih (1, 2, 3): ");
        pilihan = input.nextInt();
        
        if (pilihan == 1) {
            menu = "Bakso";
            harga = 10000;
        } else if (pilihan == 2) {
            menu = "Mie Ayam";
            harga = 15000;
        } else if (pilihan == 3) {
            menu = "Rujak";
            harga = 8000;
        }
        
        if (menu == null) {
            System.out.println("Pilihan Salah");
        } else {            
            System.out.print("Jumlah Porsi : ");
            porsi = input.nextInt();

            System.out.println("=================");
            System.out.println("Menu Dipesan\t: " + menu);
            System.out.printf("Harga\t\t: Rp %,d/porsi", harga);
            harga = harga * porsi;
            System.out.printf("\nTotal Harga\t: Rp %,d",  harga);
        }
    }
}
