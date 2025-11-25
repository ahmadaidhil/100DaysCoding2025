import java.util.Scanner;
public class day079 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Sign Up Account ===");
        System.out.print("Masukkan Username: ");
        String username = input.nextLine();
        System.out.print("Masukkan Password: ");
        String password = input.nextLine();

        System.out.println("=== Login ===");
        boolean login = false;
        while (!login) {
            System.out.print("Masukkan Username: ");
            String usernameLogin = input.nextLine();
            System.out.print("Masukkan Password: ");
            String passwordLogin = input.nextLine();
            if (usernameLogin.equals(username) && passwordLogin.equals(password)) {
                System.out.println("Login Berhasil! Selamat Datang.");
                login = true;
            } else if (!usernameLogin.equals(username) && passwordLogin.equals(password)) {
                System.out.println("Username salah. Silakan coba lagi.\n");
            } else if (usernameLogin.equals(username) && !passwordLogin.equals(password)) {
                System.out.println("Password salah. Silakan coba lagi.\n");
            } else {
                System.out.println("Username dan Password salah. Silakan coba lagi.\n");
            }
        }
        
    }
}
