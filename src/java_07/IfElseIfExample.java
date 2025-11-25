package java_07;

public class IfElseIfExample {
    public static void main(String[] args) {
        // int x = 10;
        // int x = -5;
        int x = 0;

//        if (x > 0) {
//            System.out.println("Numri eshte pozitiv");
//        }
//
//        if (x < 0) {
//            System.out.println("Numri eshte negativ");
//        }
//
//        if (x == 0) {
//            System.out.println("Numri eshte 0");
//        }

        if (x > 0) {
            System.out.println("Numri eshte pozitiv");
        } else if (x < 0) {
            System.out.println("Numri eshte negativ");
        } else {
            System.out.println("Numri eshte 0");
        }

        // !!! GABIM else qendron gjithmone ne fund
        // if () {
        // } else {
        // } else if () {
        // }

        // !!! GABIM else if nuk qendron para if-it
        // else if() {
        // } if () {
        // }
    }
}