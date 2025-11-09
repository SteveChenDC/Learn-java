package quickdip;

/**
 * Exercise1b - A simple loop exercise demonstrating conditional output.
 * 
 * <p>This class is a practice exercise that demonstrates basic Java control flow
 * using while loops and if statements. It prints "big x" when a counter variable
 * exceeds a threshold value.</p>
 * 
 * <h2>Algorithm:</h2>
 * <ol>
 *   <li>Initialize counter x = 1</li>
 *   <li>Loop while x < 10</li>
 *   <li>Increment x by 1</li>
 *   <li>If x > 3, print "big x"</li>
 * </ol>
 * 
 * <h2>Expected Output:</h2>
 * <pre>
 * big x
 * big x
 * big x
 * big x
 * big x
 * big x
 * </pre>
 * <p>(6 times, for x values 4, 5, 6, 7, 8, 9)</p>
 * 
 * <h2>Usage Example:</h2>
 * <pre>{@code
 * // Run the exercise
 * Execise1b.main(new String[]{});
 * }</pre>
 * 
 * @author Learning Java Project
 * @version 1.0
 * @since 1.0
 */
public class Execise1b {
	
	/**
	 * Main entry point for the exercise.
	 * 
	 * <p>Demonstrates a while loop with conditional logic inside. The loop
	 * increments a counter and prints a message when the counter exceeds 3.</p>
	 * 
	 * <h3>Loop Execution:</h3>
	 * <table border="1">
	 *   <tr><th>Iteration</th><th>x (start)</th><th>x (after increment)</th><th>Prints "big x"?</th></tr>
	 *   <tr><td>1</td><td>1</td><td>2</td><td>No (2 ≤ 3)</td></tr>
	 *   <tr><td>2</td><td>2</td><td>3</td><td>No (3 ≤ 3)</td></tr>
	 *   <tr><td>3</td><td>3</td><td>4</td><td>Yes (4 > 3)</td></tr>
	 *   <tr><td>4</td><td>4</td><td>5</td><td>Yes (5 > 3)</td></tr>
	 *   <tr><td>5</td><td>5</td><td>6</td><td>Yes (6 > 3)</td></tr>
	 *   <tr><td>6</td><td>6</td><td>7</td><td>Yes (7 > 3)</td></tr>
	 *   <tr><td>7</td><td>7</td><td>8</td><td>Yes (8 > 3)</td></tr>
	 *   <tr><td>8</td><td>8</td><td>9</td><td>Yes (9 > 3)</td></tr>
	 *   <tr><td>9</td><td>9</td><td>10</td><td>Loop exits (10 ≥ 10)</td></tr>
	 * </table>
	 * 
	 * @param args Command line arguments (not used)
	 */
	public static void main(String [] args){
		int x = 1;
		while (x < 10) {
		x = x + 1;
			if ( x > 3 ) {
				System.out.println("big x");
			}
		}
	}
}
