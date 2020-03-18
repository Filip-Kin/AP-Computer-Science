/**
 * This class defines a Rectangle object using
 * length and width.
 *
 * @author Poly Morphism
 * @version 06/13/17
 */

public class Rectangle4 {
    // instance variables
    private int length;
    private int width;

    // Constructor for objects of class Rectangle
    public Rectangle4(int l, int w) {
        // initialize instance variables
        length = l;
        width = w;
    }

    // return the height
    public int getLength() {
        return length;
    }

    // return the width
    public int getWidth() {
        return width;
    }

    /**
     * Returns string with dimensions of the rectangle
     *
     * @return dimensions of rectangle
     */
    public String toString() {
        return "Rectangle - " + getLength() + " X " + getWidth();
    }
    
    /**
     * Checks if two rectangles are equal
     *
     * @param obj
     * @return equality
     */
   public boolean equals(Object obj) {
       if (!(obj instanceof Rectangle4) || (obj instanceof Trapezoid4)) return false;
       Rectangle4 r = (Rectangle4) obj;
       return (getLength() == r.getLength()) && (getWidth() == r.getWidth());
   }
}