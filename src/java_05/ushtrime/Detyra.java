package java_05.ushtrime;

import java.util.Scanner;

public class Detyra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ligji i dyte i njutonit => F = m * a
//        System.out.print("Shkruani masen: ");
//        double m = sc.nextDouble();
//
//        System.out.print("Shkruani nxitimin (a): ");
//        double a = sc.nextDouble();
//
//        double f = m * a;
//
//        System.out.println("F = " + f);

        // Forca e gravitetit => F = m * G
        final double GRAVITY = 9.81;

        System.out.print("Shkruani masen: ");
        double m = sc.nextDouble();

        double f = m * GRAVITY;

        System.out.println("F = " + f);
    }
}