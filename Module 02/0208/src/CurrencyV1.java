/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given
 * the current exchange rate.
 *
 * @author Filip Kin
 * @version 2019-09-18
 */
public class CurrencyV1 {
    public static void main(String [] args) {
        //Declare and initialize local variables
        double startingUsDollars = 6500.00; //Starting US Dollars
        double pesosSpent = 7210.25; //Pesos spent
        double yenSpent = 99939.75; //Yen spent
        double eurosSpent = 624.95; //Euros spent
        
        //remaining variables below here
        double dollarPerPeso = 0.0545; //MXN to USD rate
        double dollarPerYen = 0.00973; //JPY to USD rate
        double dollarPerEuro = 1.1645; //EUR to USD rate

        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        System.out.println("Starting Amount:\t\t"+startingUsDollars);
        
        double dollarsSpentInMexico = pesosSpent*dollarPerPeso; //US dollars spent in Mexico
        startingUsDollars -= dollarsSpentInMexico; //Remove Mexico's cost from the budget
        System.out.println("\nMexico:");
        System.out.println("  Pesos spent:\t\t\t"+pesosSpent);
        System.out.println("  USD equivalent:\t\t"+dollarsSpentInMexico);
        System.out.println("  USD remaining:\t\t"+startingUsDollars);
        
        double dollarsSpentInJapan = yenSpent*dollarPerYen; //US dollars spent in Japan
        startingUsDollars -= dollarsSpentInJapan; //Remove Japan's cost from the budget
        System.out.println("\nJapan:");
        System.out.println("  Yen spent:\t\t\t"+yenSpent);
        System.out.println("  USD equivalent:\t\t"+dollarsSpentInJapan);
        System.out.println("  USD remaining:\t\t"+startingUsDollars);

        double dollarsSpentInFrance = eurosSpent*dollarPerEuro; //US dollars spent in France
        startingUsDollars -= dollarsSpentInFrance; //Remove France's cost from the budget
        System.out.println("\nFrance:");
        System.out.println("  Euro spent:\t\t\t"+eurosSpent);
        System.out.println("  USD equivalent:\t\t"+dollarsSpentInFrance);
        System.out.println("  USD remaining:\t\t"+startingUsDollars);

        System.out.println("==================================================");
        System.out.println("USD remaining:\t\t"+startingUsDollars);
        System.out.println("\n\n");

        //Calculations for Souvenir #1
        int costItem1 = 12; //Cost per item of first souvenir
        int budget1 = 100; //Budget for first item
        int  totalItems1 = budget1 / costItem1; //How many items can be purchased
        double fundsRemaining1 = budget1%costItem1; //How much of the budget is left

        System.out.println("Item 1");
        System.out.println("   Cost per item: $" + costItem1 );
        System.out.println("   Budget: $"+ budget1);
        System.out.println("   Total items purchased: " +  totalItems1);
        System.out.println("   Funds remaining: $"  +  fundsRemaining1);
        System.out.println();

        //Calculations for Souvenir #2
        double costItem2 = 29.99; //Cost per item of first souvenir
        double budget2 = 500; //Budget for first item
        int  totalItems2 = budget1 / costItem1; //How many items can be purchased
        double fundsRemaining2 = budget2/costItem2; //How much of the budget is left
        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costItem2 );
        System.out.println("   Budget: $"+ budget2);
        System.out.println("   Total items purchased: " +  totalItems2);
        System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class
