import java.time.LocalDateTime;
import javax.swing.JOptionPane;

public class TimedResponseManning {
	//Erica Manning
	public static void main(String [] args) {

		LocalDateTime time1 = LocalDateTime.now();
		int secs1 = time1.getSecond();
		int minutes1 = time1.getMinute();
		
		JOptionPane.showConfirmDialog(null, "Are you a closet Taylor Swift fan?");
		
		LocalDateTime time2 = LocalDateTime.now();
		int secs2 = time2.getSecond();
		int minutes2 = time2.getMinute();
		
		int differenceMinutes = minutes2-minutes1;
		int differenceSeconds = secs2-secs1;
		
		JOptionPane.showMessageDialog(null, "End seconds: " + secs2 + "\nStart seconds: " + secs1 + "\nIt took " + differenceMinutes + " minute(s) and "+ differenceSeconds + " seconds for you to answer.\nWas it a difficult decision?");
	}
}
