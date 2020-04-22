/** 
 * Test the homework classes
 * 
 * @author Filip Kin
 * @version 2020-04-21
 */

import java.util.ArrayList;

public class testHomeworkV4 {
	public static void main(String[] args) {
		MyMathV4 m = new MyMathV4();
		m.createAssignment(5);
		
		MyScienceV4 s = new MyScienceV4();
		s.createAssignment(7);
		
		MyEnglishV4 e = new MyEnglishV4();
		e.createAssignment(9001);
		
		MyCSV4 j = new MyCSV4();
		j.createAssignment(1);
		
		
		ArrayList<HomeworkV4> hw = new ArrayList<HomeworkV4>();
		hw.add(m);
		hw.add(s);
		hw.add(e);
		hw.add(j);
		for(HomeworkV4 c : hw){
			System.out.println("\nBefore reading: " + c.toString());
			c.doAssignment((int) Math.ceil(c.getPagesToRead()/2.0)); // Read half the pages and round up
			System.out.println("After reading:  " + c.toString());
		}
		
        if (hw.get(0).compareTo(hw.get(1)) == 0) {
            System.out.println("\nThe homework for math and science are the same number of pages.");
		} else if (hw.get(0).compareTo(hw.get(1)) < 0) {
            System.out.println("\nThere is less math homework than science homework.");
		} else {
            System.out.println("\nThere is more math homework than science homework.");
		}
	}
}
