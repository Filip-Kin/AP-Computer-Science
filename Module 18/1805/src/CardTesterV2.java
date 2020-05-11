/**
 * This is a class that tests the Card class.
 *
 * @author Filip Kin
 * @version 2020-04-24
 */

public class CardTesterV2 {
   /**
    * The main method in this class checks the Card operations for consistency.
    * 
    * @param args is not used.
    */
   public static void main(String[] args) {

      // Establish new cards
      CardV2 aceHearts = new CardV2("ace", "hearts", 1);
      CardV2 kingSpades = new CardV2("king", "spades", 13);
      CardV2 aceSpades = new CardV2("ace", "spades", 1);

      // Test card 1
      System.out.println("**** Tests Card 1: ace of hearts ****");
      System.out.println("  rank: " + aceHearts.rank());
      System.out.println("  suit: " + aceHearts.suit());
      System.out.println("  pointValue: " + aceHearts.pointValue());
      System.out.println("  toString: " + aceHearts.toString());
      System.out.println();

      // Test card 2
      System.out.println("**** Tests Card 2: king of spades ****");
      System.out.println("  rank: " + kingSpades.rank());
      System.out.println("  suit: " + kingSpades.suit());
      System.out.println("  pointValue: " + kingSpades.pointValue());
      System.out.println("  toString: " + kingSpades.toString());
      System.out.println();

      // Test card 3
      System.out.println("**** Tests Card 3: ace of hearts ****");
      System.out.println("  rank: " + aceSpades.rank());
      System.out.println("  suit: " + aceSpades.suit());
      System.out.println("  pointValue: " + aceSpades.pointValue());
      System.out.println("  toString: " + aceSpades.toString());
      System.out.println();

      // Test matches() method
      System.out.println("**** matches Tests ****");
      System.out.println("matching: " + aceHearts.matches(aceHearts));
      System.out.println("not matching: " + aceHearts.matches(aceSpades));
      System.out.println();

   }
}
