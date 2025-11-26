package java_07.ushtrime;

import java.util.Scanner;

public class Paga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani pagen: ");
        int paga = sc.nextInt();

        if (paga == 0) {
            System.out.println("Pa page");
        } else if (paga > 0 && paga <= 80) {
            System.out.println("Social");
        } else if (paga > 80 && paga <= 120) {
            System.out.println("Penzioner");
        } else if (paga > 120 && paga <= 180) {
            System.out.println("Page minimale");
        } else if (paga > 180 && paga <= 300) {
            System.out.println("Page mesatare");
        } else if (paga > 300 && paga <= 400) {
            System.out.println("Page e mire");
        } else if (paga > 400 && paga <= 600) {
            System.out.println("Page mbi mesatare");
        } else if (paga > 600) {
            System.out.println("Page e larte");
        } else {
            System.out.println("Keni shkruar pagen gabim paga duhet te jeta me e madhe ose e barabarte me 0");
        }
    }
}