package starter;

public class Task {
	
	private String name;
	private int taskID;
	private boolean complete = false;
	
	 /**
     * constructor for Task
     * @param aName: task name
     * @param dueDate: date the task needs to be completed by
     */ 
	public Task(String pName, int pID) {
		name = pName;
		taskID = pID;
	}

    /**
     * Sets the task to completed
     */
    public void setToComplete() {
        complete = true;
    }
    
    public boolean isComplete() {
    	return complete;
    }
    
    public String getName() {
    	return name;
    }
    
    public int getID() {
    	return taskID;
    }
    
    
    
}
