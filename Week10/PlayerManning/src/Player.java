
public class Player {
	
	private String name;
	private int number;
	private String position;
	
	public Player() {
		
	}
	
	public Player(String name, int number, String position) {
		setName(name);
		setNumber(number);
		setPosition(position);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", number=" + number + ", position=" + position + "]";
	}
	
	public String formatPlayerInformation() {
		return "Player [name=" + name + ", number=" + number + ", position=" + position + "]";
	}

}
