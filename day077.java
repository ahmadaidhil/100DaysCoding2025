public class day077 {
    public static void main(String[] args) {
        String kalimat = "Belajar Java itu menyenangkan";
        
        System.out.println("Substring (3,10): " + kalimat.substring(3, 10));
        System.out.println("Substring (11): " + kalimat.substring(11));
   
        System.out.println("Replace: " + kalimat.replace("menyenangkan", "seru"));

        String kalimat2 = "   Belajar   ";
        System.out.println("Trim: " + kalimat2.trim());
    }
}
