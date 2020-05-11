public class Test {
    public static void main(String[] args) {
        int x = 0;
        int y = 6;

        while ((y != 0) && (x / y >= 0)) {
            x += 1;
            y -= 2;
        }
        System.out.println("x=" + x + " y=" + y);
        /*
        int[] numGames = new int[10];
        int[] totalPoints = new int[10];
        System.out.println(totalPoints[10]);
        */
        //String test;
        //System.out.println(test.length());
    }
}