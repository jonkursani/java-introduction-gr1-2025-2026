package java_11;

public class JumpStatements {
    public static void main(String[] args) {
        // break - terminon ekzekutimin
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break; // nale ekzekutimin
            }

            System.out.print(i + " ");
        }

        System.out.println();

        int i = 1;
        while (i <= 10) {
            if (i == 6) {
                break;
            }

            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        // continue - e bon skip pjesen ma posht qe ka mu ekzekutu
        for (int j = 1; j <= 10; j++) {
            if (j == 6 || j == 8) {
                continue;
            }

            System.out.print(j + " ");
        }

        System.out.println();

        int x = 1;
        do {
            if (x == 6 || x == 8) {
                continue;
            }
            System.out.print(x + " ");
            // x++;
        } while (++x <= 10);
    }
}