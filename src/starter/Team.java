package starter;

import java.util.ArrayList;

public class Team {
	
	private String name;
	private ArrayList<User> aUsers = new ArrayList<User>();
	private ArrayList<Task> TaskList = new ArrayList<Task>();
	
	public String getName() {
		return name;
	}
	
	public void addUser(User pUser) {
		aUsers.add(pUser);
	}
	

	/**
	 * constructor for team
	 * @param pName: team name
	 */
	public Team(String pName) {
		this.name = pName;
	}

}
