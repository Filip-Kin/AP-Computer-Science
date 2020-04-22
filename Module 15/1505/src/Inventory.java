import java.util.ArrayList;
import java.util.List;

/**
 *  Implements classes that use the Product interface
 *
 * @author Filip Kin
 * @version 2020-04-21
 */
public class Inventory {

    public static void takeInventory(String name, List<Product> products) {
        int totalQ = 0;
        double totalC = 0;
        for (Product p : products) {
            if (p.getName().equals(name)) {
                totalQ++;
                totalC += p.getCost();
            }
        }
        System.out.println(name + ": Quantity = " + totalQ + ", Total cost = " + totalC);
    }

    public static void main(String[] args) {

        List<Product> products = new ArrayList<Product>();
        products.add(new Car("Ford Focus", 20000.00));
        products.add(new Car("Chevy Impala", 15000.00));
        products.add(new Car("Tesla Model 3", 43000.00));
        products.add(new Car("Tesla Model 3", 48000.00));
        products.add(new Truck("Ford F150", 25000.00));
        products.add(new Tool("Impact Driver", 79.99));
        Tool saw1 = new Tool("Circular Saw", 219.99); // Dewalt
        Tool saw2 = new Tool("Circular Saw", 59.99); // Chicago Powertools
        products.add(saw1); 
        products.add(saw2);

        takeInventory("Ford Focus", products);
        takeInventory("Chevy Impala", products);
        takeInventory("Tesla Model 3", products);
        takeInventory("Ford F150", products);
        takeInventory("Impact Driver", products);
        takeInventory("Circular Saw", products);
        if (saw1.compareTo(saw2) < 0)
            System.out.println("\nThe second saw is more expensive");
        else if (saw1.compareTo(saw2) > 0)
            System.out.println("\nThe first saw is more expensive");
        else
            System.out.println("\nThe saws are the same price");
    }
}
