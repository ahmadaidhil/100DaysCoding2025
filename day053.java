public class day053 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            if (i == 50) {
                System.out.println("Berhenti saat ke 50");
                break;
            }
        }
        System.out.println("Selesai");
    }
}
