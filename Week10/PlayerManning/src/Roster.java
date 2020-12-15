import java.util.ArrayList;

public class Roster extends Player{
	private String teamName;
	private ArrayList<Player> teamList;
	
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public ArrayList<Player> getTeamList() {
		return teamList;
	}

	public void setTeamList(ArrayList<Player> teamList) {
		this.teamList = teamList;
	}
	
	public Roster(String teamName) {
		this.teamName = teamName;
		teamList = new ArrayList<Player>();
	}
	
	public void addToTeam(Player p) {
		teamList.add(p);
	}
	
	public String displayRoster() {
		StringBuilder builder = new StringBuilder();
		builder.append(getTeamName() + "\n");
		//int length = teamList.size();
		
		for (int i = 0; i < teamList.size(); i++) {
			builder.append(teamList.get(i).formatPlayerInformation());
		}
		
		String result = builder.toString();
	
		return result; 
	}

}
