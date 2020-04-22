/**
 * Car vehicle class
 * 
 * @author Filip Kin
 * @version 2020-04-21
 */

public class Car extends Vehicle {
    Car(String name, double cost) {
        super(name, cost);
    }

    public boolean testDrive() {
        return (Math.random() > .4); // 60% chance customer liked the ride
    }
}