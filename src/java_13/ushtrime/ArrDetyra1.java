void main() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Shkruani numrin e elementeve: ");
    int nrElements = sc.nextInt();

    int[] numbers = new int[nrElements];
    System.out.println("Numri i elementeve: " + numbers.length);

    // Mbushja e vargut me te dhena prej userit
    for (int i = 0; i < numbers.length; i++) {
        System.out.printf("Shkruani elementin %d: ", (i + 1));
        numbers[i] = sc.nextInt();
    }

    // Printimi i vargut me enhanced for
    for (int nr : numbers) {
        System.out.print(nr + " ");
    }
}