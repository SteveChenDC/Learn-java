/**
 * PhraseOMatic - A corporate buzzword phrase generator.
 * 
 * <p>This class generates humorous corporate buzzword phrases by randomly selecting
 * words from three predefined lists and combining them into a single phrase. It's
 * a satirical take on corporate jargon and business speak.</p>
 * 
 * <h2>How It Works:</h2>
 * <ol>
 *   <li>Maintains three arrays of buzzwords (adjectives, modifiers, nouns)</li>
 *   <li>Randomly selects one word from each array</li>
 *   <li>Combines them into a three-word phrase</li>
 *   <li>Outputs the generated phrase</li>
 * </ol>
 * 
 * <h2>Word Categories:</h2>
 * <ul>
 *   <li><b>List One</b>: Technology and business descriptors (e.g., "24/7", "web-based")</li>
 *   <li><b>List Two</b>: Action-oriented modifiers (e.g., "empowered", "leveraged")</li>
 *   <li><b>List Three</b>: Business concepts (e.g., "solution", "paradigm")</li>
 * </ul>
 * 
 * <h2>Example Outputs:</h2>
 * <pre>{@code
 * What we need is a 24/7 empowered solution
 * What we need is a web-based leveraged paradigm
 * What we need is a B-to-B distributed mindshare
 * What we need is a dynamic focused strategy
 * }</pre>
 * 
 * <h2>Statistical Information:</h2>
 * <p>With 12 words in list one, 18 in list two, and 12 in list three,
 * this generator can produce 12 × 18 × 12 = 2,592 unique phrases!</p>
 * 
 * <h2>Usage Example:</h2>
 * <pre>{@code
 * // Run the phrase generator
 * PhraseOMatic.main(new String[]{});
 * 
 * // Output (random):
 * // What we need is a web-based leveraged paradigm
 * }</pre>
 * 
 * @author Learning Java Project
 * @version 1.0
 * @since 1.0
 */
public class PhraseOMatic {
	
	/**
	 * Main entry point for the phrase generator.
	 * 
	 * <p>Generates a random corporate buzzword phrase by:</p>
	 * <ol>
	 *   <li>Defining three word lists containing business jargon</li>
	 *   <li>Generating random indices for each list</li>
	 *   <li>Selecting one word from each list</li>
	 *   <li>Combining the words into a phrase</li>
	 *   <li>Displaying the result</li>
	 * </ol>
	 * 
	 * <h3>Word Lists:</h3>
	 * <ul>
	 *   <li><b>wordListOne</b>: 12 technology/business descriptors</li>
	 *   <li><b>wordListTwo</b>: 18 action-oriented modifiers</li>
	 *   <li><b>wordListThree</b>: 12 business concepts</li>
	 * </ul>
	 * 
	 * <h3>Randomization:</h3>
	 * <p>Uses {@link Math#random()} to generate random indices within the bounds
	 * of each array, ensuring every word has an equal probability of being selected.</p>
	 * 
	 * <h3>Example Phrases:</h3>
	 * <pre>
	 * - What we need is a 24/7 empowered process
	 * - What we need is a multi-Tier sticky tipping-point
	 * - What we need is a B-to-B value-added solution
	 * - What we need is a web-based distributed architecture
	 * </pre>
	 * 
	 * <h3>Educational Value:</h3>
	 * <p>This program demonstrates:</p>
	 * <ul>
	 *   <li>Array initialization and manipulation</li>
	 *   <li>Random number generation</li>
	 *   <li>String concatenation</li>
	 *   <li>Array length property usage</li>
	 * </ul>
	 * 
	 * @param args Command line arguments (not used)
	 * 
	 * @see Math#random()
	 * @see String
	 */
	public static void main (String[] args) {
		String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma", "crtical-path", "dynamic"};
		String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered", "branded", "outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};
		String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core compatency", "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};
		
		// How many words are in each list
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		// generate three random numbers
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		
		// new build a phrase
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		
		System.out.println("What we need is a " + phrase);
	}
}
