package java_07.ushtrime;

import java.util.Scanner;

public class Rangu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani nje numer ne rangun -10,000 / 10,000: ");
        int numri = sc.nextInt();

        // and => && => T && T => T
        if (numri >= -10000 && numri <= 10000) {
            System.out.println("Numri eshte ne rangun e dhene: " + numri);
        } else {
            System.out.println("Numri nuk eshte ne rangun e dhene: " + numri);
        }
    }
}
