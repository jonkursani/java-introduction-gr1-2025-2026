package java_08;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani nje dite te javes 1-7: ");
        int ditaEJaves = sc.nextInt();

//        if (ditaEJaves == 1) {
//            System.out.println("E hane");
//        } else if (ditaEJaves == 2) {
//            System.out.println("E marte");
//        } else {
//            System.out.println("Nuk ekzsiton kjo dite e javes");
//        }

        switch (ditaEJaves) {
            case 1: // ditaEJaves == 1 => 2 == 1
                System.out.println("E hane");
                break;
            case 2:
                System.out.println("E marte");
                break;
            case 3:
                System.out.println("E merkure");
                break;
            case 4:
                System.out.println("E enjte");
                break;
            case 5:
                System.out.println("E premte");
                break;
            case 6:
                System.out.println("E shtune");
                break;
            case 7:
                System.out.println("E diel");
                break;
            default:
                System.out.println("Nuk ekzsiton kjo dite e javes");
                break;
        }

        // enhanced switch
        switch (ditaEJaves) {
            // case 1:
            case 1 -> {
                System.out.println("E hane");
                System.out.println("Rreshti tjeter");
            }
            case 2 -> System.out.println("E marte");
            case 3 -> System.out.println("E merkure");
            case 4 -> System.out.println("E enjte");
            case 5 -> System.out.println("E premte");
            case 6 -> System.out.println("E shtune");
            case 7 -> System.out.println("E diel");
            default -> System.out.println("Nuk ekzsiton kjo dite e javes");
        }

        int x = 2;

        switch (x) {
//            case 1: // nese osht 1 ose 2
//            case 2:
            case 1, 2:
                System.out.println(x);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("Nuk ekziston kjo vlere");
                break;
        }

        switch (x) {
            case 1, 2 -> System.out.println(x);
            case 3 -> System.out.println(3);
            default -> System.out.println("Nuk ekziston kjo vlere");
        }

        // krahasimi me string
        String menu = "Admin";

        switch (menu) {
            case "Admin":
                System.out.println("Keni klikuar tabin admin");
                break;
            case "Produktet":
                System.out.println("Keni klikuar tabin produktet");
                break;
            case "Kategorite":
                System.out.println("Keni klikuar tabin kategorite");
                break;
            default:
                System.out.println("Nuk ekziston kjo menu");
                break;
        }

        switch (menu.toLowerCase()) {
            case "admin" -> System.out.println("Keni klikuar tabin admin");
            case "produktet" -> System.out.println("Keni klikuar tabin produktet");
            case "kategorite" -> System.out.println("Keni klikuar tabin kategorite");
            default -> System.out.println("Nuk ekziston kjo menu");
        }
    }
}