
public class PlayerTesterManning {

	public static void main(String[] args) {
		
		FootballPlayer brian = new FootballPlayer("Brian", 12, "Quarterback", 50);
		FootballPlayer chad = new FootballPlayer("Chad", 11, "Runningback", 56);
		HockeyPlayer todd = new HockeyPlayer("Todd", 23, "Goalie", 5);
		HockeyPlayer devon = new HockeyPlayer("Devon", 7, "Forward", 7);
		
		System.out.println(brian.formatPlayerInformation());
		System.out.println(chad.formatPlayerInformation());
		System.out.println(todd.formatPlayerInformation());
		System.out.println(devon.formatPlayerInformation());
		
		
		Roster eagles = new Roster("Eagles");
		
		eagles.addToTeam(brian);
		eagles.addToTeam(chad);
		System.out.println(eagles.displayRoster());
		
		Roster hawks = new Roster("Hawks");
		
		hawks.addToTeam(todd);
		hawks.addToTeam(devon);
		System.out.println(hawks.displayRoster());
	}

}
