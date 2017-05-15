package starter;

public class Client {
	
	public static void main(String[] args) {
		
		Team boathouse = new Team("The BoatHouse");
		
		User isaiah = new User("Isaiah");
		User amanda = new User("Amanda");
		
		boathouse.addUser(isaiah);
		boathouse.addUser(amanda);
		
		Task dishes = new Task("Clean Dishes");
		Task vacuum = new Task("Vacuum Floors");
		Task bathroom = new Task("Clean Bathroom");
		
		amanda.addTask(bathroom);
		isaiah.addTask(vacuum);
		isaiah.addTask(dishes);
		
		boathouse.getTaskList();
		isaiah.completeTask(vacuum);
		
		boathouse.getTaskList();
		
	}

}
