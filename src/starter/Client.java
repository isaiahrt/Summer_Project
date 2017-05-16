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
		
	}

}
