import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RockPaperScissorsManningTest extends RockPaperScissorsManning {

	@Test
	void testGameWinner() {
		assertEquals("Tie, no winner!", RockPaperScissorsManning.gameWinner("ROCK", "rock") );
		assertEquals("Tie, no winner!", RockPaperScissorsManning.gameWinner("paper", "PAPER") );
		assertEquals("Tie, no winner!", RockPaperScissorsManning.gameWinner("SCISSORS", "SCISSORS") );
		
		assertEquals("Winner: Player 2", RockPaperScissorsManning.gameWinner("ROCK", "paper") );
		assertEquals("Winner: Player 1", RockPaperScissorsManning.gameWinner("rock", "SCISSORS") );
		
		assertEquals("Winner: Player 1", RockPaperScissorsManning.gameWinner("PAPER", "rock") );
		assertEquals("Winner: Player 2", RockPaperScissorsManning.gameWinner("paper", "SCISSORS") );
		
		assertEquals("Winner: Player 2", RockPaperScissorsManning.gameWinner("SCISSORS", "rock") );
		assertEquals("Winner: Player 1", RockPaperScissorsManning.gameWinner("scissors", "PAPER") );
	}

}
