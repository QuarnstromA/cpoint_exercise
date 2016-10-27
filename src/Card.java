/**
 * Created by Anthony Quarnstrom on 10/25/2016.
 */
public class Card {
    private String suit;
    private String rank;

    /**
     * Returns a card of the given suit and rank.
     * @param suit
     * @param rank
     */
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return String.format("%s of %s", rank, suit);
    }
}
