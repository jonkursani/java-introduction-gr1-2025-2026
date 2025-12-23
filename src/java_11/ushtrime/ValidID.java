void main() {
    Scanner sc = new Scanner(System.in);

    String id = ""; // "KS1234"
    do {
        System.out.print("Shkruani ID (7 - shifra, KSXXXXX): ");
        id = sc.nextLine();
    } while (id.trim().length() != 7 || !id.startsWith("KS"));

    System.out.println("ID juaj: " + id);
}