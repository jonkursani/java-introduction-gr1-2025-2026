void main() {
    String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    String[] suit = {"♠️", "♥️", "♦️", "♣️"};
//    String[] deck = new String[52];
    String[] deck = new String[rank.length * suit.length];

//    deck[0]
//    deck[1]
//    deck[2]
    // Mbushja me vlera
    int z = 0;
    for (int i = 0; i < suit.length; i++) {
        for (int j = 0; j < rank.length; j++) {
            deck[z++] = rank[j] + suit[i]; // 2♣️
            // z++;
        }
    }

    // Printimi i vlerave
    for (int i = 0; i < deck.length; i++) {
        System.out.print(deck[i] + " ");
    }
}