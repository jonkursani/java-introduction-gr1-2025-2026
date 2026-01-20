void main() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Shkruani numrin e rreshtave: ");
    int r = sc.nextInt();

    System.out.print("Shkruani numrin e kolonave: ");
    int k = sc.nextInt();

    int[][] matrix = new int[r][k];

    /*
     * 0, 0, 0
     * 0, 0, 0
     * */

    // Mbushja e matrices
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            matrix[i][j] = (int) (Math.random() * 10001); // 10000.9999 => 0 - 10000
        }
    }

    System.out.println("For");
    // Printimi i elementeve
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            System.out.print(matrix[i][j] + "  ");
        }
        System.out.println();
    }

    System.out.println("Enhanced for");
    // enhanced for ose foreach
    for (int[] rreshti : matrix) {
        for (int nr : rreshti) {
            System.out.print(nr + "  ");
        }
        System.out.println();
    }
}