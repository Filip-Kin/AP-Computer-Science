/**
 * abstract vehicle class
 * 
 * @author Filip Kin
 * @version 2020-04-21
 */

public abstract class Vehicle implements Product {
    public String name;
    public double cost;

    Vehicle(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public abstract boolean testDrive();
}