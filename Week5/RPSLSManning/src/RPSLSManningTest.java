import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RPSLSManningTest extends RPSLSManning {

	@Test
	void testGameWinner() {
		assertEquals("Tie, no winner!", RPSLSManning.gameWinner("rock", "ROCK"));
		assertEquals("Tie, no winner!", RPSLSManning.gameWinner("PAPER", "paper"));
		assertEquals("Tie, no winner!", RPSLSManning.gameWinner("SCISSORS", "SCISSORS"));
		assertEquals("Tie, no winner!", RPSLSManning.gameWinner("LIZARD", "lizard"));
		assertEquals("Tie, no winner!", RPSLSManning.gameWinner("spock", "SPOCK"));
		
		assertEquals("Winner: Player 1", RPSLSManning.gameWinner("rock", "scissors"));
		assertEquals("Winner: Player 1", RPSLSManning.gameWinner("rock", "lizard"));
		assertEquals("Winner: Player 1", RPSLSManning.gameWinner("paper", "rock"));
		assertEquals("Winner: Player 1", RPSLSManning.gameWinner("paper", "spock"));
		assertEquals("Winner: Player 1", RPSLSManning.gameWinner("scissors", "paper"));
		assertEquals("Winner: Player 1", RPSLSManning.gameWinner("scissors", "lizard"));
		assertEquals("Winner: Player 1", RPSLSManning.gameWinner("lizard", "spock"));
		assertEquals("Winner: Player 1", RPSLSManning.gameWinner("lizard", "paper"));
		assertEquals("Winner: Player 1", RPSLSManning.gameWinner("spock", "rock"));
		assertEquals("Winner: Player 1", RPSLSManning.gameWinner("spock", "scissors"));
		
		assertEquals("Winner: Player 2", RPSLSManning.gameWinner("rock", "paper"));
		assertEquals("Winner: Player 2", RPSLSManning.gameWinner("rock", "spock"));
		assertEquals("Winner: Player 2", RPSLSManning.gameWinner("paper", "scissors"));
		assertEquals("Winner: Player 2", RPSLSManning.gameWinner("paper", "lizard"));
		assertEquals("Winner: Player 2", RPSLSManning.gameWinner("scissors", "rock"));
		assertEquals("Winner: Player 2", RPSLSManning.gameWinner("scissors", "spock"));
		assertEquals("Winner: Player 2", RPSLSManning.gameWinner("lizard", "rock"));
		assertEquals("Winner: Player 2", RPSLSManning.gameWinner("lizard", "scissors"));
		assertEquals("Winner: Player 2", RPSLSManning.gameWinner("spock", "lizard"));
		assertEquals("Winner: Player 2", RPSLSManning.gameWinner("spock", "paper"));

	}

}
