package java_05.ushtrime;

import java.util.Scanner;

public class Trekendeshi {
    public static void main(String[] args) {
        // c = / a^2 + b^2 => hipotenuza
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani kateten a: ");
        int a = sc.nextInt();

        System.out.print("Shkruani kateten b: ");
        int b = sc.nextInt();

//        double c = Math.sqrt((a * a) + (b * b));
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("Hipotenuza eshte: " + c);
    }
}