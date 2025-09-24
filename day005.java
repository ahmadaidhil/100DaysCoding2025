public class day005 {
    public static void main(String[] args) {
        byte a = 50; //-128 s/d 127
        short b = 5000; //-32,768 s/d 32,767
        int c = 50000; //-2,147,483,648 s/d 2,147,483,647
        long d = 1500000000; //-9,223,372,036,854,775,808 s/d 9,223,372,036,854,775,807

        System.out.println("Byte\t: " + a);
        System.out.println("Short\t: " + b);
        System.out.println("Int\t: " + c);
        System.out.println("Long\t: " + d);
    }
}

