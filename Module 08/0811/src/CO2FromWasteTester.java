/**
 * @purpose: Calculate CO2 footprint from waste with randomly generated data
 * @author Filip Kin
 * @version 2019-11-21
 */

import java.util.ArrayList;

public class CO2FromWasteTester {
    public static void main(String[] args) {
        ArrayList<CO2FromWaste> households = new ArrayList<CO2FromWaste>();
        for (int i = 0; i < 50; i++) { // randomly generate 10 households
            households.add(new CO2FromWaste((int) (Math.random()*7)+1,
                    Math.random()>.5,
                    Math.random()>.5,
                    Math.random()>.5,
                    Math.random()>.5));
        }

        for (CO2FromWaste h : households) {
            h.calcGrossWasteEmission();
            h.calcWasteReduction();
            h.calcNetWasteReduction();
        }

        System.out.println("|       |        |                                 |             Pounds of CO2             |");
        System.out.println("|       |        |    Household Waste Recycled     |   Total    |             |     Net    |");
        System.out.println("| Index | People | Paper | Plastic | Glass |  Cans |  Emission  |  Reduction  |  Emission  |");
        System.out.println("|-------|--------|-------|---------|-------|-------|------------|-------------|------------|");

        CO2FromWaste h;

        for (int i = 0; i < households.size(); i++) {
            h = households.get(i);
            System.out.printf("|%4d   |", i);
            System.out.printf("%5d   |", h.getNumPeople());
            System.out.printf("%6b |", h.getPaper());
            System.out.printf("%7b  |", h.getPlastic());
            System.out.printf("%6b |", h.getGlass());
            System.out.printf("%6b |", h.getCans());
            System.out.printf("%10.2f  |", h.getEmissions());
            System.out.printf("%11.2f  |", h.getReduction());
            System.out.printf("%10.2f  |%n", h.getNetEmissions());
        }
    }
}
