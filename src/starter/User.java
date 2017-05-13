package starter;

import java.util.ArrayList;

public class User {
	
	private String aName;
	private ArrayList<Task> aTaskList = new ArrayList<Task>();

    /**
     * Constructor for user
     * @param aName: name of the user
     */
    public User (String aName) {
        this.aName = aName;
    }

    /**
     * @param myTask: task to be added to aTaskList
     */
    public void addTaskToList (Task myTask) {
        aTaskList.add(myTask);
    }

    /**
     * Allows user to add a note to a specific task
     * @param aTask: task that the user would like to add a note to
     * @param aNote: note that the user would like to add to aTask
     */
    public void addNotesToTask (Task aTask, String aNote) {
        aTask.addNote(aNote);
    }

    /**
     * Allows user to complete a task
     * @param aTask: task that has been completed
     */
    public void completeTask(Task aTask) {
        aTask.setComplete();
    }

}
