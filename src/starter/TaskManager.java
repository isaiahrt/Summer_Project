package starter;
import java.util.Map;
import java.util.ArrayList;

/**
 * Created by amandaivey on 5/16/17.
 */
public class TaskManager {

    private static TaskManager firstInstance = null;

    //private constructor to construct a single instance of itself
    private TaskManager() {}

    public static TaskManager getInstance() {

        if (firstInstance == null) {
            firstInstance = new TaskManager();
        }
        return firstInstance;
    }

    private Map<Task, User> taskUserMap;

    public Map<Task, User> getTaskUserMap() {
        return taskUserMap;
    }

    /**
     * random task assignment takes a user list and a task list and randomly assigns tasks to users
     * ultimately populating the taskUserMap
     * @param aUserList: user list
     * @param aTaskList: task list
     */
    public void randomTaskAssignment(ArrayList<User> aUserList, ArrayList<Task> aTaskList){
        //todo: design algorithm that populates the task user map
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
