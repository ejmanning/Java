import java.util.Scanner;

public class RPSLSManning {
	//Erica Manning
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Player 1: Enter rock, paper, scissors, lizard, or spock: ");
		
		String playerOneAnswer = in.nextLine();
		
		System.out.println("Player 2: Enter rock, paper, scissors, lizard, or spock: ");
		
		String playerTwoAnswer = in.nextLine();
		
		System.out.println(gameWinner(playerOneAnswer, playerTwoAnswer));
		
		in.close();
		
		
	}
	/**
	 * determines the winner of the game rock, paper, scissors, lizard, spock
	 * @param playerOneAnswer player one's answer
	 * @param playerTwoAnswer player two's answer
	 * @return winner of the game
	 */
	public static String gameWinner(String playerOneAnswer, String playerTwoAnswer) {
		
		playerOneAnswer = playerOneAnswer.toLowerCase();
		
		playerTwoAnswer = playerTwoAnswer.toLowerCase();
		
		String winner= "";
		
		switch(playerOneAnswer) {
		case "rock": 
			if (playerTwoAnswer.equals("rock")){
				winner = "Tie, no winner!";
			}
			else if (playerTwoAnswer.equals("paper")) {
				winner = "Winner: Player 2";
			}
			else if (playerTwoAnswer.equals("scissors")) {
				winner = "Winner: Player 1";
			}
			else if (playerTwoAnswer.equals("lizard")) {
				winner = "Winner: Player 1";
			}
			else if (playerTwoAnswer.equals("spock")) {
				winner = "Winner: Player 2";
			}
			break;
			
		case "paper" :
			if (playerTwoAnswer.equals("rock")) {
				winner = "Winner: Player 1";
			}
			else if (playerTwoAnswer.equals("paper")) {
				winner = "Tie, no winner!";
			}
			else if (playerTwoAnswer.equals("scissors")) {
				winner = "Winner: Player 2";
			}
			else if (playerTwoAnswer.equals("lizard")) {
				winner = "Winner: Player 2";
			}
			else if (playerTwoAnswer.equals("spock")) {
				winner = "Winner: Player 1";
			}
			break;

		case "scissors" :
			if (playerTwoAnswer.equals("rock")) {
				winner = "Winner: Player 2";
			}
			else if (playerTwoAnswer.equals("paper")) {
				winner = "Winner: Player 1";
			}
			else if (playerTwoAnswer.equals("scissors")) {
				winner = "Tie, no winner!";
			}
			else if (playerTwoAnswer.equals("lizard")) {
				winner = "Winner: Player 1";
			}
			else if (playerTwoAnswer.equals("spock")) {
				winner = "Winner: Player 2";
			}
			break;
			
		case "lizard" : 
			if (playerTwoAnswer.equals("rock")) {
				winner = "Winner: Player 2";
			}
			else if (playerTwoAnswer.equals("paper")) {
				winner = "Winner: Player 1";
			}
			else if (playerTwoAnswer.equals("scissors")) {
				winner = "Winner: Player 2";
			}
			else if (playerTwoAnswer.equals("lizard")) {
				winner = "Tie, no winner!";
			}
			else if (playerTwoAnswer.equals("spock")) {
				winner = "Winner: Player 1";
			}
			break;
		
		case "spock" :
			if (playerTwoAnswer.equals("rock")) {
				winner = "Winner: Player 1";
			}
			else if (playerTwoAnswer.equals("paper")) {
				winner = "Winner: Player 2";
			}
			else if (playerTwoAnswer.equals("scissors")) {
				winner = "Winner: Player 1";
			}
			else if (playerTwoAnswer.equals("lizard")) {
				winner = "Winner: Player 2";
			}
			else if (playerTwoAnswer.equals("spock")) {
				winner = "Tie, no winner!";
			}
			break;
			
		default :
			winner = "Winner: Player 1";
		}
			
		return winner;
	}
}

