public class Question2 {
    public static void main(String[] args) {
        double[ ] a1 = new double[5];
        double[ ] a2 = new double[5];
        // Assume that there is code here that prompts the user to enter these double
        // values and stores them in a1 and a2. You don't know what the user will type, but
        // you may assume that the code is correct and no errors occur in this portion of the program.

        // Complete your code below this line

        double[] a3 = new double[a1.length];

        for (int i = 0; i < a1.length; i++) {
            a3[i] = a1[i] + a2[i];
        }

    }
}
