package java_05;

public class ConvertCastExample {
    public static void main(String[] args) {
        // Konvertimi implicit ose automatik
        // Konvertimi eksplicit ose manual

        // Konvertimi implicit
        byte a = 100; // byte => 100
        int b = a; // int => 100
        System.out.println("B = " + b); // B = 100

        // Konvertimi eksplicit
        // Wrapper klasat, per cdo tip primitiv e keni nga nje wrapper klase
        byte c = 123;
//        String cText = c + ""; // "123"
        String cText = String.valueOf(c); // "123"
        byte cByte = Byte.parseByte(cText); // 123
        int cInt = Integer.parseInt(cText); // 123
        double cDouble = Double.parseDouble(cText); // 123.0

        // Kastimi - Casting
        // DataType emri = (DataType) emri;
        // int d = 2.7654; // nuk na lejon me inicializu sepse eshte double
        // parseInt("") kerkon tekst si parameter;
        int d = (int) 2.764; // 2
    }
}