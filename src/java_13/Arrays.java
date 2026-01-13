//package java_13;
//
//import java.util.Scanner;
//
//public class Arrays {
//    public static void main(String[] args) {
//        System.out.println();
//        Scanner sc = new Scanner(System.in);
//    }
//}
void main() {
    int numri1 = 1;
    int numri2 = 2;
    int numri3 = 3;

    // Scanner sc = new Scanner(System.in);
    // Array => varg
    int[] numrat; // vargu i tipit int
    // inicializmi ne heap
    // rezervimi i hapesires per ruajtjen e 3 numrave
    // Tipet primitive vlera fillestare (vlera default) 0 => [0, 0, 0]
    // perveq boolean false => [false, false]
    // ndersa tipet primitive vleren default e kane null => [null, null]
    numrat = new int[3];
    byte[] byteArray = new byte[5];
    String[] stringArray = new String[10];
    int a = 5;
    int b = 3;
    int[] c = new int[a + b];

//    Scanner sc = new Scanner(System.in);
//    System.out.print("Shkruaj gjatesine e vargut: ");
//    int gjatesia = sc.nextInt();
//    int[] vargu = new int[gjatesia];

    // Shkrimi i vlerave ne array
    numrat[0] = 1;
    numrat[1] = 2;
    numrat[2] = 3;

    // Leximi (Printimi) i vlerave
    System.out.println("Numri i dyte: " + numrat[1]);
    System.out.println("Numri i elementeve: " + numrat.length);

//    String[] emrat = new String[2];
//    emrat[0] = "Arbnor";
//    emrat[1] = "Filan";
//    String[] emrat = new String[]{"Arbnor", "Erlent"};
    String[] emrat = {"Arbnor", "Erlent", "Jon"};
    System.out.println("Emri i pare: " + emrat[0]);

    for (int i = 0; i < emrat.length; i++) {
//        System.out.printf("%d - %s%n", i, emrat[i]);
        System.out.println(i + " - " + emrat[i]);
    }
}