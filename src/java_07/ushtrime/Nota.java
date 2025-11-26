package java_07.ushtrime;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sa pike ka studenti: ");
        int piket = scanner.nextInt();

        if (piket>=0 && piket <= 49){
            System.out.println("Nota 5");
        } else if (piket >= 50 && piket <=59){
            System.out.println("Nota 6");
        } else if (piket >= 60 && piket <= 69){
            System.out.println("Nota 7");
        } else if (piket >= 70 && piket <= 79){
            System.out.println("Nota 8");
        } else if (piket >= 80 && piket <= 89){
            System.out.println("Nota 9");
        } else if (piket >= 90 && piket <= 100){
            System.out.println("Nota 10");
        } else {
            System.out.println("Keni shkruar piket gabim");
        }
    }
}