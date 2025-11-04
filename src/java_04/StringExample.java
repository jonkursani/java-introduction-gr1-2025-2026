package java_04;

public class StringExample {
    public static void main(String[] args) {
        String numri7 = "7"; // tekst
        int numri2 = 2; // numer
        System.out.println("72?: " + (numri7 + numri2)); // 72, jo 7 + 2 = 9

        // String nuk eshte tip primitiv eshte tip komplex (klase)
        char A = 'A';
        char B = 'B';
        String AB = "AB";

        String text = "Ky eshte nje text";
//        System.out.printf("Numri i shkronjave ne kete tekst eshte '%s': %d", text, text.length());
        System.out.println("Gjatesia e tekstit: " + text.length());
        System.out.println("Shkronja e pare e tekstit eshte: " + text.charAt(0));
        System.out.println("Shkronja e fundit e tekstit eshte: " + text.charAt(16));
        // nese don me gjet shkronjen e fundit duhe me e bo index - 1
        int gjatesiaETekstit = text.length(); // 17
        int indeksiIShkronjesSeFundit = gjatesiaETekstit - 1; // indeksi eshte prej 0 - 16
        System.out.println("Shkronja e fundit e tekstit eshte: " + text.charAt(indeksiIShkronjesSeFundit));
    }
}