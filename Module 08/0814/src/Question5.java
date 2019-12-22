public class Question5 {
    public static void main(String[] args) {

        int diameter = 5;
        double radius = 2.5;
        CircleStats cStats = new CircleStats();

        System.out.println("The circumference = " + cStats.calcCircleCircumf(diameter));
        System.out.println("The circumference = " + cStats.calcCircleCircumf(radius));

    }
}

class CircleStats {
    public CircleStats() {
    }

    /**
     * Calculate circle circumfrence from diameter
     * @param diameter  diameter of circle
     * @return          circumfrence of circle
     */
    public double calcCircleCircumf(int diameter) {
        return Math.PI*diameter;
    }

    /**
     * Calculate circle circumfrence from radius
     * @param radius    radius of circle
     * @return          circumfrence of circle
     */
    public double calcCircleCircumf(double radius) {
        return Math.PI*2*radius;
    }
}
