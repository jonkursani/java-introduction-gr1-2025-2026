package java_10;

public class PqFor {
    public static void main(String[] args) {
        int f = 0, g = 1;

        for (int i = 0; i <= 10; i++) {
            System.out.println(f); // 0
            f = f + g; // 1
            g = f - g; // 0
        }

        // infinite loop
//        for (int i = 0; i >= 0; i++) {
//            System.out.println(i);
//        }
//
//        for (int i = 0; true; i++) {
//            System.out.println(i);
//        }

        for (int i = 0; i <= 3; i++) {
            System.out.println("i = " + i);

            for (int j = 1; j <= 2; j++) {
                System.out.println(" j = " + j);
            }
        }
    }
}