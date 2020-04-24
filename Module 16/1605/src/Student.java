/**
 * Holds a student's name and grades.
 *
 * @author Filip Kin
 * @version 2020-04-21
 */
public class Student {
    private String name;
    private int qz1, qz2, qz3, qz4, qz5;

    public Student(String name, int qz1, int qz2, int qz3, int qz4, int qz5) {
        this.name = name;
        this.qz1 = qz1;
        this.qz2 = qz2;
        this.qz3 = qz3;
        this.qz4 = qz4;
        this.qz5 = qz5;
    }

    public int getQuiz(int qzNum) {
        switch (qzNum) {
            case 1: return qz1;
            case 2: return qz2;
            case 3: return qz3;
            case 4: return qz4;
            case 5: return qz5;
            default: return -1;
        }
    }

    public void setQuiz(int qzNum, int qzScore) {
        switch (qzNum) {
            case 1:
                qz1 = qzScore;
                break;
            case 2:
                qz2 = qzScore;
                break;
            case 3:
                qz3 = qzScore;
                break;
            case 4:
                qz4 = qzScore;
                break;
            case 5:
                qz5 = qzScore;
                break;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        System.out.printf("%-18s%10d%10d%10d%10d%10d", name + ":", qz1, qz2, qz3, qz4, qz5);
        return "";
    }
}