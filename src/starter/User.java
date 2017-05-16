package starter;

public class User {
	
	private String name;
	private int userID;
	private int reliability;
	
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
	 * @param aID: user ID
     */
    public User (String aName, int aID) {
        this.name = aName;
        this.userID = aID;
    }

    /**
     * Allows user to complete a task
     * @param aTask: task that has been completed
     */
    public void completeTask(Task aTask) {
    	aTask.setToComplete();
    }

    public void setReliability(){
        reliability = 1;
    }
}
