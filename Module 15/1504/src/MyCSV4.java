/** 
 * Homework class using abstraction
 * 
 * @author Filip Kin
 * @version 2020-04-21
 */

public class MyCSV4 extends HomeworkV4 {
    public MyCSV4() {
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