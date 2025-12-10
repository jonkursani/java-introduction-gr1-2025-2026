package java_09;

import java.util.Scanner;

public class StringAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani nje tekst: ");
        String teksti = sc.nextLine();

        // kontrolloni nese useri ka shkruar tekstin
        // if (teksti.trim().isEmpty()) { // true ose false
        if (teksti.isBlank()) { // true ose false
            System.out.println("Ju nuk keni shkruar asnje tekst");
        } else {
            // a)
            int gjatesiaETekstit = teksti.length();

            System.out.println("Numri i shkronjave ne kete tekst eshte: " + gjatesiaETekstit);

            // b)
            System.out.printf("Shkruaj indeksin nga 0 deri ne %d: ", gjatesiaETekstit);
            int index = sc.nextInt();

            if (index > gjatesiaETekstit) {
                System.out.printf("Indeksi i lejuar eshte prej 0 deri ne %d", gjatesiaETekstit);
            } else {
                System.out.println(teksti.substring(index));
            }

            // c)
            System.out.printf("Shkruaj indeksin nga %d deri ne %d: ", index, gjatesiaETekstit);
            int indeksiIMbarimit = sc.nextInt();
            sc.nextLine(); // lexohet enter ne tastiere

            if (indeksiIMbarimit > gjatesiaETekstit) {
                System.out.printf("Indeksi i lejuar eshte prej %d deri ne %d", index, gjatesiaETekstit);
            } else {
                System.out.println(teksti.substring(index, indeksiIMbarimit)); // prej index deri ne indeksiIMbarimit - 1
            }

            // d)
            System.out.print("Shkruaj fjalen qe po kerkoni: ");
            String fjalaEKerkuar = sc.nextLine();

            if (teksti.toLowerCase().contains(fjalaEKerkuar.toLowerCase())) {
                System.out.printf("Fjala e kerkuar '%s' u gjet%n", fjalaEKerkuar);
            } else {
                System.out.printf("Fjala e kerkuar '%s' nuk u gjet%n", fjalaEKerkuar);
            }

            // e)
            System.out.print("Shkruaj fjalen qe po kerkoni ta zevendesoni: ");
            String fjalaPerZevendesim = sc.nextLine();

            if (teksti.toLowerCase().contains(fjalaPerZevendesim.toLowerCase())) {
                System.out.print("Shkruaj fjalen zevendesuese: ");
                String fjalaZevendesuese = sc.nextLine();
                System.out.println(teksti.replace(fjalaPerZevendesim, fjalaZevendesuese));
            } else {
                System.out.printf("Fjala e kerkuar per zevendesim '%s' nuk u gjet", fjalaPerZevendesim);
            }
        }
    }
}