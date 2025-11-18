package java_06;

import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ky apkikacion ben nderrimin e vendeve te dy numrave");

        System.out.print("Shkruani numrin e pare: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("Shkruani numrin e dyte: ");
        int b = Integer.parseInt(sc.nextLine());

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}