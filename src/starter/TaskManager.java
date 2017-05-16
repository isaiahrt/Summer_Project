package starter;
import java.util.HashMap;


/**
 * Created by amandaivey on 5/16/17.
 */
class TaskManager {

    private static TaskManager firstInstance = new TaskManager();

    //private constructor to construct a single instance of itself
    private TaskManager() { }

    public static TaskManager getInstance() {

        if (firstInstance == null) {
            firstInstance = new TaskManager();
        }
        return firstInstance;
    }

    private HashMap<Task, User> taskUserMap = new HashMap<Task,User>();

    public HashMap<Task, User> getTaskUserMap() {
        return taskUserMap;
    }

    /**
     * random task assignment takes a user list and a task list and randomly assigns all tasks to users
     * ultimately populating the taskUserMap
     * @param aUserList: user list
     * @param aTaskList: task list
     */
    public void randomTaskAssignment(Team aTeam){
    	for (Task t: aTeam.getTaskList()) {
    		assignTaskToUser(aTeam.getUserList().get((int) (Math.random()*aTeam.getUserList().size())), t);
    	}
    }

    /**
     * submethod of randomTaskAssignment puts a task and user into the task user map (encapsulation)
     * @param aUser: user
     * @param aTask: task
     */

    private void assignTaskToUser(User aUser, Task aTask) {
        taskUserMap.put(aTask, aUser);
    }
}
