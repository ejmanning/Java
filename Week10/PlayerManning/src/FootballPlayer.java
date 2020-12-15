
public class FootballPlayer extends Player {
	private int totalYards;

	public FootballPlayer() {
		
	}
	
	public FootballPlayer(String name, int number, String position, int totalYards) {
		super(name, number, position);
		setTotalYards(totalYards);
	}

	public int getTotalYards() {
		return totalYards;
	}

	public void setTotalYards(int totalYards) {
		this.totalYards = totalYards;
	}
	
	public String formatPlayerInformation() {
		return "#" + getNumber() + ": " + getName() + ", " + getPosition() + ", " + getTotalYards() + " yards \n";
	}


}
