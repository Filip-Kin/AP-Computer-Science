/**
 * Extends the box class to create a cube that always has the same width, height, and length
 *
 * @author Filip Kin
 * @version 2020-03-13
 */
public class Cube4 extends Box4 {

    /**
     * Constructor for Cube4
     * 
     * d Dimension of all lengths
     */
    public Cube4(int d) {
        super(d, d, d);
    }

    /**
     * Returns string with dimensions of the cube
     *
     * @return dimensions of cube
     */
    public String toString() {
        return "Cube - " + getLength() + " X " + getWidth() + " X " + getHeight();
    }

}