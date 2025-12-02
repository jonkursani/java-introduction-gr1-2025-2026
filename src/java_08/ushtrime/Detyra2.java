package java_08.ushtrime;

import java.util.Scanner;

public class Detyra2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani ekipin e pare: ");
        String ekipi1 = sc.nextLine();

        System.out.print("Shkruani ekipin e dyte: ");
        String ekipi2 = sc.nextLine();

        System.out.print("Jepni prognozen: (1, X, 2): ");
        String prognoza = sc.nextLine();

        switch (prognoza) {
            case "1" -> System.out.printf("Prognoza ime per ndeshjen ne mes %s dhe %s eshte se fiton %s", ekipi1, ekipi2, ekipi1);
            case "2" -> System.out.printf("Prognoza ime per ndeshjen ne mes %s dhe %s eshte se fiton %s", ekipi1, ekipi2, ekipi2);
            case "x", "X" -> System.out.printf("Prognoza ime per ndeshjen ne mes %s dhe %s eshte se perfundon barazim", ekipi1, ekipi2);
            default -> System.out.println("Nuk ekziston kjo prognoze");
        }
    }
}