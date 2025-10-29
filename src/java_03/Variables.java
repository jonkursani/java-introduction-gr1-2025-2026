package java_03;

public class Variables {
    // maina => shkurtesa per metoden main()
    public static void main(String[] args) {
        // type => short, long, byte, char, boolean
        // identifier => emri i variables
        // (opcionale) mundemi me inicializu direkt tu e perdor "=" => asignment operatori edhe tu ja dhon vleren
        // psh: int x = 10; => deklarim dhe inicializim
        // psh: int x; => deklarim
        // psh: x = 10; => inicializim

        int x = 10;
        System.out.println("Vlera e x: " + x);

        // nese keni disa variabla qe i kane tipet e njejta mundemi me i deklaru edhe inicializu me ni rresht;
//        int y;
//        int z;
//        int c;
        int y, z, c = 40, v = 25; // deklarimi i tri variablave te tipit int me emrat y, z, c
        y = 20;
        z = 30;
//        c = 40;

        int a = v + z; // a = 25 + 30 => a = 55

        // Variable scope => jetegjatesia e variables
        // { } // klase ose metode

        System.out.println("Vlera e a jashte scope te if: " + a);
        if (a > 10) {
            a = 20;
            int n = 50;
            x = n;
            System.out.println("Vlera e a brenda scope te if: " + a);
            System.out.println("Vlera e n brenda scope te if: " + n);
        }

        // System.out.println("Vlera e n: " + n); // variabla n nuk ekziston jashte if-it
        System.out.println("Vlera e a jashte scope te if-it: " + a);
        System.out.println("Vlera e x jashte scope te if-it: " + x);

        // Konstantet => final
        final double PI = 3.14159;
        final short WEEK_DAYS;
        WEEK_DAYS = 7;

        // WEEK_DAYS = 8; => error smundesh me inicializu perseri konstanten
        System.out.println("PI: " + PI);
        System.out.println("WEEK_DAYS: " + WEEK_DAYS);

    }

     // variabla a nuk ekziston jashte main
}
