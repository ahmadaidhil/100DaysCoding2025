public class day086 {
    public static void main(String[] args) {
        int nilai[] = {75, 85, 90, 45, 60};
        int min = nilai[0];
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }
        System.out.println("Nilai Min: " + min);
    }
}
