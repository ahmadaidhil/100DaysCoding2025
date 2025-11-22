public class day076 {
    public static void main(String[] args) {
        String nama1 = "Achmad Aidhil";
        String nama2 = "achmad aidhil";
        String nama3 = "";
        System.out.println("Equals(): " + nama1.equals(nama2)); // false
        System.out.println("EqualsIgnoreCase(): " + nama1.equalsIgnoreCase(nama2)); // true
        System.out.println("Contains(): " + nama1.contains("Aidhil")); // true
        System.out.println("IsEmpty(): " + nama3.isEmpty()); // true
    }
}
