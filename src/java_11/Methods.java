package java_11;

public class Methods {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        sc.nextInt();

        // nese metoda nuk eshte statike nuk mundeni me iu
        // qas pa kriju objekt te asaj klase qe i takon metodat
//        Methods obj1 = new Methods();
//        obj1.printFullName();

        // static ne nivel te njejte me klasen nuk ka nevoj me kriju objekt
        // metoda void (boshe) nuk kthejne vlera
        printFullName();
        printName("Filan");
        printName("Erlent");
        // Method overloading - metoda e emer te njejte numer te ndryshem te parametrave
        printFullName("Filan", "Fisteku");
        printFullName("Filan", "Filane", "Fisteku");
        System.out.println(1);
        System.out.println("Filan");
        System.out.println('A');
        System.out.println(1.2);
        System.out.println(1.2f);
        printFullName("Filan", 22, "Fisteku");
//        printFullName("Filan", "FullName", 20); => gabim ka rendesi rradhitja e parametrave

        // Metodat qe kthejne vlera
        String name = getName();
        System.out.println(name);
        System.out.println(getName("Filane"));
        int shuma = sum(1, 2);
        System.out.println(shuma);
        System.out.println(sum(1, 2, 3));
        System.out.println(divide(7, 2));

        int mosha = 20;
        if (isAgeGreaterThan18OrLessThan65(mosha)) { // true ose false
            System.out.println("Nuk ju lejohet hyrja");
        } else {
            System.out.println("Ju lejohet hyrja");
        }
//        checkAge(mosha);
        System.out.println(isAgeGreaterThan18OrLessThan65(15));
    }

//    public void printFullName() {
//        System.out.println("Filan Fisteku");
//    }
    public static void printFullName() {
        System.out.println("Filan Fisteku");
    }

    public static void printName(String emri) {
        System.out.println("Hello, " + emri);
    }

    public static void printFullName(String emri, String mbiemri) {
        System.out.println(emri + " " + mbiemri);
    }

    public static void printFullName(String emri, String emriMesem, String mbiemri) {
        System.out.println(emri + " " + emriMesem + " " + mbiemri);
    }

    public static void printFullName(String emri, int mosha, String mbiemri) {
        System.out.println(emri + " " + mbiemri + " " + mosha);
    }

    // Metoda qe kthejne dicka
    public static String getName() {
        return "Hello, Filan";
    }

    public static String getName(String name) {
        return "Hello, " + name;
    }

    public static int sum(int x, int y) {
//        int sum = x + y;
//        return sum;
        return x + y;
    }

    public static int sum(int x, int y, int z) {
        return x + y + z;
    }

    public static double divide(double numri1, double numri2) {
        return numri1 / numri2;
    }

//    public static void checkAge(int age) {
//        if (age < 18) {
//            System.out.println("Nuk ju lejohet hyrja");
//        } else {
//            System.out.println("Ju lejohet hyrja");
//        }
//    }

    public static boolean isAgeGreaterThan18OrLessThan65(int age) {
//        if (age < 18 || age > 65) {
//            return true;
//        } else {
//            return false;
//        }

//        return (age < 18 || age > 65) ? true : false;
        return age < 18 || age > 65; // true ose false
    }
}