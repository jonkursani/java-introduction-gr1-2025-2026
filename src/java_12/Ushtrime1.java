//package java_12;
//
//public class Ushtrime1 {
//    public static void main(String[] args) {
//
//    }
//}
void main() {
    printOk();
    print("Hello");
    print("Tekst tjeter");
    zbritja(10, 5);
    System.out.println(deduction(10, 2));
    double rezultati = deduction(10, 3);
    System.out.println(rezultati);
    shtypAlfabetin();
    shtypAlfabetin(true);
    shtypAlfabetin(false);
    System.out.println(prodhimi(5, 5));
}

public void printOk() {
    System.out.println("Ok");
}

public void print(String mesazhi) {
    System.out.println(mesazhi);
}

public void zbritja(double a, double b) {
//    double res = a - b;
//    System.out.println(res);
    System.out.println(a - b);
}

// Krijo metoden deduction() e cila ka dy
// parametra a dhe b te tipit double dhe kthen rezultatin double?
public double deduction(double a, double b) {
    return a - b;
}

// Krijo metoden shtypAlfabetin() e cila shtyp alfabetin e gjuhes angleze?
public void shtypAlfabetin() {
    for (char i = 'A'; i <= 'Z'; i++) {
        System.out.print(i + " ");
    }
    System.out.println();
}

public void shtypAlfabetin(boolean printToLowerCase) {
//    if (printToLowerCase) { // true ose false
//        for (char x = 'a'; x <= 'z'; x++) {
//            System.out.print(x + " ");
//        }
//    } else {
////        for (char x = 'A'; x <= 'Z'; x++) {
////            System.out.print(x + " ");
////        }
//        shtypAlfabetin();
//    }

    for (char i = 'A'; i <= 'Z'; i++) {
        if (printToLowerCase) {
            // "A".toLowerCase() -> "a"
            System.out.print(String.valueOf(i).toLowerCase() + " ");
        } else {
            System.out.print(i + " ");
        }
    }
    System.out.println();
}

public int prodhimi(int a, int b) {
    return a * b;
}







