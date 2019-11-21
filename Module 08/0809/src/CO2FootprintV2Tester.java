/**
 * Demo the CO2FootprintV2 class
 *
 * @author Filip Kin
 * @version 2019-11-21
 */
public class CO2FootprintV2Tester
{
    public static void main(String[] args)
    {
        double gallonsOfGas = 2410; // My CO2 consumption in gallons

        CO2FootprintV2 footprint = new CO2FootprintV2(gallonsOfGas); // construct class then convert
        footprint.calcTonsCO2();
        footprint.convertTonsToPounds();

        System.out.println("           CO2 Emissions");
        System.out.println("  Gallons   Pounds      Tons");
        System.out.println("  of Gas   from Gas   from Gas");
        System.out.println("  ****************************");
        System.out.printf("  %6.1f   %8.2f    %6.3f", footprint.getGallons(), // Get each unit of CO2
                                                      footprint.getPoundsCO2(),
                                                      footprint.getTonsCO2());

        System.out.println();
    }
}

