import java.util.ArrayList;

/**
 * Tests the Item class using different sorting algorithms.
 *
 * @author Filip Kin
 * @version 2020-04-23
 */
public class TestItem {
    public static void main(String args[]) {
        ArrayList<Item> inventory = new ArrayList<Item>();

        // No rhyme or reason for these items, random number generators for barcodes, quantity, price, and random "thing" generator for name
        inventory.add(new Item("481202139387", "carrots", 71, 55.99));
        inventory.add(new Item("572785471570", "conditioner", 59, 58.99));
        inventory.add(new Item("550637032928", "hair brush", 91, 12.99));
        inventory.add(new Item("221595043282", "shampoo", 43, 32.99));
        inventory.add(new Item("849145309204", "ring", 41, 34.99));
        inventory.add(new Item("486006248998", "perfume", 58, 6.99));
        inventory.add(new Item("524311022137", "leg warmers", 71, 79.99));
        inventory.add(new Item("951001697196", "vase", 89, 12.99));
        inventory.add(new Item("592292105766", "scotch tape", 23, 29.99));
        inventory.add(new Item("509855762423", "bed", 10, 82.99));

        System.out.println("Original Array");
        printInventory(inventory);
        System.out.println("\nSorted by ID");
        printInventory(sortID(inventory, false));
        System.out.println("\nSorted by Name:");
        printInventory(sortName(inventory, false));
        System.out.println("\nSorted by Quantity");
        printInventory(sortQuantity(inventory, false));
        System.out.println("\nSorted by Price");
        printInventory(sortPrice(inventory, true));
    }

    public static void printInventory(ArrayList<Item> inventory) {
        System.out.printf("%-15s%-20s%-10s%s%n", "barcode", "itemName", "Quantity", "Price");
        System.out.println("------------------------------------------------------");

        for (Item item : inventory) {
            System.out.println(item);
        }
    }

    /**
     * Uses an insertion sort to sort a Item array by ID
     *
     * @param items     ArrayList of Item objects
     * @param reverse   Should the results be descending instead of ascending
     * @return          sorted array
     */
    public static ArrayList<Item> sortID(ArrayList<Item> items, boolean reverse) {
        return Sort.insert(items, 1, reverse);
    }

    /**
     * Uses an insertion sort to sort an Item array by name
     *
     * @param items     ArrayList of Item objects
     * @param reverse   Should the results be descending instead of ascending
     * @return          sorted array
     */
    public static ArrayList<Item> sortName(ArrayList<Item> items, boolean reverse) {
        return Sort.insert(items, 2, reverse);
    }

    /**
     * Uses an selection sort to sort a Item array by Quantity
     *
     * @param items     ArrayList of Item objects
     * @param reverse   Should the results be descending instead of ascending
     * @return          sorted array
     */
    public static ArrayList<Item> sortQuantity(ArrayList<Item> items, boolean reverse) {
        return Sort.selection(items, 3, reverse);
    }

    /**
     * Uses an merge sort to sort a Item array by Price
     *
     * @param items     ArrayList of Item objects
     * @param reverse   Should the results be descending instead of ascending
     * @return          sorted array
     */
    public static ArrayList<Item> sortPrice(ArrayList<Item> items, boolean reverse) {
        return Sort.merge(items, 4, reverse);
    }
}