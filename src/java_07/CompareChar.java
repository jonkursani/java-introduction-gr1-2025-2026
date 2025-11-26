package java_07;

import java.util.Scanner;

public class CompareChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani nje simbol: ");
        char simboli = sc.nextLine().charAt(0);
        int nrSimboli = simboli;

        System.out.println("Numri i simbolit: " + nrSimboli);

        if (simboli >= '0' && simboli <= '9') {
            System.out.println("Simboli i dhene eshte numer");
        } else if (simboli >= 'A' && simboli <= 'Z') {
            System.out.println("Simboli eshte shkronje e madhe");
        } else if (simboli >= 'a' && simboli <= 'z') {
            System.out.println("Simboli eshte shkronje e vogel");
        } else {
            System.out.println("Ky simbol nuk ekziston");
        }
    }
}