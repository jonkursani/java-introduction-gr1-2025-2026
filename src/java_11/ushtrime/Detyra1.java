//package java_11.ushtrime;
//
//public class Detyra1 {
//    public static void main(String[] args) {
//
//    }
//}
void main() {
    Scanner sc = new Scanner(System.in);

    String fullName;
    do {
        System.out.print("Shkruani emrin dhe mbiemrin: ");
        fullName = sc.nextLine();
    } while (fullName.isBlank());

    for (int i = 0; i < fullName.length(); i++) {
//        char shkronja = fullName.charAt(i);
//        System.out.println(shkronja);
        System.out.println(fullName.toUpperCase().charAt(i));
    }

    System.out.println();

    for (int i = fullName.length() - 1; i >= 0; i--) {
        System.out.println(fullName.toUpperCase().charAt(i));
    }
}