/**
 * This is a class that tests the Deck class.
 *
 * < Your Name > < Today's Date >
 */

public class DeckTesterV2 {
   /**
    * The main method in this class checks the Deck operations for consistency.
    *
    * @author Filip Kin
    * @version 2020-04-24
    */
   public static void main(String[] args) {
      String[] myRanks = { "queen", "king", "king", "queen", "jack", "jack", "ace", "3", "6", "7" };
      String[] mySuits = { "heart", "diamond", "spade", "diamond", "heart", "clubs", "spade", "diamond", "clubs",
            "clubs" };
      int[] myPointValues = { 12, 13, 13, 12, 11, 11, 1, 3, 6, 7 };
      DeckV2 myDeck = new DeckV2(myRanks, mySuits, myPointValues);

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

      System.out.println("\n**** 52 Card Deck shuffle Tests ****");

      String[] ranks52 = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
      String[] suits52 = {"spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs"};
      int[] pointValues52 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

      DeckV2 myDeck2 = new DeckV2(ranks52, suits52, pointValues52);

      System.out.println(" The Starting Deck ");
      System.out.println("  toString: \n" + myDeck2.toString());
      System.out.println(" Shuffling the Deck ");
      myDeck2.shuffle();
      System.out.println("  toString: \n" + myDeck2.toString());
      System.out.println(" The Deck After Dealing a Card" );
      myDeck2.deal();
      System.out.println("  toString: \n" + myDeck2.toString());



   }
}
