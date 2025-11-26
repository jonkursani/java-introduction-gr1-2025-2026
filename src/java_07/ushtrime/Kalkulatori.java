package java_07.ushtrime;

import java.util.Scanner;

public class Kalkulatori {
    public static void main(String[] args) {
        Scanner skaneri = new Scanner(System.in);

        System.out.print("Shkruani numrin e pare: ");
//        int nr1 = skaneri.nextInt();
        int nr1 = Integer.parseInt(skaneri.nextLine());

        System.out.print("Shkruani numrin e dyte: ");
        //int nr2 = skaneri.nextInt(); // enter ose newline lexohet prej nextLine()
        //skaneri.nextLine();
        int nr2 = Integer.parseInt(skaneri.nextLine()); // "1" => 1

        // '+', "+"
        System.out.print("Shkruani operatorin (+,-,*,/,%): ");
        // String operatori = skaneri.nextLine();
        // lexo vetem shkronjen e pare
        char operatori = skaneri.nextLine().charAt(0);

        if (operatori == '+') {
            System.out.println("Mbledhja: " + (nr1 + nr2));
        } else if (operatori == '-') {
            System.out.println("Zbritja: " + (nr1 - nr2));
        } else if (operatori == '*') {
            System.out.println("Prodhimi: " + (nr1 * nr2));
        } else if (operatori == '/') {
            if (nr2 == 0) {
                System.out.println("Nuk lejohet pjestimi me 0");
            } else {
                System.out.println("Heresi: " + (nr1 / nr2));
            }
        } else if (operatori == '%') {
            if (nr2 != 0)
                System.out.println("Mbetja: " + (nr1 % nr2));
            else
                System.out.println("Nuk lejohet pjestimi/mbetja me 0");
        } else {
            System.out.println("Keni gabuar operatorin, operatoret valid: (+,-,*,/,%)");
        }
    }
}