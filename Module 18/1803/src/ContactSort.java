import java.util.ArrayList;
import java.util.Arrays;

/**
 * Class full of different sorting methods
 * 
 * @author Filip Kin
 * @version 2020-04-23
 */

public class ContactSort {
    /**
     * Comparison method shared by all sorting types
     * 
     * @param contactsOld
     * @param reverse
     * @param type
     * @return
     */
    public static int compare(Contact a, Contact b, int type, boolean reverse) {
        int comparison = 0;
        switch (type) {
            case 1:
                comparison = a.getName().compareTo(b.getName());
                break;
            case 2:
                comparison = a.getRelation().compareTo(b.getRelation());
                break;
            case 3:
                comparison = a.getBirthday().compareTo(b.getBirthday());
                break;
            case 4:
                comparison = a.getPhoneNumber().compareTo(b.getPhoneNumber());
                break;
            case 5:
                comparison = a.getEmail().compareTo(b.getEmail());
                break;
            case 6:
                comparison = a.getBirthday().split("-")[0].compareTo(b.getBirthday().split("-")[0]);
                break;
            case 7:
                comparison = a.getBirthday().split("-")[1].compareTo(b.getBirthday().split("-")[1]);
                break;
            case 8:
                comparison = a.getBirthday().split("-")[2].compareTo(b.getBirthday().split("-")[2]);
                break;
            case 9:
                comparison = a.getName().split(" ")[0].compareTo(b.getName().split(" ")[0]);
                break;
            case 10:
                comparison = a.getName().split(" ")[1].compareTo(b.getName().split(" ")[1]);
                break;
        }
        if (reverse) comparison = comparison * -1; // Reverse direction
        return comparison;
    }

    /**
     * Insert sort of ArrayList
     * 
     * @param contacts  ArrayList of Contact objects
     * @param type      1=name, 2=relation, 3=birthday, 4=phoneNumber, 5=email
     * @param reverse   Should the results be descending instead of ascending
     * @return          Sorted ArrayList of Contact objects
     */
    public static ArrayList<Contact> insert(ArrayList<Contact> contacts, int type, boolean reverse) {
        ArrayList<Contact> newList = new ArrayList<Contact>();
        newList.add(contacts.get(0));
        for(int i = 1; i < contacts.size(); i++) { // Go through each contact
            for(int j = 0; j < newList.size(); j++) { // Compare it with each contact
                if (compare(contacts.get(i), newList.get(j), type, reverse) <= 0) { // j is now greater than the correct spot
                    newList.add(j, contacts.get(i));
                    break;
                } else if (compare(contacts.get(i), newList.get(j), type, reverse) >= 0 && j >= (newList.size()-1)) { // Element belongs at the top
                    newList.add(contacts.get(i));
                    break;
                }
            }
        }

        // After iterating through each contact it should be in the correct order
        return newList;
    }

    /**
     * Selection sort of ArrayList
     * 
     * @param contacts  ArrayList of Contact objects
     * @param type      1=name, 2=relation, 3=birthday, 4=phoneNumber, 5=email
     * @param reverse   Should the results be descending instead of ascending
     * @return          Sorted ArrayList of Contact objects
     */
    public static ArrayList<Contact> selection(ArrayList<Contact> contactsOld, int type, boolean reverse) {
        ArrayList<Contact> contacts = new ArrayList<Contact>();
        for(int i = 0; i < contactsOld.size(); i++) { contacts.add(contactsOld.get(i)); } // Deep copy of array

        ArrayList<Contact> newList = new ArrayList<Contact>();
        while(contacts.size() > 1) { // Go through each contact
            int lowest = 0; // Start with the first contact in the array

            for(int i = 1; i < contacts.size(); i++) { // Compare to each contact in the array
                if (compare(contacts.get(i), contacts.get(lowest), type, reverse) <= 0) { // i is smaller than lowest
                    lowest = i;
                }
            }

            newList.add(contacts.get(lowest)); // Add lowest to new array
            contacts.remove(lowest); // Remove from old array
        }
        newList.add(contacts.get(0)); // Add in the last contact which should be the lowest

        // After iterating through each contact it should be in the correct order
        return newList;
    }

    /**
     * Merge sort of ArrayList, Assumes 0 and max index as low and high
     * 
     * @param contacts  ArrayList of Contact objects
     * @param type      1=name, 2=relation, 3=birthday, 4=phoneNumber, 5=email
     * @param reverse   Should the results be descending instead of ascending
     * @return          Sorted ArrayList of Contact objects
     */
    public static ArrayList<Contact> merge(ArrayList<Contact> contacts, int type, boolean reverse) {
        return merge(contacts, type, reverse, 0, contacts.size()-1);
    }

    /**
     * Merge sort of ArrayList
     * 
     * @param contacts  ArrayList of Contact objects
     * @param type      1=name, 2=relation, 3=birthday, 4=phoneNumber, 5=email
     * @param reverse   Should the results be descending instead of ascending
     * @param low       low index for sorting
     * @param high      max index for sorting
     * @return          Sorted ArrayList of Contact objects
     */
    public static ArrayList<Contact> merge(ArrayList<Contact> contacts, int type, boolean reverse, int low, int high) {
        if ((high-low) > 1) {
            // Split
            int mid = (int) Math.floor((high-low)/2.0)+low;
            ArrayList<Contact> a = merge(contacts, type, reverse, low, mid);
            ArrayList<Contact> b = merge(contacts, type, reverse, mid+1, high);

            // Merge
            for(int i = a.size()-1; i >= 0; i--) {
                for(int j = 0; j < b.size(); j++) {
                    if (compare(a.get(i), b.get(j), type, reverse) <= 0) { // j is the spot
                        b.add(j, a.get(i));
                        break;
                    } else if (j >= b.size()-1) { // i goes to the top;
                        b.add(a.get(i));
                        break;
                    }
                }
            }

            return b;
        } else if ((high-low) < 1) {
            return new ArrayList<Contact>(Arrays.asList(contacts.get(low)));
        } else {
            if (compare(contacts.get(low), contacts.get(high), type, reverse) > 0) return new ArrayList<Contact>(Arrays.asList(contacts.get(high), contacts.get(low)));
            return new ArrayList<Contact>(Arrays.asList(contacts.get(low), contacts.get(high)));
        }
    }
}