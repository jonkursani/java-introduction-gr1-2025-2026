package java_10.ushtrime;

import java.util.Scanner;

public class ChatApp {
    public static void main(String[] args) {
        final String STOP = "ndalo";
        String personi1 = "";
        String personi2 = "";

        Scanner sc = new Scanner(System.in);

        while (!(personi1.equalsIgnoreCase(STOP) && personi2.equalsIgnoreCase(STOP))) {
            System.out.print("Personi 1: ");
            personi1 = sc.nextLine();
            System.out.print("Personi 2: ");
            personi2 = sc.nextLine();
        }
    }
}