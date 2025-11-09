package quickdip;

/**
 * Exercise1b - A countdown loop exercise demonstrating control flow (duplicate variant).
 * 
 * <p>This class is functionally identical to {@link ExerciseB} and demonstrates
 * the same countdown loop pattern. It appears to be a duplicate exercise file
 * for additional practice.</p>
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
 * Exercise1b.main(new String[]{});
 * }</pre>
 * 
 * <p><b>Note:</b> This class has the same name (Exercise1b) as another class
 * in the same package but in a different file. In typical usage, this would
 * cause a naming conflict, but they exist in separate files for learning purposes.</p>
 * 
 * @author Learning Java Project
 * @version 1.0
 * @since 1.0
 * @see ExerciseB
 */
class Exercise1b {
	
	/**
	 * Main entry point for the exercise.
	 * 
	 * <p>Demonstrates a countdown while loop with conditional output. This implementation
	 * is identical to {@link ExerciseB#main(String[])}.</p>
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
	 * @param args Command line arguments (not used)
	 * @see ExerciseB#main(String[])
	 */
	public static void main(String[] args){
		int x = 5;
		while ( x > 1) {
			x = x - 1;
			if ( x < 3 ) {
				System.out.println("small x");
			}
		}
	}
}
