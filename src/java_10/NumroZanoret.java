package java_10;

import java.util.Scanner;

public class NumroZanoret {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fjalia;
        do {
            System.out.print("Shkruani nje fjali: ");
            fjalia = sc.nextLine();
        } while (fjalia.isBlank());

        final String ZANORET = "aeiouy";
        final String SHENJAT = "!?&%$.,;#";

        int numriIZanoreve = 0, numriIShenjave = 0, numriIBashktingelloreve = 0;

        for (int i = 0; i < fjalia.length(); i++) {
            char simboli = fjalia.toLowerCase().charAt(i);
            String simboliString = simboli + "";
//            String shkronjaString = String.valueOf(shkronja);

            if (ZANORET.contains(simboliString)) {
                numriIZanoreve++;
            } else if (simboli >= 'a' && simboli <= 'z') {
                numriIBashktingelloreve++;
            } else if (SHENJAT.contains(simboliString)) {
                numriIShenjave++;
            }
        }

        System.out.println("Numri i zanoreve: " + numriIZanoreve);
        System.out.println("Numri i shenjave: " + numriIShenjave);
        System.out.println("Numri i bashktingelloreve: " + numriIBashktingelloreve);
    }
}