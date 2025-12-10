package java_09;

public class ForLoop {
    public static void main(String[] args) {
//        int i;
//        for (i = 1; i <= 10; i++) {
//            System.out.println("i: " + i);
//        }

        for (int i = 10; i >= 1; i--) {
            System.out.println("i: " + i);
        }

        for (int i = 10; i >= 1; i -= 2) {
            System.out.println("i: " + i);
        }

        for (char a = 'A'; a <= 'Z'; a++) {
            System.out.print(a + ",");
        }

        System.out.println();

        String emri = "Arbnor"; // 0 - 5
        // System.out.println(emri.charAt(0));
        // System.out.println(emri.charAt(1));
        for (int i = 0; i < emri.length(); i++) {
            System.out.print(emri.charAt(i) + " ");
        }

        System.out.println();

        // shkronja e fundit emri.length() - 1
        for (int i = emri.length() - 1; i >= 0; i--) {
            System.out.print(emri.charAt(i) + " ");
        }
    }
}
