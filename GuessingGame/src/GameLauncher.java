/**
 * GameLauncher - Entry point for the number guessing game application.
 * 
 * <p>This class serves as the launcher for the GuessGame application. It creates
 * a game instance and starts the game loop where three players compete to guess
 * a randomly generated number.</p>
 * 
 * <h2>Game Flow:</h2>
 * <ol>
 *   <li>GameLauncher creates a GuessGame instance</li>
 *   <li>Calls startGame() to begin the game</li>
 *   <li>Three players compete to guess the target number (0-9)</li>
 *   <li>Game continues until at least one player guesses correctly</li>
 * </ol>
 * 
 * <h2>Usage Example:</h2>
 * <pre>{@code
 * // Run the guessing game
 * java GameLauncher
 * 
 * // Output (example):
 * // I'm thinking of a number between 0 and 9...
 * // Number to guess is 7
 * // Player one guessed 3
 * // Player two guessed 7
 * // Player three guessed 2
 * // We have a winner!
 * // Player one got it right? false
 * // Player two got it right? true
 * // Player three got it right? false
 * // Game is over.
 * }</pre>
 * 
 * @author Learning Java Project
 * @version 1.0
 * @since 1.0
 * @see GuessGame
 * @see Player
 */
public class GameLauncher {
	
	/**
	 * Main entry point for the guessing game application.
	 * 
	 * <p>Instantiates a new GuessGame and starts the game loop. The game will
	 * run until at least one of the three players successfully guesses the
	 * target number.</p>
	 * 
	 * @param args Command line arguments (not used)
	 * @see GuessGame#startGame()
	 */
	public static void main (String[] args) {
		GuessGame game = new GuessGame();
		game.startGame();
	}
}
