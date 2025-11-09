package quickdip;

/**
 * ExerciseB - A countdown loop exercise with conditional output.
 * 
 * <p>This class is a practice exercise demonstrating basic Java control flow
 * using a while loop that counts down. It prints "small x" when the counter
 * falls below a threshold value.</p>
 * 
 * <h2>Algorithm:</h2>
 * <ol>
 *   <li>Initialize counter x = 5</li>
 *   <li>Loop while x > 1</li>
 *   <li>Decrement x by 1</li>
 *   <li>If x < 3, print "small x"</li>
 * </ol>
 * 
 * <h2>Expected Output:</h2>
 * <pre>
 * small x
 * small x
 * </pre>
 * <p>(2 times, for x values 2 and 1 after decrement)</p>
 * 
 * <h2>Usage Example:</h2>
 * <pre>{@code
 * // Run the exercise
 * ExerciseB.main(new String[]{});
 * }</pre>
 * 
 * @author Learning Java Project
 * @version 1.0
 * @since 1.0
 */
public class ExerciseB{
	
	/**
	 * Main entry point for the exercise.
	 * 
	 * <p>Demonstrates a countdown while loop with conditional logic. The loop
	 * decrements a counter and prints a message when the counter is less than 3.</p>
	 * 
	 * <h3>Loop Execution:</h3>
	 * <table border="1">
	 *   <tr><th>Iteration</th><th>x (start)</th><th>x (after decrement)</th><th>Prints "small x"?</th></tr>
	 *   <tr><td>1</td><td>5</td><td>4</td><td>No (4 ≥ 3)</td></tr>
	 *   <tr><td>2</td><td>4</td><td>3</td><td>No (3 ≥ 3)</td></tr>
	 *   <tr><td>3</td><td>3</td><td>2</td><td>Yes (2 < 3)</td></tr>
	 *   <tr><td>4</td><td>2</td><td>1</td><td>Yes (1 < 3)</td></tr>
	 *   <tr><td>-</td><td>1</td><td>-</td><td>Loop exits (1 ≤ 1)</td></tr>
	 * </table>
	 * 
	 * <h3>Concepts Demonstrated:</h3>
	 * <ul>
	 *   <li>While loop with decrement operation</li>
	 *   <li>Conditional statements (if)</li>
	 *   <li>Comparison operators (>, <)</li>
	 *   <li>Variable assignment and modification</li>
	 * </ul>
	 * 
	 * @param args Command line arguments (not used)
	 */
	public static void main(String [] args) {
		int x = 5;
		while (x > 1){
			x = x - 1;
			if (x < 3) {
				System.out.println("small x");
			}
		}
	}
}