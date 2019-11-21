/**
 * Name: Filip Kin
 * Version: 2019-11-20
 * Description: Find points on a circle with increments
 */

public class CirclePoints {
    public static void main(String[] args) {
        double radius = 1.0;
        double radiusSq = Math.pow(radius, 2);
        double increment = .0001; // Probably don't want increments any smaller than this because then you can't go far enough back in the output to see the top

        String iS =  Double.toString(Math.abs(increment));
        int accuracy = iS.length() - iS.indexOf('.'); // Automatically selects how many decimal places to keep based on increment

        System.out.println("Points on a Circle with the Radius of " + radius);
        System.out.println("      x1        y1        y2\n**********************************");
        for (double i = radius; i >= -radius; i -= increment) {
            System.out.printf("%10."+accuracy+"f", i);
            double y = Math.sqrt(radiusSq - Math.pow(i, 2));
            System.out.printf("%10."+accuracy+"f", y);
            System.out.printf("%10."+accuracy+"f%n", -y);
        }
    }
}
