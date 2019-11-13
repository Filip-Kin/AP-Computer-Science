import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * The purpose of this program is to collect a customers information
 * and their order then print a receipt
 *
 * @author Filip Kin
 * @version 2019-10-04
 */

public class BuyMovieTickets {
    public static void main(String[] args) {
        // Variables
        double childTicketPrice = 8.99;
        double adultTicketPrice = 11.99;
        double seniorTicketPrice = 9.99;

        Scanner in = new Scanner(System.in);

        // Initial display
        System.out.println("Good Evening, Welcome to MJR Theaters");
        System.out.println("------------------------------");
        System.out.println("Pricing:");
        System.out.println("Child (3-12)\t$"+childTicketPrice);
        System.out.println("Adult\t\t\t$"+adultTicketPrice);
        System.out.println("Senior (60+)\t$"+seniorTicketPrice);
        System.out.println("------------------------------");
        System.out.println("Upcoming Shows:");
        System.out.println("Avengers: Endgame\t9:20p");
        System.out.println("IT Chapter Two\t\t9:35p");
        System.out.println("Dora Lost City\t\t9:40p");
        System.out.println("Toy Story 4\t\t\t9:55p");
        System.out.println("------------------------------");

        // Gather information
        System.out.print("Please enter the following information\nFirst and last name: ");
        String name = in.nextLine();
        System.out.print("Today's date (mm/dd/yyyy): ");
        String date = in.nextLine();
        System.out.print("Movie title: ");
        String title = in.nextLine();
        System.out.print("Number of child (3-12) tickets: ");
        String childTickets = in.nextLine();
        System.out.print("Number of adult tickets: ");
        String adultTickets = in.nextLine();
        System.out.print("Number of senior (60+) tickets: ");
        String seniorTickets = in.nextLine();
        System.out.print("Debit card number (****-****-****-****): ");
        String cardNumber = in.nextLine();
        System.out.print("Pin (****): ");
        String cardPin = in.nextLine();

        // Calculate
        int childAmount = parseInt(childTickets);
        int adultAmount = parseInt(adultTickets);
        int seniorAmount = parseInt(seniorTickets);
        double totalPrice = childTicketPrice * childAmount;
        totalPrice += adultTicketPrice * adultAmount;
        totalPrice += seniorTicketPrice * seniorAmount;
        int totalAmount = childAmount + adultAmount + seniorAmount;

        String reformattedDate = date.replaceAll("/", "-");
        String firstName = name.substring(0, name.indexOf(" "));
        String lastName = name.substring(name.indexOf(" ")+1);
        String firstInital = firstName.substring(0,1);
        String censoredCardNumber = "****-****-****-"+cardNumber.substring(15);

        // Print receipt
        System.out.println("------------------------------");
        System.out.println("Thank you, enjoy the show");
        System.out.println("\n"+reformattedDate);
        System.out.println("Order: 1337");
        System.out.println("\n\t"+firstInital+". "+lastName);
        System.out.println("\tMovie: "+title);
        System.out.println("\tNumber of tickets: "+totalAmount+" C"+childAmount+"A"+adultAmount+"S"+seniorAmount);
        System.out.println("\tTotal price: $"+totalPrice);
        System.out.println("\n\tPayment method: Debit");
        System.out.println("\tCard number: "+censoredCardNumber);
        System.out.println("\tTendered: $"+totalPrice);
        System.out.println("\tChange: $0.00");
        System.out.println("\n------------------------------");

    }
}
