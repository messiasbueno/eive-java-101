
public class Main {
	public static void main(String[] args) {
		Collaborator recipient = new Collaborator("Bueno", "Messias");
		Collaborator sender = new Collaborator("Silva", "Anderson");
		
		sender.sendFeedback(recipient, "message to be sent");
	}
}
