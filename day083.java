import java.util.Scanner;
public class day083 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sesi = input.nextInt();
        int jam=0, detik=0, menit=0;

        for (int i = 1; i <= sesi; i++) {
            System.out.println("Sesi ke-" + i);
            System.out.print("Jam : ");
            jam += input.nextInt();
            System.out.print("Menit : ");
            menit += input.nextInt();
            System.out.print("Detik : ");
            detik += input.nextInt();
        }

        menit += detik / 60; 
        detik = detik % 60;
        jam += menit / 60;
        menit = menit % 60;

        System.out.println("total : " + jam + " jam " + menit + " menit " + detik + " detik");
        if (jam > 24) {
            System.out.println("Seppuh");
        } else if (jam >= 8) {
            System.out.println("Abang Jago");
        } else {
            System.out.println("Kapan Jagonya?");
        }
    }
}
