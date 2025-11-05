package java_04;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // System.in i tregon qe jemi tu dasht me lexu prej tastieres
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Shkruani nje tekst");
//        // lexoje tekstin qe e kemi shkru tu e perdor metoden nextLine() dhe ruaje te variabla userInput
//        String userInput = scanner.nextLine();
//        System.out.println("Ju keni shkruar: " + userInput);

//        while (true) {
//            System.out.println("Shkruani nje tekst");
//            String input = scanner.nextLine();
//            System.out.println("Ju keni shkruar: " + input);
//
//            if (input.equals("ndalo")) {
//                break;
//            }
//        }

//        System.out.println("Shkruani emrin: ");
        System.out.print("Shkruani emrin: ");
        String emri = scanner.nextLine(); // String

        System.out.print("Shkruani mbiemrin: ");
        String mbiemri = scanner.nextLine(); // String

        System.out.print("Shkruani moshen: ");
        int mosha = scanner.nextInt(); // int

        System.out.print("Shkruani gjatesine: ");
        float gjatesia = scanner.nextFloat(); // float

        System.out.print("A jeni student?: (true/false): ");
        boolean student = scanner.nextBoolean(); // boolean

        System.out.println("========= Studenti =========");
        System.out.println("Emri: " + emri);
        System.out.println("Mbiemri: " + mbiemri);
        System.out.println("Mosha: " + mosha);
        System.out.println("Gjatesia: " + gjatesia);
        System.out.println("Student: " + student);
    }
}