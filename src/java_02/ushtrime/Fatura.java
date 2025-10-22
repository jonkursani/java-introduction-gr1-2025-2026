package java_02.ushtrime;

public class Fatura {
    public static void main(String[] args) {
        System.out.println("|=====================================|");
        System.out.println("|============== Fatura ===============|");
        System.out.println("|=====================================|");
        System.out.printf("| Emri dhe mbiemri: %s %S     |%n", "Filan", "Fisteku");
        System.out.printf("| Produkti: %S                   |%n", "Telefon");
        System.out.printf("| Sasia: %d                            |%n", 1);
        System.out.println("|-------------------------------------|");
        System.out.printf("| %25s: %c%.2f |%n", "Total", '$', 1250.50);
        System.out.println("|=====================================|");
    }
}
