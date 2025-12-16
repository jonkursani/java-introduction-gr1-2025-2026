package java_10.ushtrime;

import java.util.Scanner;

public class Detyra2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani numrin e rreshtave: ");
        int rreshtat = sc.nextInt();

        for (int i = 1; i <= rreshtat; i++) {
            for (int j = i; j <= rreshtat; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}