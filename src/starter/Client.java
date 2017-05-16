package starter;

public class Client {
	
	public static void main(String[] args) {
		
		Team boathouse = new Team("The BoatHouse");
		
		boathouse.addUser("Amanda");
		boathouse.addUser("Andries");
		boathouse.addUser("Isaiah");
		
<<<<<<< Updated upstream
		boathouse.addTask("Wash Dishes");
		boathouse.addTask("Shoes");
=======
		boathouse.addTask("Task 1");
		boathouse.addTask("Task 2");
		boathouse.addTask("Task 3");
		boathouse.addTask("Task 4");
		boathouse.addTask("Task 5");
		boathouse.addTask("Task 6");
		boathouse.addTask("Task 7");
		boathouse.addTask("Task 8");
>>>>>>> Stashed changes
		
		TaskManager.getInstance().taskAssignment(new RandomAssigner(), boathouse);
		TaskManager.getInstance().taskAssignment(new AlphabeticalTaskAssigner(), boathouse);
		boathouse.printTaskUserMap();
		
		
	}

}
