package starter;

public class Task {
	
	private String name;
	private int taskID;
	private boolean complete = false;
	private int desirability;
	
	 /**
     * constructor for Task
     * @param pName: task name
     * @param pID: taskID
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

    public void setDesirability(){
    	desirability = 1;
	}
    
    
}
