package java_10;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        // Average
        int sum = 0, count = 0;
//        while (count < 10) {
//            count++;
////            sum = sum + count;
//            sum += count;
//        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani noten (0 - per tu ndalur): ");

        while (!sc.hasNextInt()) {
            System.out.print("Input Gabim pranojme vetem numra: ");
            sc.next();
        }

        int numri = sc.nextInt();

        while (numri != 0) {
            count++;
            sum += numri;
            System.out.print("Shkruani noten: ");
            while (!sc.hasNextInt()) {
                System.out.print("Input Gabim pranojme vetem numra: ");
                sc.next();
            }
            numri = sc.nextInt();
        }

        double avg = (double) sum / count;

        System.out.println("Avg: " + avg);

        // numri dhe katrori i tyre
        int x = 1;
        while (x <= 100) {
            System.out.printf("%d^2 = %d%n", x, (x * x));
            x++;
        }

        System.out.println();

        // Numrat cift
        System.out.print("Shkruani rangun: ");
        while (!sc.hasNextInt()) {
            System.out.print("Input Gabim pranojme vetem numra: ");
            sc.next();
        }
        int rangu = sc.nextInt();
        int fillimi = 2;
        while (fillimi <= rangu) {
            System.out.print(fillimi + " ");
//            if (fillimi % 2 == 0)
//                System.out.print(fillimi + " ");
//            fillimi++

            fillimi += 2;
        }

        System.out.println();

        // Shkronjat A-Z
        char A = 'A';
        while (A <= 'Z') {
            System.out.print(A + " ");
            A++;
        }

        System.out.println();

        for (A = 'Z'; A >= 'A'; A--) {
            System.out.print(A + " ");
        }
    }
}