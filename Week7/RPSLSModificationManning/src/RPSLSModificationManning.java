import java.util.Scanner;
import java.util.Random;
public class RPSLSModificationManning {
	//Erica Manning
		public static void main(String [] args) {
			Scanner in = new Scanner(System.in);
			System.out.println("The computer will play rock, paper, scissors lizard, spock with you.");
			System.out.println("Player: Enter rock, paper, scissors, lizard, or spock: ");
			
			String playerOneAnswer = in.nextLine();
			
			String playerTwoAnswer;
			
			Random random = new Random();
			
			int player2 = random.nextInt(4);
			
			switch(player2)
			{
				case 0: playerTwoAnswer = "rock"; break;
				case 1: playerTwoAnswer = "paper"; break;
				case 2: playerTwoAnswer = "scissors"; break;
				case 3: playerTwoAnswer = "lizard"; break;
				case 4: playerTwoAnswer = "spock"; break;
				default: playerTwoAnswer = ""; break;
			
			}
			
			System.out.println("Computer Answer: " + playerTwoAnswer);
			System.out.println();
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
					winner = "Winner: Computer";
				}
				else if (playerTwoAnswer.equals("scissors")) {
					winner = "Winner: Player";
				}
				else if (playerTwoAnswer.equals("lizard")) {
					winner = "Winner: Player";
				}
				else if (playerTwoAnswer.equals("spock")) {
					winner = "Winner: Computer";
				}
				break;
				
			case "paper" :
				if (playerTwoAnswer.equals("rock")) {
					winner = "Winner: Player";
				}
				else if (playerTwoAnswer.equals("paper")) {
					winner = "Tie, no winner!";
				}
				else if (playerTwoAnswer.equals("scissors")) {
					winner = "Winner: Computer";
				}
				else if (playerTwoAnswer.equals("lizard")) {
					winner = "Winner: Computer";
				}
				else if (playerTwoAnswer.equals("spock")) {
					winner = "Winner: Player";
				}
				break;

			case "scissors" :
				if (playerTwoAnswer.equals("rock")) {
					winner = "Winner: Computer";
				}
				else if (playerTwoAnswer.equals("paper")) {
					winner = "Winner: Player";
				}
				else if (playerTwoAnswer.equals("scissors")) {
					winner = "Tie, no winner!";
				}
				else if (playerTwoAnswer.equals("lizard")) {
					winner = "Winner: Player";
				}
				else if (playerTwoAnswer.equals("spock")) {
					winner = "Winner: Computer";
				}
				break;
				
			case "lizard" : 
				if (playerTwoAnswer.equals("rock")) {
					winner = "Winner: Computer";
				}
				else if (playerTwoAnswer.equals("paper")) {
					winner = "Winner: Player";
				}
				else if (playerTwoAnswer.equals("scissors")) {
					winner = "Winner: Computer";
				}
				else if (playerTwoAnswer.equals("lizard")) {
					winner = "Tie, no winner!";
				}
				else if (playerTwoAnswer.equals("spock")) {
					winner = "Winner: Player";
				}
				break;
			
			case "spock" :
				if (playerTwoAnswer.equals("rock")) {
					winner = "Winner: Player";
				}
				else if (playerTwoAnswer.equals("paper")) {
					winner = "Winner: Computer";
				}
				else if (playerTwoAnswer.equals("scissors")) {
					winner = "Winner: Player";
				}
				else if (playerTwoAnswer.equals("lizard")) {
					winner = "Winner: Computer";
				}
				else if (playerTwoAnswer.equals("spock")) {
					winner = "Tie, no winner!";
				}
				break;
				
			default :
				winner = "Winner: Player";
			}
				
			return winner;
		}
}
