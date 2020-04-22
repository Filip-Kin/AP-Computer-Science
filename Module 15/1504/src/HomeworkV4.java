/** 
 * Homework class using abstraction
 * 
 * @author Filip Kin
 * @version 2020-04-21
 */

interface Processing {
    /** Do homework assignment
     * 
     * @param pages Number of pages to read
     */
    public void doAssignment(int pages);
}



public abstract class HomeworkV4 implements Processing, Comparable<HomeworkV4> {
    private int pages;
    private String typeHomework;
    
    /**
     * Default constructor for all Homework
     */
    public HomeworkV4() {
        pages = 0;
        typeHomework = "None";
    }
    
    /**
     * Get pages to read
     * 
     * @return  Pages read
     */
    public int getPagesToRead() {
        return pages;
    }
        
    /**
     * Set pages to read
     * 
     * @param pages Pages read
     */
    public void setPagesRead(int pages) {
        this.pages = pages;
    }
    
    /**
     * Get type of homework
     * 
     * @return  Type of homework
     */
    public String getType() {
        return typeHomework;
    }
    
    /**
     * Set type of homework
     * 
     * @param type  Type of homework
     */
    public void setType(String type) {
        typeHomework = type;
    }
    
    public String toString() {
        return typeHomework + " Need to read " + pages + " pages ";
    }

    /**
     * Create assignment with p number of pages to read
     * 
     * @param pages Number of pages to read
     */
    public abstract void createAssignment(int pages);

    public int compareTo(HomeworkV4 hw) {
        return this.pages - hw.getPagesToRead();
    }
}
