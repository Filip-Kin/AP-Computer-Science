/** 
 * Homework class using abstraction
 * 
 * @author Filip Kin
 * @version 2020-04-21
 */

public class MyScienceV3 extends HomeworkV3 {
	public MyScienceV3() {
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