package java_07;

public class CoinFlip {
    public static void main(String[] args) {
        double random = Math.random(); // 0.0 - 0.99999
        System.out.println("Random: " + random);

        // Menyra 1
//        if (random < 0.5) {
//            System.out.println("Head");
//        } else {
//            System.out.println("Tail");
//        }

        // Menyra 2
//        if (random < 0.5)
//            System.out.println("Head");
//        else
//            System.out.println("Tail");

        // Menyra 3
        String result = (random < 0.5) ? "Head" : "Tail";

        System.out.println(result);
    }
}
