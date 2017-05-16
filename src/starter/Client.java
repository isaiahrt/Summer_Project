package starter;

public class Client {
	
	public static void main(String[] args) {
		
		Team boathouse = new Team("The BoatHouse");
		
		boathouse.addUser("Amanda");
		boathouse.addUser("Andries");
		boathouse.addUser("Isaiah");
		
		boathouse.addTask("Wash Dishes");
		boathouse.addTask("Sjoes");
		
		TaskManager.getInstance().randomTaskAssignment(boathouse);
		boathouse.printTaskUserMap();
		
		
	}

}
