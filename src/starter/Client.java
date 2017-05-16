package starter;

public class Client {
	
	public static void main(String[] args) {
		
		Team boathouse = new Team("The BoatHouse");
		
		User isaiah = new User("Isaiah");
		User amanda = new User("Amanda");
		User andries = new User("Andries");
		
		boathouse.addUser(isaiah);
		boathouse.addUser(amanda);
		boathouse.addUser(andries);
		
		Task dishes = new Task("Clean Dishes");
		Task vacuum = new Task("Vacuum Floors");
		Task bathroom = new Task("Clean Bathroom");
		Task shoes = new Task("Organize Shoes");
		
		amanda.addTask(bathroom);
		isaiah.addTask(vacuum);
		isaiah.addTask(dishes);
		andries.addTask(shoes);
		
		boathouse.getTaskList();
		isaiah.completeTask(vacuum);
		andries.completeTask(shoes);
		
		boathouse.getTaskList();
		boathouse.clearCompleteTasks();
		
		boathouse.getTaskList();
		
	}

}
