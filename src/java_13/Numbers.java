void main() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Shkruani gjatesine e vargut: ");
    int gjatesia = sc.nextInt();

    int[] numrat = new int[gjatesia];

    // Mbushja e vargut me numra random prej 0 - 100
    for (int i = 0; i < numrat.length; i++) {
        numrat[i] = (int) (Math.random() * 101); // (int) 100.99999 = 100
    }

    // Printimi prej fillimit deri ne fund
    for (int i = 0; i < numrat.length; i++) {
        if (numrat[i] == 10) {
            System.out.println("E gjeta 10shin");
        }
        System.out.print(numrat[i] + " ");
    }

    System.out.println();

    // Printimi prej fundit ne fillim
    for (int i = numrat.length - 1; i >= 0; i--) {
        System.out.print(numrat[i] + " ");
    }

    // Gjetja e shumes se elementeve
}