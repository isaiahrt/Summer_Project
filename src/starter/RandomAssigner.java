package starter;

import java.util.ArrayList;
import java.util.Collections;

public class RandomAssigner implements TaskAssigner {

	@Override
	public void assignTasksToUsers(Team aTeam) {
		ArrayList<User> availableUsers = aTeam.getUserList();
    	Collections.shuffle(availableUsers);
    	int index = 0;
    	for (Task t: aTeam.getTaskList()) {
    		TaskManager.getInstance().assignTaskToUser(availableUsers.get(index), t);
    		index++;
    		if(index == availableUsers.size()) {
    			Collections.shuffle(availableUsers);
    			index = 0;
    		}
    	}

	}

}
