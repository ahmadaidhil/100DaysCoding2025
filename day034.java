public class day034 {
    public static void main(String[] args) {
        System.out.println("=== Mencari tahun kabisat ===");
        int tahun = 2024;
        boolean kabisat = (tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0);
        System.out.println(tahun + " adalah tahun kabisat: " + kabisat);

        System.out.println("================================");
        int a = 10;
        int b = 20;
        int c = 15;
        int operasi1 = a + b * c;
        int operasi2 = a * b + c;
        System.out.println("Operasi 1 (a + b * c) = " + operasi1);
        System.out.println("Operasi 2 (a * b + c) = " + operasi2);
        System.out.println("Operasi 1 lebih besar = " + (operasi1 > operasi2) + ", habis dibagi 2 = " + (operasi1 % 2 == 0));
        System.out.println("Operasi 2 lebih besar = " + (operasi1 < operasi2) + ", habis dibagi 2 = " + (operasi2 % 2 == 0));
    }
}
