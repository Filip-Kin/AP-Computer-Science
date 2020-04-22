/** 
 * Homework class using abstraction
 * 
 * @author Filip Kin
 * @version 2020-04-21
 */

public class MyScienceV4 extends HomeworkV4 {
	public MyScienceV4() {
		super();
	}
	
	public void createAssignment(int p) {
		setPagesRead(p);
		setType("Science");
	}
    
	public void doAssignment(int p) {
		setPagesRead(getPagesToRead()-p);
	}
}