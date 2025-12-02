package java_08.ushtrime;

import java.util.Scanner;

public class Detyra1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shtypni njeren nga menyte: 1 deri ne 5: ");
        int numri = sc.nextInt();

        switch (numri) {
            case 1:
                System.out.println("File");
                break;
            case 2:
                System.out.println("Edit");
                break;
            case 3:
                System.out.println("View");
                break;
            case 4:
                System.out.println("Help");
                break;
            case 5:
                System.out.println("Tools");
                break;
            default:
                System.out.println("Nuk ekziston kjo menu");
                break;
        }
    }
}