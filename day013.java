package evaluasi01;

public class day013 {
    public static void main(String[] args) {
        int harta = 800000000;
        int biaya = (harta*8)/100;
        int harta2 = harta - biaya;
        System.out.println("Total Harta: "+ harta);
        System.out.println("Biaya Administrasi: " + biaya);
        int jatahLaki = harta2 / 2;
        int jatahCewe = jatahLaki / 2;
        System.out.println("Total harta setelah dikurang biaya administrasi: " + harta2);
        System.out.println("\nHarta  yang didapat laki-laki: " + jatahLaki);
        System.out.println("Tono mendapat: " + jatahLaki/2);
        System.out.println("Toni mendapat: " + jatahLaki/2);
        System.out.println("\nHarta  yang didapat perempuan: " + jatahCewe);
        System.out.println("Tini mendapat: " + jatahCewe/2);
        System.out.println("Tina mendapat: " + jatahCewe/2);
    }
}
