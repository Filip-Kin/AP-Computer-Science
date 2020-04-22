/** 
 * Homework class using abstraction
 * 
 * @author Filip Kin
 * @version 2020-04-21
 */

public class MyCSV3 extends HomeworkV3 {
    public MyCSV3() {
		super();
    }
	
    public void createAssignment(int p) {
		setPagesRead(p);
		setType("Computer Science");
	}

	public void doAssignment(int p) {
		setPagesRead(getPagesToRead()-p);
	}
}