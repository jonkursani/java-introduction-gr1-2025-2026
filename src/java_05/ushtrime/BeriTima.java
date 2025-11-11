package java_05.ushtrime;

import java.util.Scanner;

public class BeriTima {
    public static void main(String[] args) {
        Scanner skaneri = new Scanner(System.in);

        System.out.print("Shkruani sa euro keni: ");
        int euro = skaneri.nextInt();

        System.out.print("Shkruani sa cent keni: ");
        int cent = skaneri.nextInt();

        // 1 euro = 100 cent => 2 * 100 = 200 cent + 45 = 245 cent
        int parate = (euro * 100) + cent; // kthimi i eurove ne cent

        System.out.println("5 euro: " + (parate / 500)); // 5 euro => 500cent => 500 / 500 = 1
        parate = parate % 500; // na duhet me dit mbetjen e paravae per me vazhdu me hapin tjeter
        // 445 / 500 => 0
        // 445 % 500 => 445

        System.out.println("2 euro: " + (parate / 200));
        parate = parate % 200;

        // 445 / 200 = 2
        // 445 % 200 = 45

        System.out.println("1 euro: " + (parate / 100));
        parate = parate % 100;

        System.out.println("50 cent: " + (parate / 50));
        parate = parate % 50;

        System.out.println("20 cent: " + (parate / 20));
        parate = parate % 20;

        System.out.println("10 cent: " + (parate / 10));
        parate = parate % 10;

        System.out.println("5 cent: " + (parate / 5));
        parate = parate % 5;

        System.out.println("2 cent: " + (parate / 2));
        parate = parate % 2;

        System.out.println("1 cent: " + parate);
    }
}