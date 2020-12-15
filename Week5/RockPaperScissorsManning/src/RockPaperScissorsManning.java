import java.util.Scanner;
public class RockPaperScissorsManning {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Player 1: Enter rock, paper, or scissors: ");
		
		String playerOneAnswer = in.nextLine();
		
		System.out.println("Player 2: Enter rock, paper, or scissors: ");
		
		String playerTwoAnswer = in.nextLine();
		
		System.out.println(gameWinner(playerOneAnswer, playerTwoAnswer));
		
		in.close();
		
		
	}
	/**
	 * determines the winner of the rock, paper, scissors game
	 * @param playerOneAnswer Player one's answer
	 * @param playerTwoAnswer player two's answer
	 * @return tells the winner
	 */
	public static String gameWinner(String playerOneAnswer, String playerTwoAnswer) {
		
		playerOneAnswer = playerOneAnswer.toLowerCase();
		
		playerTwoAnswer = playerTwoAnswer.toLowerCase();
		
		String winner= "";
		
		if (playerOneAnswer.equals("rock")) {
			if (playerTwoAnswer.equals("rock")){
				winner = "Tie, no winner!";
			}
			else if (playerTwoAnswer.equals("paper")) {
				winner = "Winner: Player 2";
			}
			else if (playerTwoAnswer.equals("scissors")) {
				winner = "Winner: Player 1";
			}
		}
		
		else if (playerOneAnswer.equals("paper")) {
			if (playerTwoAnswer.equals("rock")) {
				winner = "Winner: Player 1";
			}
			else if (playerTwoAnswer.equals("paper")) {
				winner = "Tie, no winner!";
			}
			else if (playerTwoAnswer.equals("scissors")) {
				winner = "Winner: Player 2";
			}
		}
		
		else if(playerOneAnswer.equals("scissors")) {
			if (playerTwoAnswer.equals("rock")) {
				winner = "Winner: Player 2";
			}
			else if (playerTwoAnswer.equals("paper")) {
				winner = "Winner: Player 1";
			}
			else if (playerTwoAnswer.equals("scissors")) {
				winner = "Tie, no winner!";
			}
		}
		else {
			winner = "Invalid input";
		}
		
		return winner;
	}
}
