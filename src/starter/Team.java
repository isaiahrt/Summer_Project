package starter;

import java.util.ArrayList;

public class Team {
	
	private String aName;
	private ArrayList<User> aUsers = new ArrayList<User>();
	
	public String getName() {
		return aName;
	}
	
	public void addUser(User pUser) {
		aUsers.add(pUser);
	}
	
	public Team(String pName) {
		aName = pName;
	}
	
	public void getTaskList() {
		for(User u: aUsers) {
			u.getTasks();
		}
	}

}
