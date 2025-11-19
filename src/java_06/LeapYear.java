package java_06;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani vitin: ");
        int year = sc.nextInt();

        boolean isLeapYear;

        isLeapYear = (year % 4 == 0) && (year % 100 != 0);
        isLeapYear = isLeapYear || (year % 400 == 0);
//        isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

        System.out.println("Vit i brisht: " + isLeapYear);
    }
}