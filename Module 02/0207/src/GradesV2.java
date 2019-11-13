/**
 * The purpose of this program is to count the number of
 * tests completed and get an average score of all of them.
 *
 * @author Filip Kin
 * @version 2019-09-19
 */
public class GradesV2 {
    public static void main(String[ ] args)
    {
        //Local variables
        int numTests = 0; //Counts number of tests
        int testGrade = 0; //Individual test grade
        int totalPoints = 0; //Total points for all tests
        double average = 0.0; //Average Grade

        testGrade = 95;
        numTests++; //Increment test number
        totalPoints += testGrade; //Add grade to total
        average = totalPoints / (double)numTests; //Calculate average (cast to double for more accuracy)
        System.out.println("Test #"+numTests+"\tGrade: "+testGrade+"\tTotal: "+totalPoints+"\tAverage: "+average); //Print

        testGrade = 73;
        numTests++;
        totalPoints += testGrade;
        average = totalPoints / (double)numTests;
        System.out.println("Test #"+numTests+"\tGrade: "+testGrade+"\tTotal: "+totalPoints+"\tAverage: "+average);

        testGrade = 91;
        numTests++;
        totalPoints += testGrade;
        average = totalPoints / (double)numTests;
        System.out.println("Test #"+numTests+"\tGrade: "+testGrade+"\tTotal: "+totalPoints+"\tAverage: "+average);

        testGrade = 82;
        numTests++;
        totalPoints += testGrade;
        average = totalPoints/numTests;
        System.out.println("Test #"+numTests+"\tGrade: "+testGrade+"\tTotal: "+totalPoints+"\tAverage: "+average);

        testGrade = 35;
        numTests++;
        totalPoints += testGrade;
        average = totalPoints/numTests;
        System.out.println("Test #"+numTests+"\tGrade: "+testGrade+"\tTotal: "+totalPoints+"\tAverage: "+average);

        testGrade = 98;
        numTests++;
        totalPoints += testGrade;
        average = totalPoints/numTests;
        System.out.println("Test #"+numTests+"\tGrade: "+testGrade+"\tTotal: "+totalPoints+"\tAverage: "+average);

        testGrade = 87;
        numTests++;
        totalPoints += testGrade;
        average = totalPoints/numTests;
        System.out.println("Test #"+numTests+"\tGrade: "+testGrade+"\tTotal: "+totalPoints+"\tAverage: "+average);

        testGrade = 74;
        numTests++;
        totalPoints += testGrade;
        average = totalPoints/numTests;
        System.out.println("Test #"+numTests+"\tGrade: "+testGrade+"\tTotal: "+totalPoints+"\tAverage: "+average);
    }//end of main method
}//end of class