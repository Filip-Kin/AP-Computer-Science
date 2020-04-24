import java.util.ArrayList;

public class ContactTest {
    public static void main(String[] args) {
        ArrayList<Contact> contacts = new ArrayList<Contact>();
        
        contacts.add(new Contact("Aarushi Shah", "Friend", "2003-06-23", "2488361064", "johndo@yahoo.ca"));
        contacts.add(new Contact("Anna Bowden", "Friend", "2003-05-17" , "2489191077", "makarow@msn.com"));
        contacts.add(new Contact("Jacek Kin", "Father", "1957-04-02", "2489272691", "esokullu@icloud.com"));
        contacts.add(new Contact("David Caruso", "Friend", "2004-04-27", "2485831003", "dkasak@me.com"));
        contacts.add(new Contact("Julia Kin", "Sister", "2007-08-15", "2483746153", "hamilton@comcast.net"));
        contacts.add(new Contact("Ayush Malpeddi", "Friend", "2003-02-18", "2481986685", "devphil@yahoo.com"));
        contacts.add(new Contact("Cameron Wooley", "Coworker", "2002-05-13", "2488124206", "gamma@gmail.com"));
        contacts.add(new Contact("Julia Genord", "Coworker", "2002-08-24", "2489828308", "michiel@gmail.com"));
        contacts.add(new Contact("Dorota Kin", "Mother", "1967-05-14", "2487963603", "jcholewa@yahoo.ca"));
        contacts.add(new Contact("Ali Spanta", "Coworker", "2002-04-20", "2482116554", "seano@verizon.net"));

        System.out.println("Unsorted contacts list");
        printContacts(contacts);

        /*
        System.out.println("\nSorted by Name");
        printContacts(ContactSort.selection(contacts, 1, false));
        System.out.println("\nSorted by Relation");
        printContacts(ContactSort.selection(contacts, 2, false));
        System.out.println("\nSorted by Birthday");
        printContacts(ContactSort.selection(contacts, 3, false));
        System.out.println("\nSorted by Phone number");
        printContacts(ContactSort.selection(contacts, 4, false));
        System.out.println("\nSorted by Email");
        printContacts(ContactSort.selection(contacts, 5, false));
        System.out.println("\nSorted by Birth year");
        printContacts(ContactSort.selection(contacts, 6, false));
        System.out.println("\nSorted by Birth month");
        printContacts(ContactSort.selection(contacts, 7, false));
        System.out.println("\nSorted by Birth date");
        printContacts(ContactSort.selection(contacts, 8, false));
        System.out.println("\nSorted by First name");
        printContacts(ContactSort.selection(contacts, 9, false));
        System.out.println("\nSorted by Last name");
        printContacts(ContactSort.selection(contacts, 10, false));
        */

        System.out.println("\nSearching for people with full name Aarushi Shah");
        searchName(contacts, "Aarushi Shah");
        System.out.println("\nSearching for people with first name Julia");
        SearchContacts.binary(ContactSort.selection(contacts, 9, false), "Julia", 9);
        System.out.println("\nSearching for people with last name Kin");
        SearchContacts.binary(ContactSort.selection(contacts, 10, false), "Kin", 10);


        System.out.println("\nSearching for people with relation Coworker");
        searchRelation(ContactSort.selection(contacts, 2, false), "Coworker");
        System.out.println("\nSearching for people with relation Friend");
        searchRelation(ContactSort.selection(contacts, 2, false), "Friend");

        System.out.println("\nSearching for people born in August");
        searchBirthdayMonth(ContactSort.selection(contacts, 7, false), "08");
        System.out.println("\nSearching for people born in December");
        searchBirthdayMonth(ContactSort.selection(contacts, 7, false), "12");
        System.out.println("\nSearching for people born in 2003");
        SearchContacts.binary(ContactSort.selection(contacts, 6, false), "2003", 6);
        
        System.out.println("\nSearching for people with the phone number 2487963603");
        searchPhoneNumber(contacts, "2487963603");
        System.out.println("\nSearching for people with the email address gamma@gmail.com");
        searchEmail(contacts, "gamma@gmail.com");
    }

    static void printContacts(ArrayList<Contact> contacts) {
        System.out.printf("%-20s %-10s %-14s %-14s %s%n", "name", "relation", "birthday", "phone number", "email");
        for (Contact c : contacts) {
            System.out.print(c.toString());
        }
    }

    static void searchName(ArrayList<Contact> contacts, String toFind) {
        SearchContacts.binary(contacts, toFind, 1);
    }

    static void searchRelation(ArrayList<Contact> contacts, String toFind) {
        SearchContacts.binary(contacts, toFind, 2);
    }

    static void searchBirthdayMonth(ArrayList<Contact> contacts, String toFind) {
        SearchContacts.linear(contacts, toFind, 7);
    }

    static void searchPhoneNumber(ArrayList<Contact> contacts, String toFind) {
        SearchContacts.linear(contacts, toFind, 4);
    }

    static void searchEmail(ArrayList<Contact> contacts, String toFind) {
        SearchContacts.linear(contacts, toFind, 5);
    }
}