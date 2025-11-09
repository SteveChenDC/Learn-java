/**
 * Hobbits - A simple class demonstrating array manipulation with Hobbit characters.
 * 
 * <p>This class creates an array of Hobbit objects from J.R.R. Tolkien's "The Lord of the Rings"
 * and demonstrates basic array operations, object instantiation, and iteration.</p>
 * 
 * <h2>Featured Hobbits:</h2>
 * <ul>
 *   <li><b>Bilbo Baggins</b> - The protagonist of "The Hobbit"</li>
 *   <li><b>Frodo Baggins</b> - The Ring-bearer in "The Lord of the Rings"</li>
 *   <li><b>Samwise Gamgee</b> - Frodo's loyal companion</li>
 * </ul>
 * 
 * <h2>Program Flow:</h2>
 * <ol>
 *   <li>Create an array of 3 Hobbits objects</li>
 *   <li>Iterate through the array</li>
 *   <li>Instantiate each Hobbit</li>
 *   <li>Assign names using conditional logic</li>
 *   <li>Print each hobbit's name with a message</li>
 * </ol>
 * 
 * <h2>Usage Example:</h2>
 * <pre>{@code
 * // Run the Hobbits program
 * Hobbits.main(new String[]{});
 * 
 * // Output:
 * // bilbo is agood hobbit name
 * // frodo is agood hobbit name
 * // sam is agood hobbit name
 * }</pre>
 * 
 * @author stevechen
 * @version 1.0
 * @since 2017-02-10
 */
public class Hobbits {
    
    /**
     * The name of the hobbit.
     * <p>Stores the hobbit character's name (e.g., "bilbo", "frodo", "sam").</p>
     */
    String name;

    /**
     * Main entry point demonstrating array and object manipulation.
     * 
     * <p>Creates an array of three Hobbits objects and assigns names based on
     * array index position using conditional logic.</p>
     * 
     * <h3>Algorithm:</h3>
     * <pre>
     * 1. Create array of 3 Hobbits
     * 2. Initialize counter z = 0
     * 3. While z < 3:
     *    a. Create new Hobbits instance at index z
     *    b. Set default name to "bilbo"
     *    c. If z == 1: change name to "frodo"
     *    d. If z == 2: change name to "sam"
     *    e. Print hobbit name with message
     *    f. Increment counter
     * </pre>
     * 
     * <h3>Output Format:</h3>
     * <p>For each hobbit, prints: "[name] is agood hobbit name"</p>
     * 
     * <h3>Concepts Demonstrated:</h3>
     * <ul>
     *   <li>Array creation and initialization</li>
     *   <li>Object instantiation in loops</li>
     *   <li>Conditional assignment</li>
     *   <li>While loop iteration</li>
     *   <li>Array indexing</li>
     * </ul>
     * 
     * <p><b>Note:</b> The output contains a spacing issue ("is agood" instead of
     * "is a good") which is intentional to the original implementation.</p>
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String [] args){

        Hobbits [] h = new Hobbits[3];
        int z = 0;

        while (z<3){

            h[z]= new Hobbits();
            h[z].name = "bilbo";

            if (z == 1) {
                h[z].name = "frodo";
            }
            if (z == 2){
                h[z].name = "sam";
            }

            System.out.print(h[z].name + " is a");
            System.out.println("good hobbit name");
            z = z + 1;
        }
    }
}
