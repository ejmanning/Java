
public class Team {
	//Erica Manning
	
	private String teamName;
	private int teamId;
	private int numberOfPlayers;
	private String captain;
	private static int nextTeamId = 1000;
	
	public Team() {
		
	}
	
	public Team(String teamName, int numberOfPlayers, String captain) {
		setTeamName(teamName);
		setNumberOfPlayers(numberOfPlayers);
		setCaptain(captain);
		
		if (getTeamName() == null || getNumberOfPlayers() == 0) {
			throw new IllegalArgumentException("The team was not created. Make sure the team name was typed in and the number of players is between 7 and 13.");
		}
		
		nextTeamId++;
		teamId = nextTeamId;
		
	}
	
	
	public String getTeamName() {
		return teamName;
	}
	
	public void setTeamName(String teamName) {
		if (teamName.length() == 0) {
			this.teamName = null;
		}
		else {
			this.teamName = teamName;
		}
	}
	
	
	public int getTeamId() {
		return teamId;
	}
	
	
	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}
	
	public void setNumberOfPlayers(int numberOfPlayers) {
		
		if (numberOfPlayers >= 7 && numberOfPlayers <= 13) {
			this.numberOfPlayers = numberOfPlayers;
		}
		else {
			this.numberOfPlayers = 0;
		}
		
	}
	
	
	public String getCaptain() {
		return captain;
	}
	
	public void setCaptain(String captain) {
		this.captain = captain;
	}

	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ", teamId=" + teamId + ", numberOfPlayers=" + numberOfPlayers
				+ ", captain=" + captain + "]";
	}
	
	public String displayTeamInfo() {
		int teamId = this.teamId;
		String teamName = this.teamName;
		int numberOfPlayers = this.numberOfPlayers;
		String captain = this.captain;
		return "Team ID: " + teamId + ", Team Name: " + teamName + ", # of Team Members: " + numberOfPlayers + ", Captain: " + captain;
	}
	
	public Team createSameTeamForNextSession() {
		Team t = new Team(this.teamName, this.numberOfPlayers, this.captain);
		return t;
	}
	
	
}
