/** 
 * Homework class using abstraction
 * 
 * @author Filip Kin
 * @version 2020-04-21
 */

public class MyEnglishV4 extends HomeworkV4 {
    public MyEnglishV4() {
        super();
    }

    public void createAssignment(int p) {
        setPagesRead(p);
        setType("English");
    }

	public void doAssignment(int p) {
		setPagesRead(getPagesToRead()-p);
	}
}