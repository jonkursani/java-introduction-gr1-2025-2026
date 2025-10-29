package java_03.ushtrime;

public class Detyra2 {
    public static void main(String[] args){
        String name = "Enes", surname = "Kaqandolli";
        byte age = 18;
        short birthYear = 2007;
        float height = 1.82F;
        double distance = 25.7;
        boolean isStudent = true;

        System.out.printf("Une quhem %s %S.%n", name, surname);
        System.out.printf("Mosha ime eshte: %d.%n", age);
        System.out.printf("Viti i lindjes: %d.%n", birthYear);
        System.out.printf("Gjatesia ime eshte %.2f.%n", height);
        System.out.printf("Distanca ime nga shtepia ne cct: %.2f.%n", distance);
        System.out.printf("Jam student (True/False): %b.%n", isStudent);
    }
}