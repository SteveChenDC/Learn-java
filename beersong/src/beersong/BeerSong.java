package beersong;

/**
 * BeerSong - A classic "99 Bottles of Beer" song implementation.
 * 
 * <p>This class implements the traditional drinking song that counts down from 99 bottles
 * to zero, adjusting the grammar for singular/plural forms appropriately.</p>
 * 
 * <h2>Features:</h2>
 * <ul>
 *   <li>Counts down from 99 bottles to 0</li>
 *   <li>Handles singular/plural grammar correctly</li>
 *   <li>Prints the complete song lyrics to console</li>
 * </ul>
 * 
 * <h2>Usage Example:</h2>
 * <pre>{@code
 * // Run the beer song
 * BeerSong.main(new String[]{});
 * 
 * // Output:
 * // 99 bottles of beer on the wall
 * // 99 bottles of beer
 * // Take one down.
 * // Pass it around.
 * // ...
 * // 1 bottle of beer on the wall
 * // 1 bottle of beer
 * // Take one down.
 * // Pass it around.
 * // No more bottles of beer on the wall
 * }</pre>
 * 
 * @author Learning Java Project
 * @version 1.0
 * @since 1.0
 */
public class BeerSong {
	
	/**
	 * Main entry point for the BeerSong application.
	 * 
	 * <p>Executes the "99 Bottles of Beer" song by counting down from 99 to 0,
	 * printing each verse with proper grammar handling for singular and plural forms.</p>
	 * 
	 * <p><b>Algorithm:</b></p>
	 * <ol>
	 *   <li>Initialize counter at 99 bottles</li>
	 *   <li>Loop while bottles remain</li>
	 *   <li>Adjust grammar for singular case (1 bottle)</li>
	 *   <li>Print verse</li>
	 *   <li>Decrement counter</li>
	 *   <li>Print final message when reaching zero</li>
	 * </ol>
	 * 
	 * @param args Command line arguments (not used)
	 * 
	 * @see java.lang.System#out
	 */
	public static void main (String[] args) {
		int beerNum = 99;
		String word = "bottles";
		
		while (beerNum > 0){
			if (beerNum == 1) {
				word = "bottle"; //singular as in one Bottle
			}
			
		System.out.println(beerNum + " " + word + " of beer on the wall");
		System.out.println(beerNum + " " + word + " of beer");
		System.out.println("Take one down.");
		System.out.println("Pass it around.");
		beerNum = beerNum - 1;
		
		if (beerNum == 0){
			System.out.println("No more bottles of beer on the wall");
		} // end else
		} // end while loop
	} // end main method

} // end class
