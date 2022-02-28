import java.time.LocalDateTime;

public class Collaborator {
	private String surname;
	private String user;

	
	public Collaborator(String surname, String user) {
		super();
		this.surname = surname;
		this.user = user;
	}

	@Override
	public String toString() {
		return "Collaborator [surname=" + surname + ", user=" + user + "]";
	}

	public void sendFeedback(Collaborator to, String content) {
		Feedback feedback = new Feedback(
			LocalDateTime.now(),
			LocalDateTime.now(),
			this,
			to,
			content				
		);
		
		System.out.println(feedback);
		feedback.markAsRead();
		System.out.println(feedback);		
	}
}
