package java_07;

public class CompareDouble {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        double c = a + b; // 0.3
        double d = 0.3;
        double toleranca = 0.0000001;

        if (c == d) {
            System.out.println("c eshte e barabarte me d");
        } else {
            System.out.println("c nuk eshte e barabrte me d");
        }

        if (Math.abs(c - d) < toleranca) {
            System.out.println("c eshte e barabarte me d");
        } else {
            System.out.println("c nuk eshte e barabarte me d");
        }
    }
}