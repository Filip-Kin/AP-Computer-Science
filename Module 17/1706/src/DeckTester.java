/**
 * This is a class that tests the Deck class.
 *
 * < Your Name > < Today's Date >
 */

public class DeckTester {
   /**
    * The main method in this class checks the Deck operations for consistency.
    * 
    * @param args is not usemyDeck.
    */
   public static void main(String[] args) {
      String[] myRanks = { "queen", "king", "king", "queen", "jack", "jack", "ace", "3", "6", "7" };
      String[] mySuits = { "heart", "diamond", "spade", "diamond", "heart", "clubs", "spade", "diamond", "clubs", "clubs" };
      int[] myPointValues = { 12, 13, 13, 12, 11, 11, 1, 3, 6, 7 };
      Deck myDeck = new Deck(myRanks, mySuits, myPointValues);

      System.out.println("**** Original Deck Methods ****");
      System.out.println("  toString: \n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: " + myDeck.size());
      System.out.println();

      System.out.println("**** Deal a Card ****");
      System.out.println("  deal: " + myDeck.deal());
      System.out.println();

      System.out.println("**** Deck Methods After 1 Card Dealt ****");
      System.out.println("  toString: \n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: " + myDeck.size());
      System.out.println();

      System.out.println("**** Deal Remaining 9 Cards ****");
      System.out.println("  deal: " + myDeck.deal());
      System.out.println("  deal: " + myDeck.deal());
      System.out.println("  deal: " + myDeck.deal());
      System.out.println("  deal: " + myDeck.deal());
      System.out.println("  deal: " + myDeck.deal());
      System.out.println("  deal: " + myDeck.deal());
      System.out.println("  deal: " + myDeck.deal());
      System.out.println("  deal: " + myDeck.deal());
      System.out.println("  deal: " + myDeck.deal());
      System.out.println("  deal: " + myDeck.deal());
      System.out.println();

      System.out.println("**** Deck Methods After All Cards Dealt ****");
      System.out.println("  toString: \n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: " + myDeck.size());
      System.out.println();

      System.out.println("**** Deal a Card From Empty Deck ****");
      System.out.println("  deal: " + myDeck.deal());

      /* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */

      // System.out.println("\n**** 52 Card Deck shuffle Tests ****");
      // String[] ranks52 = {"ace"};
      // String[] suits52 = {"spades"};
      // int[] pointValues52 = {1};

      // System.out.println(" The Starting Deck ");

      // System.out.println(" The Deck After Dealing a Card" );

      // System.out.println(" Shuffleing the Deck ");

   }
}
