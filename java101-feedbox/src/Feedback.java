import java.time.LocalDateTime;

public class Feedback {
	private LocalDateTime createdAt;
	private LocalDateTime sentAt;
	private Collaborator from;
	private Collaborator to;
	private String content;
	private Boolean isRead;

	public Feedback(LocalDateTime createdAt, LocalDateTime sentAt, Collaborator from, Collaborator to, String content) {
		super();
		this.createdAt = createdAt;
		this.sentAt = sentAt;
		this.from = from;
		this.to = to;
		this.content = content;
		this.isRead = false;
	}

	@Override
	public String toString() {
		return "Feedback ["
				+ "\r\n  createdAt=" + createdAt 
				+ "\r\n  sentAt=" + sentAt
				+ "\r\n  from=" + from
				+ "\r\n  to=" + to
				+ "\r\n  content=" + content
				+ "\r\n  isRead=" + isRead
				+ "\r\n]";
	}


	public void markAsRead () {
		this.isRead = true;
	}
}