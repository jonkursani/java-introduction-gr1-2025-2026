package java_06;

public class CompoundAssignment {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;

        a += 5; // a = a + 5 => 6
        b *= 4; // b = b * 4 => 8
        c += a * b; // c = c + a * b => 51
        c %= 6; // c = c % 6 => 8 * 6 = 48 => 51 - 48 => 3

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        // Increment a++ ose ++a => a = a + 1
        System.out.println("a = " + a); // 6
        // post increment e rrit vleren ne rreshtin e ri
        // maspari e printon mandej e rrit vleren
        System.out.println("a++ " + a++); // 6
        System.out.println("a = " + a); // 7
        // pre increment e rrit vleren edhe e printon ne rreshtin e njejte
        System.out.println("++a " + ++a); // 8
        System.out.println("a = " + a); // 8

        // decrement a-- ose --a => a = a - 1
        System.out.println("c = " + c); // 3
        // post decrement e zvoglon vleren
        // vlera e vendoset ne rreshtin e ri
        System.out.println("c-- " + c--); // 3
        System.out.println("c = " + c); // 2
        // pre decrement e zvogelon edhe e printon ne te njejtin rresht
        System.out.println("--c " + --c); // 1
        System.out.println("c = " + c); // 1

        // Assignment operator
        int x, y, z;

        x = 100;
        y = 100;
        z = 100;

        z = 100;
        y = z;
        x = y;

        x = y = z = 100;
    }
}