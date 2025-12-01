public class day084 {
    public static void main(String[] args) {
        int nilai[] = {75, 85, 90, 45, 60};
        int jumlah = 0;
        for (int i = 0; i < nilai.length; i++) {
            jumlah += nilai[i];
        }
        System.out.println("Jumlah: " + jumlah);
    }
}
