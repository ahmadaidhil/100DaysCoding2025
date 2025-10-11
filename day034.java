public class day034 {
    public static void main(String[] args) {
        System.out.println("=== Mencari tahun kabisat ===");
        int tahun = 2024;
        boolean kabisat = (tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0);
        System.out.println(tahun + " adalah tahun kabisat: " + kabisat);
    }
}
