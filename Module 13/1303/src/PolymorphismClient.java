import java.util.ArrayList;

/**
 * Tests the circle classes
 * 
 * @author Filip Kin
 * @version 2020-03-13
 */
class PolymorphismClient {
    public static void main (String[] args) {
        ArrayList<Circle2> array = new ArrayList<Circle2>();

        array.add(new Circle2(2, 4, 3));
        array.add(new Cylinder2(10, 15, 3, 20));
        array.add(new Oval2(25, 10, 5, 7));
        array.add(new OvalCylinder2(40, 10, 7, 9, 25));
        
        for (Circle2 circle : array) {
            showCenter(circle);
        }
    }

    /**
     * Prints out the center for any subclass of Circle2
     *
     * @param c Circle2 Object
     */
    public static void showCenter(Circle2 c) {
        System.out.println("For this " + c.getName() + " the " + c.getCenter());
    }

}