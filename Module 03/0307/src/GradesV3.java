import java.util.Scanner;

/**
 * The purpose of this program is to count the number of
 * tests completed and get an average score of all of them.
 *
 * @author Filip Kin
 * @version 2019-10-04
 */
public class GradesV3 {
    public static void main(String[ ] args)
    {
        //Local variables
        int numTests = 0; //Counts number of tests
        int testGrade = 0; //Individual test grade
        int totalPoints = 0; //Total points for all tests
        double average = 0.0; //Average Grade
        int[] grades = new int[3];
        Scanner in = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = in.nextLine();
        System.out.print("Enter student's grade: ");
        String grade = in.nextLine();
        System.out.print("Enter class: ");
        String className = in.nextLine();

        System.out.print("Enter first test grade: ");
        testGrade = in.nextInt();
        numTests++; //Increment test number
        totalPoints += testGrade; //Add grade to total
        grades[0] = testGrade;

        System.out.print("Enter second test grade: ");
        testGrade = in.nextInt();
        numTests++;
        totalPoints += testGrade;
        grades[1] = testGrade;

        System.out.print("Enter third test grade: ");
        testGrade = in.nextInt();
        numTests++;
        totalPoints += testGrade;
        average = totalPoints / (double)numTests;
        grades[2] = testGrade;


        System.out.println("----------");
        System.out.println("Student name: "+name);
        System.out.println("Grade: "+grade);
        System.out.println("Class: "+className);
        System.out.println("-----");
        System.out.println("Test Scores");
        for (int i=0; i<3; i++) {
            System.out.println("Test #"+(i+1)+"\tGrade: "+grades[i]);
        }
        System.out.println("-----");
        System.out.println("Average: "+average);
        System.out.println("----------");
    }//end of main method
}//end of class