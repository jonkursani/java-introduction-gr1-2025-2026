package java_02;

public class Main {
    public static void main(String[] args) {
        // Single line
        /*
         * Multi line
         * */

        // White spaces
//        System.out.println("Whitespaces");System.out.println("Tekst tjeter");System.out.println("Tekst tjeter");
        System.out.println("Hello from Java");
        System.out.println("Tekst tjeter");

        // Shkurtesat
        // ctrl + alt + l => formatimin e kodit
        // ctrl + / => komentoni komplet rreshtin
        // sout => System.out.println()


        // println()
        System.out.println("Hello from Java"); // new line => dil ne rreshtin e ri
        System.out.println("Kursori ne rreshtin e ri");

        // print()
        System.out.print("This is a print method");
        System.out.print("Kursori ne rreshtin e njejte");
        System.out.println("Rreshti i njejte");
        System.out.println("Rreshti i ri");

        // printf()
        String emri = "Filane";
        int mosha = 18;
        System.out.println("Une quhem Jon dhe jam 20 vjet");
        System.out.println("Une quhem " + emri + " dhe jam " + mosha + " vjet");
        // souf => shkurtesa per printf()
        // kursori mbetet ne rreshtin e njejte ngjajshem me metoden print() prandaj duhet me perdor %n
        System.out.printf("Une quhem %s dhe jam %d vjet.%n", emri, mosha);
        System.out.println("Tekst");

        // Formatimi i tekstit %s, %S => tekstin ne shkronja te mdhaja
        System.out.printf("Hello, %s.%n", "Alice");
        System.out.printf("Hello, %S.%n", "John");

        // Formatimi i numrave te plote %d
        System.out.printf("The number is: %d.%n", 42);
        System.out.printf("The number is: %5d.%n", 45); // minimum 5 numra, vlerat e mbetura i mbush me hapesira
        System.out.printf("The number is: %5d.%n", 453132131); // minimum 5 numra
        System.out.printf("The number is: %05d.%n", 45); // min 5 numra, vlerat e mbetura i mbush me 0
        System.out.printf("The number is: %,d.%n", 1000000);

        // Formatimi i numrave me presje %f
        System.out.printf("The number is: %f.%n", 3.14159);
        System.out.printf("The number is: %.2f.%n", 3.14159);

        // Formatimi i teksteve
        System.out.printf("|%10s|%n", "Java"); // min 10 karaktere nese nuk i kemi 10 tekstin e shtyn ne anen e djatht
        System.out.printf("|%-10s|%n", "Python"); // min 10 karaktere nese nuk i kemi 10 tekstin e shtyn ne anen e majt

        // Char => 'c', String => "Java"
        System.out.printf("Laptop price is: 250.00%s%n", "$");
        System.out.printf("Laptop price is: 250.00%c%n", '$');

        // Kombimin i placholderave te ndryshem
        System.out.printf("Une quhem %s %S dhe jam %d vjecar.%n", "Filan", "Fisteku", 20);

        // Vlera true false => e vertete e pavertete => 1, 0
        System.out.printf("A jam student: %b%n", true);
        System.out.printf("A jam student: %B%n", false);

        System.out.printf("Produkti: %s | Sasia: %d | Cmimi: %.2f%n", "Iphone 17 Pro Max", 1, 1200.5);
    }
}
