package java_07.ushtrime;

import java.util.Scanner;

public class Semafori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani nje numer: ");
        int numri = sc.nextInt();

        if (numri == 1) {
            System.out.println("Semafori i kuq");
        } else if (numri == 2) {
            System.out.println("Semafori i verdhe");
        } else if (numri == 3) {
            System.out.println("Semafori i gjelbert");
        } else if (numri == 4) {
            System.out.println("Semafori duke blinkuar");
        } else {
            System.out.println("Semafori nuk punon");
        }
    }
}