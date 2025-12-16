package java_09;

import java.util.Scanner;

public class StringAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani nje tekst: ");
        String teksti = sc.nextLine();

        // if (teksti.trim().isEmpty()) {
        if (teksti.isBlank()) {
            System.out.println("Ju nuk keni shkruar asnje tekst");
        } else {
            // a)
            System.out.println("Numri i karaktereve qe i permban ky tekst eshte: " + teksti.length());

            int indeksiIFundit = teksti.length() - 1;
            // b)
            System.out.printf("Shkruani indeksin prej 0 deri ne %d: ", indeksiIFundit);
            int indeksi = sc.nextInt();

            if (indeksi > indeksiIFundit) {
                System.out.printf("Indeksi i lejuar eshte prej 0 deri ne %d%n", indeksiIFundit);
                return;
            } else {
                System.out.println(teksti.substring(indeksi));
            }

            // c)
            System.out.printf("Shkruani indeksin prej %d deri ne %d: ", indeksi, indeksiIFundit);
            int indeksiIMbarimit = sc.nextInt(); // Integer.parseInt(sc.nextLine()) // "1"
            sc.nextLine(); // enter nuk e lexojke nextInt()

            if (indeksiIMbarimit > indeksiIFundit || indeksiIMbarimit < indeksi) {
                System.out.printf("Indeksi i lejuar eshte prej %d deri ne %d%n", indeksi, indeksiIFundit);
            } else {
                System.out.println(teksti.substring(indeksi, indeksiIMbarimit + 1)); // 0 - indeksiIMbarimit - 1
            }

            // d)
            System.out.print("Shkruani fjalen qe po kerkoni: ");
            String fjalaEKerkuar = sc.nextLine();

            if (teksti.toLowerCase().contains(fjalaEKerkuar.toLowerCase())) {
                System.out.printf("Fjala e kerkuar '%s' u gjet%n", fjalaEKerkuar);
            } else {
                System.out.printf("Fjala e kerkuar '%s' nuk u gjet%n", fjalaEKerkuar);
            }

            // e)
            System.out.print("Shkruani fjalen qe kerkoni ta zevendesoni: ");
            String fjalaPerZevendesim = sc.nextLine();

            if (teksti.toLowerCase().contains(fjalaPerZevendesim.toLowerCase())) {
                System.out.print("Shkruani fjalen per zevendesim: ");
                String fjalaZevendesuese = sc.nextLine();
                System.out.println(teksti.replace(fjalaPerZevendesim, fjalaZevendesuese));
            } else {
                System.out.printf("Fjala e kerkuar '%s' nuk u gjet%n", fjalaEKerkuar);
            }
        }
    }
}