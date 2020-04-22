/**
 * Truck vehicle class
 * 
 * @author Filip Kin
 * @version 2020-04-21
 */

public class Truck extends Vehicle {
    Truck(String name, double cost) {
        super(name, cost);
    }

    public boolean testDrive() {
        return (Math.random() > .2); // 80% chance customer liked the ride
    }
}