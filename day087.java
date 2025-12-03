public class day087 {
    public static void main(String[] args) {
        int nilai[] = {75, 85, 90, 45, 60};
        System.out.println("Cari nilai 90 dalam array:");
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == 90) {
                System.out.println("Nilai 90 ditemukan pada index ke-" + i);
            }else {
                System.out.println("Nilai 90 tidak ditemukan pada index ke-" + i);
            }
        }
        
    }
}
