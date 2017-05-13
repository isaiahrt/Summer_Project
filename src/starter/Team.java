package starter;

import java.util.ArrayList;

public class Team {
	
	private String aName;
	private ArrayList<User> aUsers = new ArrayList<User>();

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
