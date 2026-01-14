void main() {

    int[][] numbers = new int[2][2];
    /*
     * 0   0
     * 0   0
     * */

    // Mbushja e te dhenave
    fillMatrix(numbers);

    // Printimi i matrices
    printMatrix(numbers);

    // Numri i elementeve
//    int nrElements = countElements(numbers);
//    System.out.println("Numri i elementeve te matrices: " + nrElements);
    System.out.println("Numri i elementeve te matrices: " + countElements(numbers));

    // Shuma e elementeve
    System.out.println("Shuma e elementeve: " + sumElements(numbers));

    // Mesatarja
    System.out.println("Mesatarja: " + averageElements(numbers));

//    minElement()
//    maxElement()
//    printDiagonal()
}

public void fillMatrix(int[][] matrix) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            System.out.printf("Shkruani elementin ne poziten [%d][%d]: ", (i + 1), (j + 1));
            matrix[i][j] = sc.nextInt();
        }
    }
}

public void printMatrix(int[][] matrix) {
    for (int[] arr : matrix) {
        for (int element : arr) {
            System.out.print(element + "  ");
        }
        System.out.println();
    }
}

public int countElements(int[][] matrix) {
    int count = 0;

    // matrix.length // sa rreshta
    // me ec neper rreshta edhe me i numru elementet rresht per rreshti

    for (int i = 0; i < matrix.length; i++) {
        count += matrix[i].length;
    }

    return count;
}

public int sumElements(int[][] matrix) {
    int sum = 0;

    for (int[] arr : matrix) {
        for (int el : arr) {
            sum += el;
        }
    }

    return sum;
}

public double averageElements(int[][] matrix) {
    int count = countElements(matrix);
    int sum = sumElements(matrix);
    double avg = (double) sum / count;
    return avg;
}