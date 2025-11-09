/**
 * GuessGame - A number guessing game where three players compete to guess the target number.
 * 
 * <p>This class manages a competitive guessing game involving three players who attempt
 * to guess a randomly generated number between 0 and 9. The game continues until at
 * least one player guesses correctly.</p>
 * 
 * <h2>Game Mechanics:</h2>
 * <ul>
 *   <li>Three players participate simultaneously</li>
 *   <li>Target number is randomly generated (0-9)</li>
 *   <li>Players make random guesses each round</li>
 *   <li>Multiple players can win in the same round</li>
 *   <li>Game displays each player's guess and final results</li>
 * </ul>
 * 
 * <h2>Game Flow:</h2>
 * <ol>
 *   <li>Initialize three Player objects</li>
 *   <li>Generate random target number (0-9)</li>
 *   <li>Each round:
 *     <ul>
 *       <li>All players make a guess</li>
 *       <li>Display all guesses</li>
 *       <li>Check for correct guesses</li>
 *       <li>End game if winner found, otherwise continue</li>
 *     </ul>
 *   </li>
 *   <li>Display winner(s) and end game</li>
 * </ol>
 * 
 * <h2>Usage Example:</h2>
 * <pre>{@code
 * GuessGame game = new GuessGame();
 * game.startGame();
 * 
 * // Example output:
 * // I'm thinking of a number between 0 and 9...
 * // Number to guess is 5
 * // Player one guessed 2
 * // Player two guessed 5
 * // Player three guessed 7
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
 * @see Player
 * @see GameLauncher
 */
public class GuessGame {
	
	/**
	 * Player one instance.
	 * <p>Initialized in startGame() method.</p>
	 */
	Player p1;
	
	/**
	 * Player two instance.
	 * <p>Initialized in startGame() method.</p>
	 */
	Player p2;
	
	/**
	 * Player three instance.
	 * <p>Initialized in startGame() method.</p>
	 */
	Player p3;
	
	/**
	 * Starts and manages the guessing game.
	 * 
	 * <p>This method orchestrates the entire game flow including:</p>
	 * <ul>
	 *   <li>Player initialization</li>
	 *   <li>Target number generation</li>
	 *   <li>Game loop management</li>
	 *   <li>Guess validation</li>
	 *   <li>Winner determination</li>
	 *   <li>Result display</li>
	 * </ul>
	 * 
	 * <h3>Algorithm:</h3>
	 * <pre>
	 * 1. Create three Player objects
	 * 2. Generate random target number (0-9)
	 * 3. Loop:
	 *    a. Each player makes a guess
	 *    b. Display all guesses
	 *    c. Check if any player guessed correctly
	 *    d. If winner found: display results and exit
	 *    e. Otherwise: continue to next round
	 * </pre>
	 * 
	 * <h3>Output Format:</h3>
	 * <p>The method prints the following information each round:</p>
	 * <ul>
	 *   <li>Target number (for demonstration purposes)</li>
	 *   <li>Each player's guess</li>
	 *   <li>Winner announcement when game ends</li>
	 *   <li>Boolean results for each player</li>
	 * </ul>
	 * 
	 * <p><b>Note:</b> The target number is displayed during the game for
	 * educational/demonstration purposes. In a real game, this would be hidden.</p>
	 * 
	 * @see Player#guess()
	 */
	public void startGame() {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		int targetNumber = (int) (Math.random() * 10);
		System.out.println("I'm thinking of a number between 0 and 9...");
		
		while(true){
			System.out.println("Number to guess is " + targetNumber);
			
			p1.guess();
			p2.guess();
			p3.guess();
			
			guessp1 = p1.number;
			System.out.println("Player one guessed " + guessp1);
			
			guessp2 = p2.number;
			System.out.println("Player two guessed " + guessp2);
			
			guessp3 = p3.number;
			System.out.println("Player three guessed " + guessp3);
			
			if (guessp1 == targetNumber){
				p1isRight = true;
			}
			
			if (guessp2 == targetNumber){
				p2isRight = true;
			}
			
			if (guessp3 == targetNumber){
				p3isRight = true;
			}
			
			if (p1isRight || p2isRight || p3isRight) {
				
				System.out.println("We have a winner!");
				System.out.println("Player one got it right?" + p1isRight);
				System.out.println("Player two got it right?" + p2isRight);
				System.out.println("Player three got it right?" + p3isRight);
				System.out.println("Game is over.");
				break; // Game is over, break out of loop
				
			} else {
				// Keeps going because no one got it right
				System.out.println("Players will have to try again");
			}
		}
	}
}
