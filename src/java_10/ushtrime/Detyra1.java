package java_10.ushtrime;

import java.util.Scanner;

public class Detyra1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani numrin e rreshtave: ");
        int rreshtat = sc.nextInt();

        // printojme rreshtat
        for (int i = 1; i <= rreshtat; i++) {
            // per cdo rresht duhet mi printu 10 *
            for (int z = 1; z <= 10; z++) {
                System.out.print("*");
            }
            System.out.println(); // kalon ne rreshtin tjeter
        }
    }
}