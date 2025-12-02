package java_08;

import java.util.Scanner;

public class KalkulatoriSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani numrin e pare: ");
        int nr1 = sc.nextInt();

        System.out.print("Shkruani numrin e dyte: ");
        int nr2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Shkruaj operatorin (+,-,*,/,%): ");
        char operatori = sc.nextLine().charAt(0);

        switch (operatori) {
            case '+' -> System.out.println("Shuma: " + (nr1 + nr2));
            case '-' -> System.out.println("Ndryshimi: " + (nr1 - nr2));
            case '*' -> System.out.println("Prodhimi: " + (nr1 * nr2));
            case '/' -> {
                if (nr2 == 0) {
                    System.out.println("Nuk lejohet pjestimi me 0");
                } else {
                    System.out.println("Heresi: " + (nr1 / nr2));
                }
            }
            case '%' -> {
                if (nr2 != 0)
                    System.out.println("Mbetja: " + (nr1 % nr2));
                else
                    System.out.println("Nuk lejohet pjestimi (mbetja) me 0");
            }
            default -> System.out.println("Operatori gabim");
        }
    }
}