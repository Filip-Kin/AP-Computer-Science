/** 
 * Test the homework classes
 * 
 * @author Filip Kin
 * @version 2020-04-21
 */

import java.util.ArrayList;

public class testHomeworkV3 {
	public static void main(String[] args) {
		MyMathV3 m = new MyMathV3();
		m.createAssignment(5);
		
		MyScienceV3 s = new MyScienceV3();
		s.createAssignment(7);
		
		MyEnglishV3 e = new MyEnglishV3();
		e.createAssignment(9001);
		
		MyCSV3 j = new MyCSV3();
		j.createAssignment(1);
		
		
		ArrayList<HomeworkV3> hw = new ArrayList<HomeworkV3>();
		hw.add(m);
		hw.add(s);
		hw.add(e);
		hw.add(j);
		for(HomeworkV3 c : hw){
			System.out.println("\nBefore reading: " + c.toString());
			c.doAssignment((int) Math.ceil(c.getPagesToRead()/2.0)); // Read half the pages and round up
			System.out.println("After reading:  " + c.toString());
		}	
	}
}
