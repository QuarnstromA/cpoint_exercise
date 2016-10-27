import java.util.*;

/**
 * Created by Anthony Quarnstrom on 10/25/2016.
 */
public class Deck {
    List<Card> cards;
    final private String[] suits = new String[]{"Spades", "Clubs", "Diamonds", "Hearts"};
    final private String[] ranks = new String[]{"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    /**
     * Returns a standard deck of cards in the order of Spades > Clubs > Diamonds > Hearts, ordered rank Ace to King.
     */
    public Deck() {
        cards = new LinkedList<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    /**
     * Creates a deck from a List of premade cards.
     * @param cards
     */
    public Deck(List<Card> cards) {
        this.cards = cards;
    }

    /**
     * Shuffles the list of cards randomly.
     */
    public void shuffleDeck() {
        Random rand = new Random();
        List<Card> shuffledCards = new LinkedList<>();

        while (!cards.isEmpty()) {
            shuffledCards.add(cards.remove(
                    rand.nextInt(cards.size())
            ));
        }
        this.cards = shuffledCards;
    }

    /**
     * Pops a card off the top of the deck.
     * @return A card from the top of the deck.
     */
    public Card drawCard() {
        return ((Queue<Card>) cards).remove();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Card card : cards) {
            builder.append(card.toString() + ", ");
        }
        //Chop off the trailing comma and space
        builder.setLength(builder.length()-2);
        return builder.toString();
    }

}
