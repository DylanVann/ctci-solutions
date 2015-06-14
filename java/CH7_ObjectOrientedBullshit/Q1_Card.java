package CH7_ObjectOrientedBullshit;

public class Q1_Card {

    public enum Suit {
        CLUBS,
        SPADES,
        HEARTS,
        DIAMONDS
    }

    /*
    We can check if a card is a certain face card.

    ```
    if (card.getValue() == Card.ACE) {
        // The card is an ace.
    }
    ```
     */
    public final static int ACE = 1;
    public final static int JACK = 11;
    public final static int QUEEN = 12;
    public final static int KING = 13;
    public final static int JOKER = 14;

    private int value;
    private Suit suit;

    public Q1_Card(int value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

}
