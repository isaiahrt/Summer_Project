package starter;

import java.util.ArrayList;

public class User {
	
	private String aName;
	private ArrayList<Task> aTasks = new ArrayList<Task>();
	
	public boolean noTasks() {
		return aTasks.isEmpty();
		
	}
	
	public void getTasks() {
		System.out.println(aName + ":");
		for (Task t: aTasks) {
			t.print();
		}
	}
	
	public void addTask(Task pTask) {
		aTasks.add(pTask);
	}
	private ArrayList<Task> aTaskList = new ArrayList<Task>();

    /**
     * Constructor for user
     * @param aName: name of the user
     */
    public User (String aName) {
        this.aName = aName;
    }

    /**
     * @param aTask: task to be added to aTaskList
     */
    public void addTaskToList (Task aTask) {
        aTaskList.add(aTask);
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

	public void clearCompleteTask() {
		for (Task t: aTasks) {
			if (t.isComplete()) {
				aTasks.remove(t);
			}
		}
		
	}
}
