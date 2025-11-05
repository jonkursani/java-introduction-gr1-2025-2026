package java_04.ushtrime;

import java.util.Scanner;

public class Rezultati {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani ekipin e pare: ");
        String ekipi1 = sc.nextLine();

        System.out.print("Shkruani ekipin e dyte: ");
        String ekipi2 = sc.nextLine();

        System.out.print("Numri i tifozeve: ");
        int tifozet = sc.nextInt(); // nuk e lexon new line ose enter
        sc.nextLine(); // prandaj e vendosim ni nextLine() te zbrazet

        System.out.print("Fusha/Arena: ");
        String fusha = sc.nextLine();

//        System.out.print("Sa gola i ka dhene ekipi 1: ");
        System.out.printf("Sa gola i ka dhene %s: ", ekipi1);
        int gola1 = sc.nextInt();

        System.out.printf("Sa gola i ka dhene %s: ", ekipi2);
        int gola2 = sc.nextInt();

        System.out.println("================================");
//        System.out.printf("%s - %s %d : %d%n", ekipi1, ekipi2, gola1, gola2);
        System.out.printf("%s %d - %d %s%n", ekipi1, gola1, gola2, ekipi2);
        System.out.printf("Stadiumi %s me gjithsej %d spektatore prezent%n", fusha, tifozet);
        System.out.println("================================");
    }
}