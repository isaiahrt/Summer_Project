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

}
