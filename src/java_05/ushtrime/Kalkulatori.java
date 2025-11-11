package java_05.ushtrime;

import java.util.Scanner;

public class Kalkulatori  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani numrin e pare: ");
        int numri1 = sc.nextInt();

        System.out.print("Shkruani numrin e dyte: ");
        int numri2 = sc.nextInt();

        System.out.println("================================");
        System.out.printf("Numri i pare: %d.%n", numri1);
        System.out.printf("Numri i dyte: %d.%n", numri2);
        System.out.println("================================");

        int shuma = numri1 + numri2;
//        System.out.printf("Shuma e %d dhe %d eshte: %d.%n", numri1, numri2, shuma);
        System.out.printf("Shuma e %d dhe %d eshte: %d.%n", numri1, numri2, (numri1 + numri2));
        System.out.printf("Ndryshimi i %d dhe %d eshte: %d.%n", numri1, numri2, (numri1 - numri2));
        System.out.printf("Prodhimi i %d dhe %d eshte: %d.%n", numri1, numri2, (numri1 * numri2));
        System.out.printf("Heresi i %d dhe %d eshte: %d.%n", numri1, numri2, (numri1 / numri2));
        System.out.printf("Mbetja (%%) e %d dhe %d eshte: %d.%n", numri1, numri2, (numri1 % numri2));
        System.out.println("================================");
    }
}