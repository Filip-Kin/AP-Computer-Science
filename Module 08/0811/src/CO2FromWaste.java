/**
 * @author Filip Kin
 * @version 2019-11-21
 * Calculate CO2 footprint from waste
 */
public class CO2FromWaste {
    private int numPeople;
    private boolean paper, plastic, glass, cans;
    private double emissions, reduction, netEmissions;

    /**
     * Constructor for objects of type CO2FromWaste
     *
     * @param numPeople number of people in a household
     * @param paper     whether or not paper is recycled
     * @param plastic   whether or not plastic is recycled
     * @param glass     whether or not glass is recycled
     * @param cans      whether or not cans are recycled
     */
    CO2FromWaste(int numPeople, boolean paper, boolean plastic, boolean glass, boolean cans) {
        this.numPeople = numPeople;
        this.paper = paper;
        this.plastic = plastic;
        this.glass = glass;
        this.cans = cans;
    }

    /**
     * Mutator method to calculate the total emissions, without any recycling (no parameters)
     */
    public void calcGrossWasteEmission() {
        this.emissions = 1018 * this.numPeople;
    }

    /**
     * Mutator method to calculate the emission reduction from recycling (no parameters)
     */
    public void calcWasteReduction() {
        if (this.paper) this.reduction += 184.0;
        if (this.plastic) this.reduction += 25.6;
        if (this.glass) this.reduction += 46.6;
        if (this.cans) this.reduction += 165.8;
        this.reduction *= this.numPeople;
    }

    /**
     * Mutator method to calculate the net emissions (no parameters)
     */
    public void calcNetWasteReduction() {
        this.netEmissions = this.emissions - this.reduction;
    }

    /**
     * Getter method to return the number of people (no parameters)
     */
    public int getNumPeople() {
        return this.numPeople;
    }

    /**
     * Getter method to return paper's recycled status (true or false) (no parameters)
     */
    public boolean getPaper() {
        return this.paper;
    }

    /**
     * Getter method to return glass's recycled status (true or false) (no parameters)
     */
    public boolean getGlass() {
        return this.glass;
    }

    /**
     * Getter method to return plastic's recycled status (true or false) (no parameters)
     */
    public boolean getPlastic() {
        return this.plastic;
    }

    /**
     * Getter method to return cans' recycled status (true or false) (no parameters)
     */
    public boolean getCans() {
        return this.cans;
    }

    /**
     * Getter method to return the total emissions (no parameters)
     */
    public double getEmissions() {
        return this.emissions;
    }

    /**
     * Getter method to return the reduction amount (no parameters)
     */
    public double getReduction() {
        return this.reduction;
    }

    /**
     * Getter method to return the net emissions (no parameters)
     */
    public double getNetEmissions() {
        return this.netEmissions;
    }
}
