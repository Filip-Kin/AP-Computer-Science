/**
 * @purpose A single tomato, thrown, possibly at a bad comedian... like me
 * @author Filip Kin
 * @version 2019-11-21
 */

public class Tomato {
    // Using word toss instead of throw because throwing stuff is violent and I don't want to be demonitized
    private double initialVelocity, angleOfToss, distance; // In meters of course because #SIUnitMasterRace

    /**
     * Toss a tomato
     * @param initialVelocity   MPH
     * @param angleOfToss       degrees from +X
     */
    Tomato(int initialVelocity, int angleOfToss) {
        this.initialVelocity = initialVelocity/2.237;
        this.angleOfToss = Math.toRadians(angleOfToss);
    }

    /**
     * Do the math
     */
    void calculateDistance() {
        distance = (Math.pow(initialVelocity, 2)*Math.sin(angleOfToss))/9.8;
    }

    /**
     * Get distance of toss in meters
     * @return  distance of toss in meters
     */
    public double getd() {
        return distance;
    }

    /**
     * Get initial velocity in m/s
     * @return  initial velocity in m/s
     */
    public double getv() {
        return initialVelocity;
    }

    /**
     * Get angle of throw in radians
     * @return  angle of throw in radians
     */
    public double geta() {
        return angleOfToss;
    }
}
