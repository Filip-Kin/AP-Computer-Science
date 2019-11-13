/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 *
 * @author Filip Kin
 * @version 2019-09-12
 */
public class CalculationsV6 {
    public static void main(String[] args) {
        // Addition
        System.out.println("Addition");
        int addNum1 = 25, addNum2 = 9;
        System.out.println(addNum1+" + "+addNum2+" = " + (addNum1 + addNum2));
        double addDoub1 = 43.21, addDoub2 = 3.14, addDoub3 = 10.0;
        System.out.println(addDoub1+" + "+addDoub2+" + "+addDoub3+" = " + (addDoub1 + addDoub2 + addDoub3));
        System.out.println();

        // Subtraction
        System.out.println("Subtraction");
        int subtractNum1 = 11, subtractNum2 = 9, subtractNum3 = 25;
        System.out.println(subtractNum1+" - "+subtractNum2+" - "+subtractNum3+" = " + (subtractNum1 - subtractNum2 - subtractNum3));
        double subtractDoub1 = 3.14, subtractDoub2 = 10.0;
        System.out.println(subtractDoub1+" - "+subtractDoub2+" = " + (subtractDoub1 - subtractDoub2));
        System.out.println();

        // Multiplication
        System.out.println("Multiplication");
        int multiplyNum1 = 25, multiplyNum2 = 9;
        System.out.println(multiplyNum1+" * "+multiplyNum2+" = " + (multiplyNum1 * multiplyNum2));
        double multiplyDoub1 = 3.14, mutliplyDoub2 = 10.0, multiplyDoub3 = 10.0;
        System.out.println(multiplyDoub1+" * "+mutliplyDoub2+" * "+multiplyDoub3+" = " + (multiplyDoub1 * mutliplyDoub2 * multiplyDoub3));
        System.out.println();

        // Division
        System.out.println("Division");
        int divideNum1 = 9, divideNum2 = 25;
        System.out.println(divideNum1+" / "+divideNum2+" = " + (divideNum1 / divideNum2));
        double divideDoub1 = 43.21, divideDoub2 = 10.0;
        System.out.println(divideDoub1+" / "+divideDoub2+" = " + (divideDoub1 / divideDoub2));
        System.out.println();

        // Modulus operator
        System.out.println("Modulus");
        int modNum1 = 11, modNum2 = 9;
        System.out.println(modNum1+" % "+modNum2+" = " + (modNum1 % modNum2));
        double modDoub1 = 10.0, modDoub2 = 3.14;
        System.out.println(modDoub1+" % "+modDoub2+" = " + (modDoub1 % modDoub2));
        System.out.println();

        // 2.03 Additional int Equations
        System.out.println("Additional Integer Equations");
        int aNum1 = 12, aNum2 = 6, aNum3 = 3;
        System.out.println(aNum1+" % "+aNum2+" / "+ aNum3+" = "+(aNum1%aNum2/aNum3));
        int bNum1 = 8, bNum2 = 16, bNum3 = 8;
        System.out.println(bNum1+" - "+bNum2+" + "+ bNum3+" = "+(bNum1-bNum2+bNum3));
        int cNum1 = 4, cNum2 = 12, cNum3 = 30;
        System.out.println(cNum1+" / "+cNum2+" * "+ cNum3+" = "+(cNum1/cNum2*cNum3));
        System.out.println();

        //2.04 Additional double Equations
        System.out.println("Additional Double Equations");
        double aDoub1 = 12.2, aDoub2 = 6.2, aDoub3 = 3.8;
        System.out.println(aDoub1+" % "+aDoub2+" / "+ aDoub3+" = "+(aDoub1%aDoub2/aDoub3));
        double bDoub1 = 8.05, bDoub2 = 16.1, bDoub3 = 8.9;
        System.out.println(bDoub1+" - "+bDoub2+" + "+ bDoub3+" = "+(bDoub1-bDoub2+bDoub3));
        double cDoub1 = 4.6, cDoub2 = 12.8, cDoub3 = 3.0;
        System.out.println(cDoub1+" / "+cDoub2+" * "+ cDoub3+" = "+(cDoub1/cDoub2*cDoub3));

        int p = (int)3.14*10;
        System.out.println(p);

    } // end of main method
} // end of class
