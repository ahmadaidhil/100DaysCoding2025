import java.util.Scanner;
public class day056 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String username, password;
        int percobaan = 1;
        do {
            System.out.print("Username : ");
            username = input.nextLine();
            System.out.print("Password : ");
            password = input.nextLine();

            if (username.equals("Admin") && password.equals("Admin")) {
                System.out.println("Login Sebagai Admin");
                break;
            } else if (username.equals("Aidhil") && password.equals("12345")) {
                System.out.println("Login Sebagai Pengguna");
                break;
            } else {
                if (percobaan < 3) {
                    System.out.println("Silahkan Coba Lagi");
                } else {
                    System.out.println("Login Gagal");
                }
                percobaan++;
            }
        } while (percobaan <= 3);

    }
}
