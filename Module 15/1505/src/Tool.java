/**
 * abstract tool class
 * 
 * @author Filip Kin
 * @version 2020-04-21
 */

public class Tool implements Product, Comparable<Tool> {
    public String name;
    public double cost;

    Tool(String name, double cost) {
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

    public int compareTo(Tool t) {
        double difference = this.cost - t.getCost();
        if (difference < 0.0) {
            return -1;
        } else if (difference > 0.0) {
            return 1;
        } else {
            return 0;
        }
    }
}