import java.util.ArrayList;
import java.util.List;

/**
 * The Deck class represents a shuffled deck of cards. It provides several
 * operations including initialize, shuffle, deal, and check if empty.
 *
 * @author Filip Kin
 * @version 2020-04-24
 */
public class DeckV2 {
   private List<CardV2> cards; // contains all the cards in the deck
   static final int SHUFFLE_COUNT = 5;

   private int size; // size is the number of not-yet-dealt cards.
                     // Cards are dealt from the top (highest index) down.
                     // The next card to be dealt is at size - 1.

   /**
    * Creates a new Deck instance.<BR>
    * It pairs each element of ranks with each element of suits, and produces one
    * of the corresponding card.
    * 
    * @param ranks  is an array containing all of the card ranks.
    * @param suits  is an array containing all of the card suits.
    * @param values is an array containing all of the card point values.
    */
   public DeckV2(String[] ranks, String[] suits, int[] values) {
      cards = new ArrayList<CardV2>();
      for (int i = 0; i < ranks.length; i++) {
         cards.add(new CardV2(ranks[i], suits[i], values[i]));
      }
      size = cards.size();
      shuffle();
   }

   /**
    * Determines if this deck is empty (no undealt cards).
    * 
    * @return true if this deck is empty, false otherwise.
    */
   public boolean isEmpty() {
      return size < 1;
   }

   /**
    * Accesses the number of undealt cards in this deck.
    * 
    * @return the number of undealt cards in this deck.
    */
   public int size() {
      return size;
   }

   /**
    * Randomly permute the given collection of cards and reset the size to
    * represent the entire deck.
    */
   public void shuffle() {
      for (int i = 0; i <= SHUFFLE_COUNT; i++) {
         for (int k = cards.size() - 1; k > 0; k--) {
             int pos = (int) (Math.random() * (k + 1));  // range 0 to k, inclusive
             CardV2 tempC = cards.get(pos);
             cards.set(pos, cards.get(k));
             cards.set(k, tempC);
         }
     }
   }

   /**
    * Deals a card from this deck.
    * 
    * @return the card just dealt, or null if all the cards have been previously
    *         dealt.
    */
   public CardV2 deal() {
      if (isEmpty())
         return null;
      size--;
      return cards.get(cards.size() - size - 1);
   }

   /**
    * Generates and returns a string representation of this deck.
    * 
    * @return a string representation of this deck.
    */
   @Override
   public String toString() {
      String rtn = "size = " + size + "\nUndealt cards: \n";

      for (int k = size - 1; k >= 0; k--) {
         rtn = rtn + cards.get(k);
         if (k != 0) {
            rtn = rtn + ",\n";
         }
      }

      rtn = rtn + "\nDealt cards: \n";
      for (int k = cards.size() - 1; k >= size; k--) {
         rtn = rtn + cards.get(k);
         if (k != size) {
            rtn = rtn + ",\n";
         }
      }
      rtn = rtn + "\n";
      return rtn;
   }
}
