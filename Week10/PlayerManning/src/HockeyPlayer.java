
public class HockeyPlayer extends Player {
	
	private int numberOfGoals;

	public HockeyPlayer() {
		
	}
	
	public HockeyPlayer(String name, int number, String position, int numberOfGoals) {
		super(name, number, position);
		setNumberOfGoals(numberOfGoals);
	}

	public int getNumberOfGoals() {
		return numberOfGoals;
	}

	public void setNumberOfGoals(int numberOfGoals) {
		this.numberOfGoals = numberOfGoals;
	}
	
	public String formatPlayerInformation() {
		return "#" + getNumber() + ": " + getName() + ", " + getPosition() + ", " + getNumberOfGoals() + " goals \n";
	}


}
