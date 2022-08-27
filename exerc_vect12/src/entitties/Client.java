package entitties;

public class Client {
	private String name;
	private String email;
	private int room;

	public Client() {

	}
	public Client(int room) {
		this.room = room;
	}

	public Client(String name, String email) {
		this.name = name;
		this.email = name;
	}

	public Client(String name, String email, int room) {
		this.name = name;
		this.email = email;
		this.room = room;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public int getRoom() {
		return room;
	}

	public String toString() {
		return room + ": " + name + ", " + email;
	}
}
