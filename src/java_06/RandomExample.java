package java_06;

import java.util.Scanner;

public class RandomExample {
    public static void main(String[] args) {
        Scanner skaneri = new Scanner(System.in);
        System.out.print("Shkruani rangun deri ku deshironi te gjeneroni nje numer random: ");
        // int rangu = skaneri.nextInt();
        // Konvertimi tu i perdor wrapper klasat
//        String ranguText = skaneri.nextLine(); // "5"
//        int rangu = Integer.parseInt(ranguText); // 5
        int rangu = Integer.parseInt(skaneri.nextLine()); // "5" => 5
        // int random = Math.random();
        double random = Math.random(); // 0.0 <= random < 1.0
        System.out.println("Random = " + random);
        System.out.println("Random * rangu = " + (random * rangu));
        int vleraRandom = (int) (random * rangu);
        System.out.println("Vlera random = " + vleraRandom);
    }
}