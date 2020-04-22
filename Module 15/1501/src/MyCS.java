/** 
 * Homework class using abstraction
 * 
 * @author Filip Kin
 * @version 2020-04-03
 */

public class MyCS extends Homework {
    public MyCS() {
		super();
    }
	
    public void createAssignment(int p) {
		setPagesRead(p);
		setType("Computer Science");
	}
}