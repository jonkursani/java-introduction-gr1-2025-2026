package java_10.ushtrime;

public class Detyra8 {
    public static void main(String[] args) {
        // Palindrom
        String fjala = "kimiki";

        String fjalaRe = "";

        for (int i = fjala.length() - 1; i >= 0; i--) {
//            fjalaRe = fjalaRe + fjala.charAt(i);
            System.out.print(fjala.charAt(i) + " ");
            fjalaRe += fjala.charAt(i); // "kimik"
        }

        System.out.println();

        // i k i m i k != k i m i k
        if (fjala.equalsIgnoreCase(fjalaRe)) {
            System.out.println("Fjala eshte palindrom");
        } else {
            System.out.println("Fjala nuk eshte palindrom");
        }
    }
}