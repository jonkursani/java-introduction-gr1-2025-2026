package java_07;

public class TernaryOperator {
    public static void main(String[] args) {
        int x = 10;

        if (x > 0) {
            System.out.println("Numri eshte pozitiv");
            System.out.println("rreshti tjeter");
        } else
            System.out.println("Numri nuk eshte pozitiv");


        // operatori ternar
        // (kushti) ? (true) : (false)
//        String result = (x > 0) ? "Numri eshte pozitiv" : "Numri nuk eshte pozitiv";

//        if (x > 0) {
//            System.out.println("Numri nuk eshte pozitiv");
//        } else {
//            System.out.println("Numri eshte pozitiv");
//        }
        String result = (x > 0) ? "Numri nuk eshte pozitiv" : "Numri eshte pozitiv";
        System.out.println(result);

        if (x > 0) {
            System.out.println("Numri eshte pozitiv");
        } else if (x < 0) {
            System.out.println("Numri eshte negativ");
        } else {
            System.out.println("Numri eshte 0");
        }

        String result2 = (x > 0) ? "Numri eshte pozitiv" : (x < 0) ? "Numri eshte negativ" : "Numri eshte 0";

        System.out.println(result2);
    }
}