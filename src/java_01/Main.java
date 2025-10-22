package java_01;

// emri i klases duhet me fillu me shkronje te madhe
// emri i klases i njejt me emrin e file-it psh file => Main.java, klasa => public class Main
// .idea permban fajlla konfigurues per IntelliJ
// src follderi qe permban kodin tone
// out permban byte kodin tone pas compajllimit
// Kur i kemi thon run IntelliJ e ka ekzeukutu qet komanden "javac Main.java"
// Mandej u kriju ni file i ri ne follderin out me emrin Main.class qe permban byte kodin
// Byte kodi i Main.class ekzekutohen me fjalen kyce "java Main"
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from Java"); // ; :

        // Syntax error
        // System.out.printlnn("Gabim sintaksor");

        // Runtime error
        // System.out.println("Gabim ne runtime" + 1 / 0);

        // Semantic ose Error logjik
        // Shuma e dy numrave 2 + 2 na jep rezultatin 5 ose 3
        System.out.println("2 + 2 = 5 ??");

        // Komentet
        // Single line
        // Single
        // Line
        // Koment

        /* Multi line koment */
        /*
        * Multi
        * line
        * koment
        *
        *
        *
        * */
    }
}