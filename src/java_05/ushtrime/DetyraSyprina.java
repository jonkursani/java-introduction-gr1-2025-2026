package java_05.ushtrime;

import java.util.Scanner;

public class DetyraSyprina {
    public static void main(String[] args) {
        // Syprina e trekendeshit => s = 1/2 * b * h
        Scanner sc = new Scanner(System.in);

//        System.out.print("Shkruani bazen: ");
//        double b = sc.nextDouble();
//
//        System.out.print("Shkruani lartesine: ");
//        double h = sc.nextDouble();
//
//        double s = 0.5 * b * h;
//
//        System.out.println("Syprina e trekendeshit eshte: " + s);

        // Syprina e katorit => s = a^2 ose a * a
//        System.out.print("Shkruani brijen a: ");
//        double a = sc.nextDouble();
//
////        double s = a * a;
//        double s = Math.pow(a, 2); // a^2
//
//        System.out.println("Syprina e katorit eshte: " + s);

        // Syprina e drejtkendeshit => s = length * width
//        System.out.print("Shkruani gjatesine: ");
//        double l = sc.nextDouble();
//
//        System.out.print("Shkruani gjeresine: ");
//        double w = sc.nextDouble();
//
//        double s = l * w;
//
//        System.out.println("Syprina e drejtkendeshit eshte: " + s);

        // Syprina e rrethit => s = pi * r^2
        final double PI = 3.14;

        System.out.print("Shkruani rrezen: ");
        double r = sc.nextDouble();

//        double s = PI * r * r;
        double s = Math.PI * Math.pow(r, 2);

        System.out.println("Syprina e rrethit eshte: " + s);
    }
}