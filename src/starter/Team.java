package starter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Team {
	
	private String name;
	private ArrayList<User> userList = new ArrayList<User>();
	private ArrayList<Task> taskList = new ArrayList<Task>();
	
	private int currentUserID = 1;
	private int currentTaskID = 1;
	
	public void printTaskUserMap() {
		Iterator<Entry<Task, User>> it = TaskManager.getInstance().getTaskUserMap().entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Task, User> pair = (Map.Entry<Task,User>)it.next();
			System.out.println(pair.getKey().getName() + "->" + pair.getValue().getName());
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void addUser(String aName) {
		userList.add(new User(aName, currentUserID));
		currentUserID++;
	}
	
	public void addTask(String aName) {
		taskList.add(new Task(aName, currentTaskID));
		currentTaskID++;
	}
	
	public ArrayList<User> getUserList() {
		return userList;
	}
	
	public ArrayList<Task> getTaskList() {
		return taskList;
	}
	

	/**
	 * constructor for team
	 * @param pName: team name
	 */
	public Team(String pName) {
		this.name = pName;
	}

}
