package java_08.ushtrime;

import java.util.Scanner;

public class UshtrimeTest {
    public static void main(String[] args) {
        System.out.printf("%-8s    %s%n", "Emri", "Nota");
        System.out.printf("%-8s    %d%n", "Arbnor", 10);
        System.out.printf("%-8s    %d%n", "Jon", 8);

        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani nje numer (1-4): ");
        int numri = sc.nextInt();

        switch (numri) {
            case 1:
                System.out.println("1 - Programim");
                break;
            case 2:
                System.out.println("2 - Rrjeta");
                break;
            case 3:
                System.out.println("3 - Algoritme");
                break;
            default:
                System.out.println("Numri nuk eshte i vlefshme");
                break;
        }

        sc.nextLine();

        //
        System.out.print("Shkruani emrin: ");
        String emri = sc.nextLine();

        System.out.print("Shkruani moshen: ");
        int mosha = sc.nextInt();

        System.out.printf("Pershendetje %s, ti je %d vjec!%n", emri, mosha);
    }
}