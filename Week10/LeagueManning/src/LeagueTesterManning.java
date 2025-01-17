
public class LeagueTesterManning {

	public static void main(String[] args) {
		Team mustangs = new Team("Mustangs", 10, "Bobby");
		Team cowboys = new Team("Cowboys", 7, "Joseph");
		Team bears = new Team("Bears", 13, "Dave");
		Team wildcats = new Team("Wildcats", 11, "Stan");
		Team fillies = new Team("Fillies", 12, "Erica");
		
		System.out.println(mustangs.displayTeamInfo());
		System.out.println(cowboys.displayTeamInfo());
		System.out.println(bears.displayTeamInfo());
		System.out.println(wildcats.displayTeamInfo());
		System.out.println(fillies.displayTeamInfo());
		
		System.out.println(fillies.createSameTeamForNextSession().displayTeamInfo());
		System.out.println(wildcats.createSameTeamForNextSession().displayTeamInfo());
		System.out.println(bears.createSameTeamForNextSession().displayTeamInfo());

	}

}
