/** 
 * Homework class using abstraction
 * 
 * @author Filip Kin
 * @version 2020-04-03
 */

public class MyEnglish extends Homework {
    public MyEnglish() {
        super();
    }

    public void createAssignment(int p) {
        setPagesRead(p);
        setType("English");
    }
}