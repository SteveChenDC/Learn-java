/**
 * Player - Represents a player in the number guessing game.
 * 
 * <p>This class encapsulates the behavior of a player who makes random guesses
 * in the GuessGame. Each player maintains their current guess and can generate
 * new guesses.</p>
 * 
 * <h2>Attributes:</h2>
 * <ul>
 *   <li><b>number</b> - The player's current guess (0-9)</li>
 * </ul>
 * 
 * <h2>Behavior:</h2>
 * <ul>
 *   <li>Generates random guesses between 0 and 9</li>
 *   <li>Stores the most recent guess</li>
 *   <li>Announces each guess to the console</li>
 * </ul>
 * 
 * <h2>Usage Example:</h2>
 * <pre>{@code
 * // Create a player
 * Player player = new Player();
 * 
 * // Make a guess
 * player.guess();  // Output: I'm guessing [random number 0-9]
 * 
 * // Access the guess
 * int guess = player.number;
 * System.out.println("Player guessed: " + guess);
 * }</pre>
 * 
 * @author Learning Java Project
 * @version 1.0
 * @since 1.0
 * @see GuessGame
 * @see GameLauncher
 */
public class Player {
	
	/**
	 * The player's current guess.
	 * <p>This field stores the most recent number guessed by the player.
	 * Valid values range from 0 to 9. Initialized to 0 before the first guess.</p>
	 */
	int number = 0; // where guess goes
	
	/**
	 * Generates a random guess between 0 and 9 (inclusive).
	 * 
	 * <p>This method performs the following actions:</p>
	 * <ol>
	 *   <li>Generates a random integer between 0 and 9</li>
	 *   <li>Stores the guess in the {@link #number} field</li>
	 *   <li>Prints the guess to the console</li>
	 * </ol>
	 * 
	 * <h3>Random Number Generation:</h3>
	 * <p>Uses {@link Math#random()} which returns a value in range [0.0, 1.0).
	 * Multiplying by 10 gives [0.0, 10.0), and casting to int truncates to [0, 9].</p>
	 * 
	 * <h3>Example Usage:</h3>
	 * <pre>{@code
	 * Player player = new Player();
	 * player.guess();
	 * // Output: I'm guessing 7
	 * 
	 * int playerGuess = player.number;  // Access the guess value
	 * }</pre>
	 * 
	 * <h3>Side Effects:</h3>
	 * <ul>
	 *   <li>Updates the player's {@link #number} field</li>
	 *   <li>Prints a message to standard output</li>
	 * </ul>
	 * 
	 * @see Math#random()
	 */
	public void guess(){
		number = (int) (Math.random() * 10);
		System.out.println("I'm guessing " + number);
	}
}
