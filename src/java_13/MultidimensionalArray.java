void main() {
    // int[] numbers = new int[3]; // [0, 0, 0]
//    int[] numbers = {1, 2, 3};

    // Matrica

    // new int[rreshtat][kolonat]
    int[][] numbers = new int[2][3];
    // [
    //      0, 0, 0
    //      0, 0, 0
    // ]

    // Shkrimi ne array
    numbers[1][1] = 3;
    numbers[0][2] = 1;

    // Leximi i vlerave
    System.out.println("Elementi ne poziten [1][1]: " + numbers[1][1]);

    int[][] otherNumbers = {
            {1, 2},
            {3, 4},
            {5, 6}
    }; // new int[3][2]
    System.out.println(otherNumbers[1][1]);

    // Jagged Array
    int[][] jaggedArray = new int[3][];
    jaggedArray[0] = new int[4];
    jaggedArray[1] = new int[2];
    jaggedArray[2] = new int[3];
    /*
    * 0, 0, 0, 0
    * 0, 0
    * 0, 0, 0
    * */

    int[][] otherJaggedArray = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8}
    };


    // Printimi i elementeve
    for (int i = 0; i < otherNumbers.length; i++) {
        for (int j = 0; j < otherNumbers[i].length; j++) {
            System.out.printf("[%d][%d]: %d ", i, j, otherNumbers[i][j]);
        }
        System.out.println();
    }

    for (int[] arr : otherNumbers) { // rreshtat
        for (int num : arr) { // kolonat
            System.out.print(num + " ");
        }
        System.out.println();
    }
}