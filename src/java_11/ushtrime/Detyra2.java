void main() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Shkruani numrin e rreshtave: ");
    int rreshtat = sc.nextInt();

    // po i printojme rreshtat
    for (int i = 1; i <= rreshtat; i++) {
        // 123...
        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }

        // 321...
//        for (int j = i; j >= 1; j--) {
        for (int j = i - 1; j >= 1; j--) {
            System.out.print(j);
        }

        System.out.println();
    }
}