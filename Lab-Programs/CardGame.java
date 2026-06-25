import java.util.*;

class Card {
    String suit;
    String rank;

    Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String toString() {
        return rank + " of " + suit;
    }
}

// Class to represent a Deck of cards
class Deck {
    ArrayList<Card> cards = new ArrayList<>();

    // Create 52 cards
    Deck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7",
                          "8", "9", "10", "J", "Q", "K"};

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    // Shuffle the deck
    void shuffleDeck() {
        Collections.shuffle(cards);
    }

    // Deal one card
    Card dealCard() {
        if (cards.size() > 0) {
            return cards.remove(0);
        }
        return null;
    }
}

// Main class
public class CardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Deck deck = new Deck();
        deck.shuffleDeck();

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = sc.nextInt();

        // Deal cards to players
        for (int i = 1; i <= players; i++) {
            System.out.println("\nPlayer " + i + " cards:");

            for (int j = 1; j <= cardsPerPlayer; j++) {
                Card c = deck.dealCard();

                if (c != null)
                    System.out.println(c);
                else
                    System.out.println("No more cards left!");
            }
        }

        sc.close();
    }
}
