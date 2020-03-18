/**
 * This class defines a Trapezoidal prism object using
 * length, width, short length, and height.
 *
 * @author Filip Kin
 * @version 2020-03-13
 */

public class TrapezoidalPrism4 extends Trapezoid4 {
    // instance variables
    private int height;

    // Constructor for objects of class Rectangle
    public TrapezoidalPrism4(int l, int w, int s, int h) {
        super(l, w, s);
        height = h;
    }

    // return the height
    public int getHeight() {
        return height;
    }

    /**
     * Returns string with dimensions of the trapezoid
     *
     * @return dimensions of trapezoid
     */
    public String toString() {
        return "Trapezoidal Prism - " + getLength() + " X " + getWidth() + " X " + getHeight() + " with a short side of " + getShortLength();
    }
}