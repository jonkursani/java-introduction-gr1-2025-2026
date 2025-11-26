package java_07;

import java.util.Scanner;

public class IntOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani numrin e pare: ");
        int nr1 = sc.nextInt();

        System.out.print("Shkruani numrin e dyte: ");
        int nr2 = sc.nextInt();

        // shuma
        int shuma = nr1 + nr2;
        System.out.println("Shuma: " + shuma);

        // ndryshimi
        System.out.println("Ndryshimi: " + (nr1 - nr2));

        // Pjestimi ose heresi
        // kontrollu a eshte nr2 == 0
        if (nr2 == 0) {
            System.out.println("Nuk lejohet pjestimi me 0");
        } else {
            System.out.println("Heresi: " + (nr1 / nr2));
        }

        // Prodhimi
        System.out.println("Prodhimi: " + (nr1 * nr2));

        // Mbetja
        if (nr2 != 0) {
            System.out.println("Mbetja: " + (nr1 % nr2));
        } else {
            System.out.println("Nuk lejohet pjestimi/mbetja me 0");
        }
    }
}