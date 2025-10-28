package java_03;

public class DataTypes {
    public static void main(String[] args) {
        // byte
        // range: -128 -> 127
        // size: 8 bits -> 1 byte
        byte myByte = 120; // deklarimi dhe inicializmi
        System.out.println("Byte: " + myByte);

        // Hapi 1 -> data tipi (tipi i te dhenave)
        // Hapi 2 -> emri i variables
        // Hapi 3 -> vlera qe deshironi me rujt ne variabel

        byte b; // deklarim
        b = 20; // inicializimi
        System.out.println("Byte: " + b);

        // short
        // range: -32768 -> 32767
        // size: 16 bits -> 2 bytes
        short myShort = 10000;
        short vitiAktual = 2025;
        System.out.println("Short: " + myShort);
        System.out.println("Viti aktual: " + vitiAktual);

        // int
        // range: -2^31 -> 2^31
        // size: 32 bits -> 4 bytes
        int myInt = 12345678;
        int numriIPopullsise = 1700000;
        System.out.println("Int: " + myInt);
        System.out.println("Numri i popullsise: " + numriIPopullsise);

        // long
        // range: -2^63 -> 2^63
        // size: 64 bits -> 8 bytes
        // prefix: L per long
        long myLong = 1234567890123456789L;
        // long mosha = 18L; // 64 bit ne memorie edhe pse keni shkrujt nje vlere te vogel
        long distanceToSun = 149600000000L; // 149.600.000.000 m
        System.out.println("Long: " + myLong);
        System.out.println("Distanca deri te dielli: " + distanceToSun);

        // float
        // range: -3.4028235E+38 -> 3.4028235E+38
        // size: 32 bits -> 4 bytes
        // prefix: F per float
        float myFloat = 123456.1234F;
        float price = 12.99F;
        System.out.println("Float: " + myFloat);
        System.out.println("Cmimi: " + price);

        // double
        // range: -1.7976931348623157E+308 -> 1.7976931348623157E+308
        // size: 64 bits -> 8 bytes
        double myDouble = 12345678.12345;
        double pi = 3.141592653589793;
        System.out.println("Double: " + myDouble);
        System.out.println("Pi: " + pi);

        // char
        // range: 0 -> 65535
        // size: 16 bits -> 2 bytes
        char myChar = 'A';
        // char letterA = 65;
        int numriIShkronjesA = myChar;
//        char smiley = '\u263A'; // \u263A -> '☺'
        char smiley = '☺';
        System.out.println("Char: " + myChar);
//        System.out.println("Letter A: " + letterA);
        System.out.println("Numri i shkronjes A: " + numriIShkronjesA);
        System.out.println("Smiley: " + smiley);

        // boolean
        // range: true -> false
        boolean myBoolean = false;
        boolean isStudent = true;
        int piket = 80;
        boolean kaKaluarProvimin = (piket > 50);
        System.out.println("Boolean: " + myBoolean);
        System.out.println("Is student: " + isStudent);
        System.out.println("Ka kaluar provimin: " + kaKaluarProvimin);

        // String literals
        System.out.println("\'Thojza njefishe'"); // per apostrof mundeni mos me perdor
        System.out.println("\"Thojza dyfishe\"");
        System.out.println("\\Backslash\\");
        System.out.println("New \nline");
        System.out.println("\tTab");
        System.out.println("Backspace \btest");
    }
}