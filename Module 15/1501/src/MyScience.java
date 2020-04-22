/** 
 * Homework class using abstraction
 * 
 * @author Filip Kin
 * @version 2020-04-03
 */

public class MyScience extends Homework {
	public MyScience() {
		super();
	}
	
	public void createAssignment(int p) {
		setPagesRead(p);
		setType("Science");
	}
}