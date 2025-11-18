package java_06.ushtrime;

import java.util.Scanner;

public class Detyra {
    public static void main(String[] args) {
        // Lexoni dy numra si text
        // Parsoni ne int
        // Gjeni shumen
        // Printoni shumen
        Scanner skaneri = new Scanner(System.in);
        System.out.print("Shkruani numrin e pare: ");
        String nrPareText = skaneri.nextLine();
        int nrPare = Integer.parseInt(nrPareText);
        System.out.print("Shkruani numrin e dyte: ");
        int nrDyte = Integer.parseInt(skaneri.nextLine());
        int shuma = nrPare + nrDyte;
        System.out.println("Shuma = " + shuma);
    }
}