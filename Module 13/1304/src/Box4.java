/**
 * This class defines a Box object by extending
 * Rectangle and includes height.
 *
 * @author Poly Morphism
 * @version 06/13/17
 */

public class Box4 extends Rectangle4 {
    // instance variables
    private int height;

    // Constructor for objects of class Box
    public Box4(int l, int w, int h) {
        // call superclass
        super(l, w);

        // initialize instance variables
        height = h;
    }

    // return the height
    public int getHeight() {
        return height;
    }

    /**
     * Returns string with dimensions of the box
     *
     * @return dimensions of box
     */
    public String toString() {
        return "Box - " + getLength() + " X " + getWidth() + " X " + getHeight();
    }

    /**
     * Checks if two boxes are equal
     *
     * @param obj
     * @return equality
     */
    public boolean equals(Object obj) {
        if (!(obj instanceof Box4)) return false;
        Box4 b = (Box4) obj;
        return (getLength() == b.getLength()) && (getWidth() == b.getWidth()) && (getHeight() == b.getHeight());
    }
}