import java.util.ArrayList;

/**
 * Tests the super shapes
 * 
 * @author Filip Kin
 * @version 2020-03-13
 */

class Test {
    public static void main(String[] args) {
        ArrayList<Rectangle4> array = new ArrayList<Rectangle4>();

        array.add(new Rectangle4(12, 20));
        array.add(new Box4(4, 4, 4));
        array.add(new Box4(12, 20, 8));
        array.add(new Cube4(4));
        array.add(new Trapezoid4(12, 20, 8));
        array.add(new TrapezoidalPrism4(23, 13, 20, 20));
        showEffectBoth(array.get(0));
        showEffectBoth(array.get(1));
        showEffectBoth(array.get(2));
        showEffectBoth(array.get(3));
        showEffectBoth(array.get(4));
        showEffectBoth(array.get(5));
        showEffectBoth(array.get(1), array.get(3));
        showEffectBoth(array.get(0), array.get(2));
        showEffectBoth(array.get(0), array.get(4));
    }

    /**
     * Prints the dimensions of a Rectangle using polymorphism and overriding.
     *
     * @param r Rectangle4 object
     */
    public static void showEffectBoth(Rectangle4 r) {
        System.out.println(r.toString());
    }
    
    /**
    * Prints the dimensions of two Rectangles and compares them.
    *
    * @param r1 First Rectangle4 object
    * @param r2 Second Rectangle4 object
    */
   public static void showEffectBoth(Rectangle4 r1, Rectangle4 r2) {
       if (r1.equals(r2)) {
           System.out.println(r1 + " is the same size as " + r2);
       }
       else {
           System.out.println(r1 + " is not the same size as " + r2);
       }
   }
}