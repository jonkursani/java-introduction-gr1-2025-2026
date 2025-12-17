package java_10;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int x = 1;
        // ekezekutohet te pakten 1 her ne dallim me while
        do {
            System.out.println("x: " + x);
            x++;
        } while (x <= 10);

        Scanner sc = new Scanner(System.in);
//        System.out.print("Shkruani nje numer: ");
//        int numri;
//        do {
//            numri = sc.nextInt();
//            if (numri <= 0) {
//                System.out.println("Input gabim pranojme vetem numra pozitiv");
//            }
//        } while (numri <= 0);
        int numri;
        do {
            System.out.print("Shkruani nje numer pozitiv: ");
            numri = sc.nextInt();
        } while (numri <= 0);

        // numrat dhe katroret e tyre
        int nr = 1;
        do {
            System.out.printf("%d^2 = %d%n", nr, (nr * nr));
            nr++;
        } while (nr <= 100);
    }
}