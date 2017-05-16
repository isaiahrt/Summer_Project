package starter;

public class User {
	
	private String name;
	private int userID;
	
	public String getName() {
		return name;
	}
	
	public int getID() {
		return userID;
	}
	
	public void getTasks() {
		
	}

    /**
     * Constructor for user
     * @param aName: name of the user
     */
    public User (String aName) {
        this.name = aName;
    }

    /**
     * Allows user to complete a task
     * @param aTask: task that has been completed
     */
    public void completeTask(Task aTask) {
    	aTask.setToComplete();
    }
}
