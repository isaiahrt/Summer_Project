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
		System.out.println("-------------");
		for(User u: aUsers) {
			if(!u.noTasks()) {
				u.getTasks();
			}
		}
		System.out.println("-------------");
	}
	
	public void clearCompleteTasks(){
		for (User u: aUsers) {
			u.clearCompleteTask();
		}
	}

	/**
	 * constructor for team
	 * @param aName: team name
	 * @param aUsers: array list of users that make up the team
	 */
	public Team(String aName, ArrayList<User> aUsers) {
		this.aName = aName;
		this.aUsers = aUsers;
	}

}
