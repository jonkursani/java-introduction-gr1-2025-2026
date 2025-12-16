package java_10.ushtrime;

import java.util.Scanner;

public class Detyra7 {
    public static void main(String[] args) {
        // Tabela e shumzimit
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani nje numer: ");
        int numri = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d%n", i, numri, (i * numri));
        }
    }
}
