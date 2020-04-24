/**
 * Item object for store
 * 
 * @author Filip Kin
 * @version 2020-04-23
 */

public class Item {
    private String barcode;
    private String itemName;
    private int quantity;
    private double price;

    public Item(String barcode, String itemName, int Quantity, double price) {
        this.barcode = barcode;
        this.itemName = itemName;
        this.quantity = Quantity;
        this.price = price;
    }

    public String toString() {
        return String.format("%-15s%-20s%-10d%-1s%-6.2f", barcode, itemName, quantity, "$", price);
    }

    /**
     * @return the barcode
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * @param barcode the barcode to set
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the Quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the Quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
}