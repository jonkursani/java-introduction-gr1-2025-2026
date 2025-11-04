package java_04.ushtrime;

public class Detyra2 {
    public static void main(String[] args) {
        double gjeresia = 5.6;
        double lartesia = 8.5;
        double syprina = gjeresia * lartesia;
        double perimetri = 2 * (gjeresia + lartesia);

        System.out.printf("Syprina eshte: %.2f * %.2f = %.2f%n", gjeresia, lartesia, syprina);
        System.out.printf("Perimetri eshte: 2 * (%.2f + %.2f) = %.2f", gjeresia, lartesia, perimetri);
    }
}