package starter;

public class Task {
	
	private String aName;
	private int dueDate;
	private String aNotes;
	
	private boolean aComplete;
	
	public Task(String pName) {
		aName = pName;
		aComplete = false;
		
	}
	
	public void print() {
		if(!aComplete) {
			System.out.println("0: " + aName);
		}
		else {
			System.out.println("X: " + aName);
		}
	}

	public void complete() {
		aComplete = true;
		
	}
	private boolean complete;


    /**
     * constructor for Task
     * @param aName: task name
     * @param dueDate: date the task needs to be completed by
     */
	public Task(String aName, int dueDate) {
	    this.aName = aName;
	    this.dueDate = dueDate;
	    aNotes = "";
	    complete = false;
    }

    /**
     * Adds a note to be associated with a task
     * @param myNote: note to be added to task
     */

    public void addNote(String myNote) {
        int noteNumber = 0;
        aNotes = aNotes + "Note " + noteNumber + ": " + myNote;
        noteNumber++;
    }

    /**
     * Sets the task to completed
     */
    public void setComplete() {
        complete = true;
    }
}
