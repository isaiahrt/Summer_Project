package starter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
     * @param pTeam: team
     */
    public void taskAssignment(TaskAssigner ta, Team pTeam){
    	ta.assignTasksToUsers(pTeam);
    }

    /**
     * submethod of randomTaskAssignment puts a task and user into the task user map (encapsulation)
     * @param aUser: user
     * @param aTask: task
     */

    public void assignTaskToUser(User aUser, Task aTask) {
        if(taskUserMap.get(aTask) == null){
            taskUserMap.put(aTask, aUser);
        }
        else {
            //find aTask entry, delete the user and assign new user
            taskUserMap.remove(aTask);
            taskUserMap.put(aTask, aUser);
        }
    }
}
