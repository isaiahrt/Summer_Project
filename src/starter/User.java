package starter;

import java.util.ArrayList;

public class User {
	
	private String aName;
	private ArrayList<Task> aTasks = new ArrayList<Task>();
	
	public User(String pName) {
		aName = pName;
	}
	
	public void getTasks() {
		System.out.println(aName + ":");
		for (Task t: aTasks) {
			t.print();
		}
	}
	
	public void completeTask(Task pTask) {
		assert aTasks.contains(pTask);
		pTask.complete();
	}
	
	public void addTask(Task pTask) {
		aTasks.add(pTask);
	}

}
