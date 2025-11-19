package java_06;

public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5; // 0101
        int b = 3; // 0011

        // unary not
        // 0101
        //    1
        // 0110 => 6

        System.out.println("a | b = " + (a | b)); // 0111 => 7
        System.out.println("a & b = " + (a & b)); // 0001 => 1
        System.out.println("a ^ b = " + (a ^ b)); // 0110 => 6
        System.out.println("~a = " + ~a); // -(a+1) => -(6) => -6
    }
}