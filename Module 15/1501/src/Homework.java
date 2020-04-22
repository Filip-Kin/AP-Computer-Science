/** 
 * Homework class using abstraction
 * 
 * @author Filip Kin
 * @version 2020-04-03
 */

public abstract class Homework {
    private int pages;
    private String typeHomework;
    
    /**
     * Default constructor for all Homework
     */
    public Homework() {
        pages = 0;
        typeHomework = "None";
    }
    
    /**
     * Get pages to read
     * 
     * @return  Pages read
     */
    public int getPagesRead() {
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
     * @param pages Pages to read
     */
    public abstract void createAssignment(int pages);
}
