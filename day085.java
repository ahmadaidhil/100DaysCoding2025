public class day085 {
    public static void main(String[] args) {
        int nilai[] = {75, 85, 90, 45, 60};
        int max = nilai[0];
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            }
        }
        System.out.println("Nilai Max: " + max);
    }
}
