package java_04.ushtrime;

import java.util.Scanner;

public class EkipiFutbollit {
    public static void main(String[] args) {
        Scanner skaneri = new Scanner(System.in);

        System.out.print("Shkruani ekipit tuaj te preferuar: ");
        String ekipiPreferuar = skaneri.nextLine();
        System.out.println("Ju keni zgjedhur: " + ekipiPreferuar);
    }
}