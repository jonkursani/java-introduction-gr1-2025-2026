package java_06;

public class RelationalOperators {
    public static void main(String[] args) {
        // Operatoret relacional
        // outputi i tyre eshte gjithmone nje vlere boolean (true ose false)
        int a = 5;
        int b = 3;

        System.out.println("5 == 3: " + (a == b)); // false
        System.out.println("5 != 3: " + (a != b)); // true
        System.out.println("5 > 3: " + (a > b)); // true
        System.out.println("5 < 3: " + (a < b)); // false
        System.out.println("5 >= 3: " + (a >= b)); // true
        System.out.println("3 >= 3: " + (3 >= 3)); // true
        System.out.println("3 > 3: " + (3 > 3)); // false
        System.out.println("5 <= 3: " + (5 <= 3)); // false

        int i = 1;
        while (i <= 10) {
            System.out.println("i: " + i);
            // i = i + 1;
            // i += 1;
            i++;
        }
        // System.out.println("i: " + i);
    }
}