package java_06;

public class MathExample {
    public static void main(String[] args) {
        double x = 5;
        double y = 2;

        System.out.println("abs = " + Math.abs(x)); // |-5| => 5
        System.out.println("max = " + Math.max(x, y));
        System.out.println("min = " + Math.min(x, y));
        System.out.println("pow = " + Math.pow(x, y)); // 5^2 => 25
        System.out.println("sqrt = " + Math.sqrt(Math.pow(x, y))); // sqrt(25) => 5
        System.out.println("ceil = " + Math.ceil(5.3)); // 5.3 => 6
        System.out.println("down = " + Math.floor(5.3)); // 5.3 => 5
        System.out.println("round = " + Math.round(5.3)); // 5.3 => 5
        System.out.println("round = " + Math.round(5.6)); // 5.6 => 6
        System.out.println("PI = " + Math.PI);
        System.out.println("E = " + Math.E);
        System.out.println("random = " + Math.random());
    }
}