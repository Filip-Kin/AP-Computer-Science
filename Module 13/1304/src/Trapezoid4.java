/**
 * This class defines a Trapezoid object using
 * length, width, and short length.
 *
 * @author Filip Kin
 * @version 2020-03-13
 */

public class Trapezoid4 extends Rectangle4 {
    // instance variables
    private int shortLength;

    // Constructor for objects of class Rectangle
    public Trapezoid4(int l, int w, int s) {
        super(l, w);
        shortLength = s;
    }

    // return the short length
    public int getShortLength() {
        return shortLength;
    }

    /**
     * Returns string with dimensions of the trapezoid
     *
     * @return dimensions of trapezoid
     */
    public String toString() {
        return "Trapezoid - " + getLength() + " X " + getWidth() + " with a short side of " + getShortLength();
    }

    /**
     * Checks if two trapezoids are equal
     *
     * @param obj
     * @return equality
     */
   public boolean equals(Object obj) {
       if (!(obj instanceof Trapezoid4)) return false;
       Trapezoid4 t = (Trapezoid4) obj;
       return (getLength() == t.getLength()) && (getWidth() == t.getWidth()) && (getShortLength() == t.getShortLength());
   }
}