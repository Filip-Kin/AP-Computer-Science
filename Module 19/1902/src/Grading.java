/**
 * Stores information about student grades
 * 
 * @author Filip Kin
 * @version 2020-04-24
 */

public class Grading {
    private String firstName, lastName, letterGrade;
    private double[] scores;
    private double averageScore;
    public static final String[] LETTER_GRADES = { "A",  "A-", "B+", "B",  "B-", "C+", "C",  "C-", "D+", "D",  "D-", "F" };
    public static final double[] LETTER_VALUES = { 93.0, 90.0, 87.0, 83.0, 80.0, 77.0, 73.0, 70.0, 67.0, 63.0, 60.0, 0.0 };

    Grading(String firstName, String lastName, double[] scores) {
        setFirstName(firstName);
        setLastName(lastName);
        setScores(scores);
        calculateLetterGrade();
    }

    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        if (firstName.length() < 1) throw new IllegalArgumentException("First name cannot be empty");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        if (lastName.length() < 1) throw new IllegalArgumentException("Last name cannot be empty");
        this.lastName = lastName;
    }

    public String getLetterGrade() {
        return letterGrade;
    }
    
    public void calculateAverageScore() {
        double total = 0.0;
        for (double s : scores) {
            total += s;
        }
        averageScore = total/scores.length;
    }

    public void calculateLetterGrade() {
        calculateAverageScore();
        for (int i = 0; i < LETTER_VALUES.length; i++) {
            if (LETTER_VALUES[i] <= averageScore) {
                letterGrade = LETTER_GRADES[i];
                break;
            }
        }
    }

    public double[] getScores() {
        return scores;
    }
    
    public void setScores(double[] scores) {
        if (scores.length < 1) throw new IllegalArgumentException("Scores array cannot be empty");
        this.scores = scores;
    }

    public String scoresToString() {
        StringBuilder out = new StringBuilder();
        for (double i : scores) {
            out.append(String.format("%7.2f", i));
        }
        return out.toString();
    }

    public String toString() {
        calculateLetterGrade();
        return String.format("%-10s %-10s - %-3s:%s", firstName, lastName, letterGrade, scoresToString());
    }
}   

