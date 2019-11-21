/**
 * This class simplifies the calculation of CO2 footprint
 * It contains mutator methods to calculate tons to pounds and tons of CO2
 * It contains getter methods to get gallons, tons of CO2 and pounds of CO2
 * Private instance variables include myGallonsUsed, myTonsCO2, myPoundsCO2
 *
 * @author Filip Kin
 * @version 2019-11-21
 */
public class CO2FootprintV2 {
    private double myGallonsUsed, myTonsCO2, myPoundsCO2;

    /**
     * Calculate your CO2 footprint
     * @param gallons   gallons of CO2 produced
     */
    CO2FootprintV2(double gallons)
    {
        myGallonsUsed = gallons;
    }

    /**
     * Convert gallons to tons
     */
    public void calcTonsCO2()
    {
        myTonsCO2 = (8.78 * Math.pow(10, -3)) * myGallonsUsed;
    }

    /**
     * Convert tons to pounds
     */
    public void convertTonsToPounds()
    {
        myPoundsCO2 = myTonsCO2 * 2205;
    }

    /**
     * Gallons getter
     * @return  Gallons of CO2
     */
    public double getGallons()
    {
        return myGallonsUsed;
    }

    /**
     * Tons getter
     * @return  Tons of CO2
     */
    public double getTonsCO2()
    {
        return myTonsCO2;
    }

    /**
     * Pounds getter
     * @return  Pounds of CO2
     */
    public double getPoundsCO2()
    {
        return myPoundsCO2;
    }
}

