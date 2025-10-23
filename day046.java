import java.util.Scanner;
public class day046 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih, porsi, harga;
        
        System.out.println("=== Menu Makanan ===");
        System.out.println("1. Bakso \n2. Mie Ayam");
        System.out.print("Pilih : ");
        pilih = input.nextInt();
        
        switch(pilih){
            case 1:
                System.out.print("Porsi : ");
                porsi = input.nextInt();
                System.out.println("Bakso Rp13000/porsi");
                harga = 13000 * porsi;
                System.out.println("Total : Rp." + harga);
                break;
            case 2:
                System.out.print("Porsi : ");
                porsi = input.nextInt();
                System.out.println("Mie Ayam Rp15000/porsi");
                harga = 15000 * porsi;
                System.out.println("Total : Rp." + harga);
                break;
            default:
                System.out.println("Pilihan Salah");
                break;
        }
        
    }
}
