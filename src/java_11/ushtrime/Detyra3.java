void main() {
//    Merr nje vlere numerike nga perdoruesi ne rangun 1-100
//    Tenton qe te printon numrat nga 1-100 mirepo ndalon printimi ne
//    momentin qe numri e arrin vleren e dhene nga perdoruesi
//    Menaxho aplikacionin ne ate menyre qe te implementoni sintaksen “break”
    Scanner sc = new Scanner(System.in);

    int rangu;
    do {
        System.out.print("Shkruani numrin per te ndaluar (1 - 100): ");
        rangu = sc.nextInt();
    // } while (rangu < 1 || rangu > 100); // F || F => F
    } while (!(rangu >= 1 && rangu <= 100)); // T && T => !T => F


    for (int i = 1; i <= 100; i++) {
        System.out.print(i + " ");
        if (i == rangu)
            break;
    }
}