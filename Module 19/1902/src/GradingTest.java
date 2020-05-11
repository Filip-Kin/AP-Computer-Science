import java.util.ArrayList;

/**
 * Tests the Student class
 * 
 * @author Filip Kin
 * @version 2020-04-24
 */

public class GradingTest {
    public static void main(String[] args) {
        ArrayList<Grading> students = new ArrayList<Grading>();

        // The good ones
        students.add(new Grading("Mariah", "Padilla", new double[] { 87.79, 98.34, 73.39, 96.09, 89.96, 94.34 }));
        students.add(new Grading("Todd", "Romero", new double[] { 76.64, 82.86, 69.08, 44.36, 61.16 }));
        students.add(new Grading("Calum", "Lees", new double[] { 76.48, 100.00, 92.95, 89.82, 99.22, 96.04, 74.08 }));
        students.add(new Grading("Keelan", "Allan", new double[] { 93.19, 88.80, 81.10, 88.43, 100.00, 97.06 }));
        students.add(new Grading("Harvie", "Mcdaniel", new double[] { 100.00, 85.56, 95.00, 92.00, 89.54, 90.98, 100.00 }));

        // These will cause errors
        //students.add(new Student("", "Koch", new double[] { 83.24, 84.55, 80.42, 71.50, 92.02, 85.65 }));
        //students.add(new Student("Sacha", "", new double[] { 89.37, 91.29, 75.49, 95.97, 98.96, 97.87 }));
        //students.add(new Student("Kieren", "Odom", new double[] {}));

        printStudents(students);
    }

    public static void printStudents(ArrayList<Grading> students) {
        for (Grading s : students) {
            System.out.println(s.toString());
        }
    } 
}