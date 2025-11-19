package java_06;

public class BooleanLogicalOperators {
    public static void main(String[] args) {
        // Operatoret logjik
        // && (and)
        // || (or)
        // ^ (xor) => exclusive or
        // ! (not)

        boolean a = true;
        boolean b = false;

        System.out.println("a && b " + (a && b)); // false
        System.out.println("a || b " + (a || b)); // true
        System.out.println("a ^ b " + (a ^ b)); // true
        System.out.println("!a = " + !a); // !true => false
    }
}
