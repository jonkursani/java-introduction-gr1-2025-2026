package java_08;

public class CompareStrings {
    public static void main(String[] args) {
        String emri1 = "Joni";
        // String emri2 = "Joni";
        String emri2 = "JonI";

        if (emri1 == emri2) { // a jane te barabarta referencat
            System.out.println("Emrat jane te njejte");
        } else {
            System.out.println("Emrat nuk jane te njejte");
        }

        // tipet komplekse nuk krahasohet me ==
        // tipet komplekse krahasohen me metoden .equals()
        if (emri1.equals(emri2)) { // a jane te barabarta vlerat
            System.out.println("Emrat jane te njejte");
        } else {
            System.out.println("Emrat nuk jane te njejte");
        }

        // emri1 => "joni"
        // emri2 => "joNi"
        if (emri1.toLowerCase().equals(emri2.toLowerCase())) {
            System.out.println("Emrat jane te njejte");
        } else {
            System.out.println("Emrat nuk jane te njejte");
        }

        if (emri1.equalsIgnoreCase(emri2)) {
            System.out.println("Emrat jane te njejte");
        } else {
            System.out.println("Emrat nuk jane te njejte");
        }

        // nese emri1 == emri2 => 0
        // nese emri1 < emri2 => < 0
        // nese emri1 > emri2 => > 0
        if (emri1.compareTo(emri2) == 0) {
            System.out.println("Emrat jane te njejte");
        } else if (emri1.compareTo(emri2) < 0) {
            System.out.println("Emri 1 vjen para emrit 2");
        } else if (emri1.compareTo(emri2) > 0) {
            System.out.println("Emri 2 vjen para emrit 1");
        }
    }
}