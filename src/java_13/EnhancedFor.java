void main() {
//    int[] numrat = new int[3];
//    numrat[0] = 1;

    int[] numrat = {1, 2, 3}; // new int[3]

    for (int i = 0; i < numrat.length; i++) {
        System.out.print(numrat[i] + " ");
    }

    System.out.println();

    for (int numri : numrat) {
        System.out.print(numri + " ");
    }
    System.out.println();

    String[] emrat = {"Ari", "Arbnor"};

    for (String emri : emrat) {
        System.out.print(emri + " ");
    }
    System.out.println();

    int sum = 0;
    for (int nr : numrat) {
//        sum = sum + nr;
        sum += nr;
    }
    System.out.println("Shuma = " + sum);
}