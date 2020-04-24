import java.util.ArrayList;
import java.util.Arrays;

/**
 * Class full of different sorting methods
 * 
 * @author Filip Kin
 * @version 2020-04-23
 */

public class Sort {
    /**
     * Comparison method shared by all sorting types
     * 
     * @param itemsOld
     * @param reverse
     * @param type
     * @return
     */
    public static int compare(Item a, Item b, int type, boolean reverse) {
        int comparison = 0;
        switch(type) {
            case 1:
                comparison = a.getBarcode().compareTo(b.getBarcode());
                break;
            case 2:
                comparison = a.getItemName().compareTo(b.getItemName());
                break;
            case 3:
                comparison = a.getQuantity() - b.getQuantity();
                break;
            case 4:
                comparison = (int) (((a.getPrice() - b.getPrice()) > 0) ? Math.ceil(a.getPrice() - b.getPrice()):Math.floor(a.getPrice() - b.getPrice()));
                break;
        }
        if (reverse) comparison = comparison * -1; // Reverse direction
        return comparison;
    }

    /**
     * Insert sort of ArrayList
     * 
     * @param items     ArrayList of Item objects
     * @param type      1=barcode, 2=itemName, 3=quantity, 4=price
     * @param reverse   Should the results be descending instead of ascending
     * @return          Sorted ArrayList of Item objects
     */
    public static ArrayList<Item> insert(ArrayList<Item> items, int type, boolean reverse) {
        ArrayList<Item> newList = new ArrayList<Item>();
        newList.add(items.get(0));
        for(int i = 1; i < items.size(); i++) { // Go through each item
            for(int j = 0; j < newList.size(); j++) { // Compare it with each item
                if (compare(items.get(i), newList.get(j), type, reverse) <= 0) { // j is now greater than the correct spot
                    newList.add(j, items.get(i));
                    break;
                } else if (compare(items.get(i), newList.get(j), type, reverse) >= 0 && j >= (newList.size()-1)) { // Element belongs at the top
                    newList.add(items.get(i));
                    break;
                }
            }
        }

        // After iterating through each item it should be in the correct order
        return newList;
    }

    /**
     * Selection sort of ArrayList
     * 
     * @param items     ArrayList of Item objects
     * @param type      1=barcode, 2=itemName, 3=quantity, 4=price
     * @param reverse   Should the results be descending instead of ascending
     * @return          Sorted ArrayList of Item objects
     */
    public static ArrayList<Item> selection(ArrayList<Item> itemsOld, int type, boolean reverse) {
        ArrayList<Item> items = new ArrayList<Item>();
        for(int i = 0; i < itemsOld.size(); i++) { items.add(itemsOld.get(i)); } // Deep copy of array

        ArrayList<Item> newList = new ArrayList<Item>();
        while(items.size() > 1) { // Go through each item
            int lowest = 0; // Start with the first item in the array

            for(int i = 1; i < items.size(); i++) { // Compare to each item in the array
                if (compare(items.get(i), items.get(lowest), type, reverse) <= 0) { // i is smaller than lowest
                    lowest = i;
                }
            }

            newList.add(items.get(lowest)); // Add lowest to new array
            items.remove(lowest); // Remove from old array
        }
        newList.add(items.get(0)); // Add in the last item which should be the lowest

        // After iterating through each item it should be in the correct order
        return newList;
    }

    /**
     * Merge sort of ArrayList, Assumes 0 and max index as low and high
     * 
     * @param items     ArrayList of Item objects
     * @param type      1=barcode, 2=itemName, 3=quantity, 4=price
     * @param reverse   Should the results be descending instead of ascending
     * @return          Sorted ArrayList of Item objects
     */
    public static ArrayList<Item> merge(ArrayList<Item> items, int type, boolean reverse) {
        return merge(items, type, reverse, 0, items.size()-1);
    }

    /**
     * Merge sort of ArrayList
     * 
     * @param items     ArrayList of Item objects
     * @param type      1=barcode, 2=itemName, 3=quantity, 4=price
     * @param reverse   Should the results be descending instead of ascending
     * @param low       low index for sorting
     * @param high      max index for sorting
     * @return          Sorted ArrayList of Item objects
     */
    public static ArrayList<Item> merge(ArrayList<Item> items, int type, boolean reverse, int low, int high) {
        if ((high-low) > 1) {
            // Split
            int mid = (int) Math.floor((high-low)/2.0)+low;
            ArrayList<Item> a = merge(items, type, reverse, low, mid);
            ArrayList<Item> b = merge(items, type, reverse, mid+1, high);

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
            return new ArrayList<Item>(Arrays.asList(items.get(low)));
        } else {
            if (compare(items.get(low), items.get(high), type, reverse) > 0) return new ArrayList<Item>(Arrays.asList(items.get(high), items.get(low)));
            return new ArrayList<Item>(Arrays.asList(items.get(low), items.get(high)));
        }
    }
}