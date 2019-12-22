import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {
        System.out.println(isAcute(1, 2, 3));
        System.out.println(isAcute(2, 2, 2));
    }

    // precondition: the three sides make a triangle
    public static boolean isAcute(int side1, int side2, int side3) {
        int[] sides = {side1, side2, side3};
        int[] temp = new int[3];
        if (sides[1] < sides[0]) {
            temp[0] = sides[0];
            sides[0] = sides[1];
            sides[1] = temp[0];
        }

        if (sides[2] < sides[1]) {
            temp[0] = sides[1];
            sides[1] = sides[2];
            sides[2] = temp[0];

            if (sides[1] < sides[0]) {
                temp[0] = sides[0];
                sides[0] = sides[1];
                sides[1] = temp[0];
            }
        }
        return Math.pow(sides[2], 2) < Math.pow(sides[1], 2)+Math.pow(sides[0], 2);
    }
}
