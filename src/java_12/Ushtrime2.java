void main() {
    printNumbers(5);
    printNumbers(20);
    printNumbers(100);
    printListOfNumbers("723451");
    printListOfNumbers("123654");
    int sum = sumOfNumbers("723451");
    System.out.println(sum);
    System.out.println(sumOfNumbers("123"));
    System.out.println("5! = " + faktorieli(5));
    System.out.println("6! = " + faktorieli(6));
    printMatrix(5, 5, "*");
    printMatrix(5, 10, "#");
    printMatrix(5, 10, "❤️");
    printMatrix(7, 15, "✔️");
}

public void printNumbers(int n) {
    for (int i = 1; i <= n; i++) {
        System.out.print(i + " ");
    }
    System.out.println();
}

// "723451"
public void printListOfNumbers(String numbers) {
    for (int i = 0; i < numbers.length(); i++) {
        System.out.print(numbers.charAt(i) + " ");
    }
    System.out.println();
}

public int sumOfNumbers(String numbers) {
    int sum = 0;
    for (int i = 0; i < numbers.length(); i++) {
        char numberChar = numbers.charAt(i); // '7'
        String numberString = String.valueOf(numberChar); // "7"
        int number = Integer.parseInt(numberString); // 7
//        sum += number;
        sum = sum + number;
    }
    return sum;
}

// 5! = 5 * 4 * 3 * 2 * 1
public int faktorieli(int numri) {
    int fact = 1;
    for (int i = 1; i <= numri; i++) { // 1 * 2 * 3 * 4 * 5
        fact *= i;
    }
    return fact;
}

public void printMatrix(int rreshta, int kolona, String simboli) {
    for (int i = 1; i <= rreshta; i++) {
        for (int j = 1; j <= kolona; j++) {
            System.out.print(simboli);
        }
        System.out.println(); // rreshtin tjeter
    }
}







