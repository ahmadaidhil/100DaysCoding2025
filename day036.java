import java.util.Scanner;
public class day036 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String status = "";
        System.out.print("Masukkan total belanjaan: ");
        int total = input.nextInt();
        System.out.print("Punya Member (Y/N)? : ");
        char member = input.next().charAt(0);
        double diskon = 0;
        if (member == 'Y' || member == 'y') {
            if (total >= 500000) {
                diskon = 0.2;
            } else {
                diskon = 0.05;
            }
            status = "ya";
        } else if (member == 'N' || member == 'n') {
            if (total > 500000) {
                diskon = 0.1;
            } else {
                diskon = 0;
            }
            status = "tidak";
        } else {
            System.out.println("Input tidak valid");
        }

        System.out.println("=== Rincian Belanjaan ===");
        System.out.println("Total Belanjaan: " + total);
        System.out.println("Status Member:" + status);
        System.out.println("Diskon: " + (diskon * 100) + "%");
        System.out.println("Total Bayar: Rp" + (total - (total * diskon)));

    }
    
}
