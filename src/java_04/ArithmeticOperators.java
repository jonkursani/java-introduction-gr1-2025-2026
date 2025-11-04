package java_04;

public class ArithmeticOperators {
    public static void main(String[] args) {
//        double x = 10.0;
//        double y = 4.0;

        double x = 10.0, y = 4.0;
        double shuma = x + y;
        double zbritja = x - y;
        double prodhimi = x * y;
        double heresi = x / y;
        double mbetja = x % y;
        System.out.println("Mbledhja: " + shuma); // 14.0   "Mbledhja" + 14.0
        System.out.println("Zbritja: " + zbritja); // 6.0
        System.out.println("Prodhimi: " + prodhimi); // 40.0
        System.out.println("Heresi: " + heresi); // 2.5
        System.out.println("Mbetja: " + mbetja); // 2.0 => 2 * 4 = 8 => mbetja eshte 2
    }
}