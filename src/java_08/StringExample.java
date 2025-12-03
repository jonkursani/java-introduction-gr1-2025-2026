package java_08;

public class StringExample {
    public static void main(String[] args) {
        // String methods => metodat e string

        // indeksi fillon prej 0 .... teksti.length() - 1;
        String fjalia = "Sot eshte dite e merkure dhe kemi test ne bazat e web-it";

        // charAt(parametri)
        System.out.println("charAt(1) shkronja o: " + fjalia.charAt(1));

        // length()
        System.out.println("Gjatesia e kesaj fjalie eshte: " + fjalia.length());

        // format()
        System.out.println("format(): " + String.format("%s %S", "Emri", "Mbiemri"));

        // substring() => preje tekstin ne baze te indeksit qe une po e jap
        // substring(indeks) => preje tekstin prej indeksit deri ne fund
        // substring(indeks1, indeks2) => preje tekstin prej tu e perfshi indeksin1 po tu mos e perfshi indeksin2 - 1
        System.out.println("substring(4): " + fjalia.substring(4));
        System.out.println("substring(0, 3): " + fjalia.substring(0, 3));

        // contains()
        System.out.println("contains(merkure): " + fjalia.contains("merkure"));
        System.out.println("contains(premte): " + fjalia.contains("premte"));

        // join()
        System.out.println("join(): " + String.join(" - ", "Emri", "Mbiemri", "Mosha"));

        // equals()
        String emri = "Jon";
        System.out.println("equals(): " + "Jon".equals("Arbnor")); // true ose false
        System.out.println("equals(): " + emri.equals("Arbnor")); // true ose false

        // isEmpty(), isBlank()
        System.out.println("isEmpty(): " + " ".isEmpty());
        System.out.println("isBlank(): " + " ".isBlank());
        System.out.println("isBlank(): " + " J".isBlank());

        // trim()
        System.out.println("isEmpty(), trim(): " + " ".trim().isEmpty()); // trim() i largon hapsirat e zbrazta
        System.out.println("trim(): " + " Jon ".trim());

        // concat()
        System.out.println("concat(): " + "Jon".concat("Arbnor"));

        // replace()
        System.out.println("replace(): " + fjalia.replace("dite", "nate"));

        // split()
        System.out.println("split(' '): " + fjalia.split(" ")[0]); // Array => ["Sot", "eshte", "dite", "e", "merkure"]
        System.out.println("split(','): " + "1,2,3".split(",")[0]); // Array => ["1", "2", "3"]

        // indexOf()
        System.out.println("indexOf('S'): " + fjalia.indexOf("S")); // 0
        System.out.println("indexOf('s', 10): " + fjalia.indexOf("s", 10));

        // toLowerCase(), toUpperCase()
        System.out.println("toLowerCase(): " + fjalia.toLowerCase());
        System.out.println("toUpperCase(): " + fjalia.toUpperCase());

        // valueOf()
        System.out.println("valueOf(): " + String.valueOf(123)); // "123"

        // repeat()
        System.out.println("repeat(): " + "Msoni ma shume te shpija".repeat(5));

        // startsWith(), endsWith()
        System.out.println("startsWith(): " + fjalia.startsWith("S")); // true ose false
        System.out.println("endsWith(): " + fjalia.endsWith("it"));
    }
}