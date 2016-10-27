/**
 * Created by Anthony Quarnstrom on 10/25/2016.
 */
public class CardPicker {
    private static boolean debug;

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java CardPicker <Nth card> <Optional: -D debug flag>");
            return;
        }
        int nthCard;
        try {
            nthCard = Integer.valueOf(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a numeric value between 1 and 52 for your n.");
            return;
        }
        if (nthCard <= 0 || nthCard > 52) {
            System.out.println("The number of cards to draw must be more than 0 and less than 52");
            return;
        }
        debug = args.length == 2;

        printDebug("Nth card value: " + nthCard);
        Deck deck = new Deck();
        printDebug("Before Shuffling: " + deck.toString());
        deck.shuffleDeck();
        printDebug("After Shuffling: " + deck.toString());
        printDebug("Nth Card: ");
        System.out.println(getNthCard(deck, nthCard));
    }

    private static String getNthCard(Deck deck, int n) {
        Card card = null;
        for (int i = 0; i < n; i++) {
            card = deck.drawCard();
        }
        return card.toString();
    }

    private static void printDebug(String msg) {
        if (debug) {
            System.out.println(msg);
        }
    }
}
