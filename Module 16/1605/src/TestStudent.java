import java.util.ArrayList;
import java.util.List;
/**
 * Tests the Student Class
 *
 * @author Filip Kin
 * @version 2020-04-21
 */
public class TestStudent {
    public static void printBook(List<Student> gradebook) {
        System.out.printf("%-18s%10s%10s%10s%10s%10s%n", "Student Name", "Q1", "Q2", "Q3", "Q4", "Q5");
        System.out.println("-----------------------------------------------------------------------");
        for (Student s : gradebook) {
            System.out.println(s);
        }
    }

    public static void replaceName(List<Student> gradebook, String findName, String replaceName) {
        for (int i = 0; i < gradebook.size(); i++) {
            if (gradebook.get(i).getName().equals(findName)) {
                gradebook.get(i).setName(replaceName);
                break;
            }
        }
    }

    public static void replaceQuiz(List<Student> gradebook, String findName, int qzNum, int qzScore) {
        for (int i = 0; i < gradebook.size(); i++) {
            if (gradebook.get(i).getName().equals(findName)) {
                gradebook.get(i).setQuiz(qzNum, qzScore);
                break;
            }
        }
    }

    public static void replaceStudent(List<Student> gradebook, String findName, String replaceName, int qz1, int qz2, int qz3, int qz4, int qz5) {
        for (int i = 0; i < gradebook.size(); i++) {
            if (gradebook.get(i).getName().equals(findName)) {
                gradebook.get(i).setName(replaceName);
                gradebook.get(i).setQuiz(1, qz1);
                gradebook.get(i).setQuiz(2, qz2);
                gradebook.get(i).setQuiz(3, qz3);
                gradebook.get(i).setQuiz(4, qz4);
                gradebook.get(i).setQuiz(5, qz5);
                break;
            }
        }
    }

    public static void insertStudent(List<Student> gradebook, String beforeName, String insertName, int qz1, int qz2, int qz3, int qz4, int qz5) {
        for (int i = 0; i < gradebook.size(); i++) {
            if (gradebook.get(i).getName().equals(beforeName)) {
                gradebook.add(i, new Student(insertName, qz1, qz2, qz3, qz4, qz5));
                break;
            }
        }
    }

    public static void deleteStudent(List<Student> gradebook, String findName) {
        for (int i = 0; i < gradebook.size(); i++) {
            if (gradebook.get(i).getName().equals(findName)) {
                gradebook.remove(i);
                break;
            }
        }
    }

    public static void main(String args[]) {
        List<Student> myClass = new ArrayList<Student>();
        myClass.add(new Student("Fanny Kirschbaum", 71, 77, 79, 84, 87));
        myClass.add(new Student("Leida Calcagno", 86, 80, 60, 60, 92));
        myClass.add(new Student("Twana Christian", 92, 82, 67, 59, 64));
        myClass.add(new Student("Mary Newkirk", 59, 88, 77, 73, 86));
        myClass.add(new Student("Sharon Seth", 99, 100, 73, 50, 50));
        System.out.println("Starting Gradebook:\n");
        printBook(myClass);
        System.out.println("\nChanging Fanny Kirschbaum's name to Fanny Klatt:\n");
        replaceName(myClass, "Fanny Kirschbaum", "Fanny Klatt");
        printBook(myClass);
        System.out.println("\nChanging Twana Christian's quiz 1 score to 85:\n");
        replaceQuiz(myClass, "Twana Christian", 1, 85);
        printBook(myClass);
        System.out.println("\nReplacing Sharon Seth with William Desir: 58, 98, 91, 55, 94:\n");
        replaceStudent(myClass, "Sharon Seth", "William Desir  ", 58, 98, 91, 55, 94);
        printBook(myClass);
        System.out.println("\nInserting Lise Heitmann: 100, 53, 97, 82, 76 before Mary Newkirk:\n");
        insertStudent(myClass, "Mary Newkirk", "Lise Heitmann", 100, 53, 97, 82, 76);
        printBook(myClass);
        System.out.println("\nDeleting Leida Calcagno:\n");
        deleteStudent(myClass, "Leida Calcagno");
        printBook(myClass);
    }
}