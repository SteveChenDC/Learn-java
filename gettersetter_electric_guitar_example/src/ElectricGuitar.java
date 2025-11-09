/**
 * ElectricGuitar - A class demonstrating JavaBean design patterns with getters and setters.
 * 
 * <p>This class represents an electric guitar with various properties and follows
 * the JavaBean naming conventions for accessor and mutator methods (getters and setters).</p>
 * 
 * <h2>Design Pattern:</h2>
 * <p>This class demonstrates the <b>Encapsulation</b> principle of object-oriented programming
 * by providing controlled access to private state through public getter and setter methods.</p>
 * 
 * <h2>Properties:</h2>
 * <ul>
 *   <li><b>brand</b> - The manufacturer or brand name (e.g., "Fender", "Gibson")</li>
 *   <li><b>numOfPickups</b> - Number of pickups (typically 1-3)</li>
 *   <li><b>rockStarUsesIt</b> - Whether a famous rock star uses this guitar model</li>
 * </ul>
 * 
 * <h2>Usage Example:</h2>
 * <pre>{@code
 * // Create a new guitar
 * ElectricGuitar guitar = new ElectricGuitar();
 * 
 * // Set properties using setters
 * guitar.setBrand("Fender");
 * guitar.setNumOfPickups(3);
 * guitar.setRockStarUsesIt(true);
 * 
 * // Get properties using getters
 * String brand = guitar.getBrand();  // Returns "Fender"
 * int pickups = guitar.getNumOfPickups();  // Returns 3
 * boolean isRockStar = guitar.getRockStarUsesIt();  // Returns true
 * 
 * System.out.println(brand + " guitar with " + pickups + " pickups");
 * // Output: Fender guitar with 3 pickups
 * }</pre>
 * 
 * @author stevechen
 * @version 1.0
 * @since 2017-02-10
 */
public class ElectricGuitar {
    
    /**
     * The brand or manufacturer of the electric guitar.
     * <p>Examples: "Fender", "Gibson", "Ibanez", "PRS"</p>
     */
    String brand;
    
    /**
     * The number of pickups on the guitar.
     * <p>Typical values range from 1 to 3. Pickups are electromagnetic devices
     * that capture the vibration of the strings and convert them to electrical signals.</p>
     */
    int numOfPickups;
    
    /**
     * Indicates whether a famous rock star uses this guitar model.
     * <p>This can affect the guitar's popularity and market value.</p>
     */
    boolean rockStarUsesIt;

    /**
     * Gets the brand name of the guitar.
     * 
     * @return The brand name as a String, or null if not set
     * @see #setBrand(String)
     */
    String getBrand() {
        return brand;
    }

    /**
     * Sets the brand name of the guitar.
     * 
     * <p><b>Example Usage:</b></p>
     * <pre>{@code
     * ElectricGuitar guitar = new ElectricGuitar();
     * guitar.setBrand("Fender Stratocaster");
     * }</pre>
     * 
     * @param aBrand The brand name to set (e.g., "Fender", "Gibson")
     * @see #getBrand()
     */
    void setBrand(String aBrand){
        brand = aBrand;
    }

    /**
     * Gets the number of pickups on the guitar.
     * 
     * @return The number of pickups as an integer
     * @see #setNumOfPickups(int)
     */
    int getNumOfPickups(){
        return numOfPickups;
    }

    /**
     * Sets the number of pickups on the guitar.
     * 
     * <p><b>Example Usage:</b></p>
     * <pre>{@code
     * ElectricGuitar guitar = new ElectricGuitar();
     * guitar.setNumOfPickups(3);  // Standard for Stratocasters
     * }</pre>
     * 
     * <p><b>Common Configurations:</b></p>
     * <ul>
     *   <li>1 pickup: Simple, raw tone (e.g., Telecaster bridge)</li>
     *   <li>2 pickups: Versatile (e.g., Les Paul)</li>
     *   <li>3 pickups: Maximum tonal variety (e.g., Stratocaster)</li>
     * </ul>
     * 
     * @param num The number of pickups (typically 1-3)
     * @see #getNumOfPickups()
     */
    void setNumOfPickups(int num) {
        numOfPickups = num;
    }

    /**
     * Checks if a rock star uses this guitar model.
     * 
     * @return true if a rock star uses this guitar, false otherwise
     * @see #setRockStarUsesIt(boolean)
     */
    boolean getRockStarUsesIt() {
        return rockStarUsesIt;
    }

    /**
     * Sets whether a rock star uses this guitar model.
     * 
     * <p><b>Example Usage:</b></p>
     * <pre>{@code
     * ElectricGuitar guitar = new ElectricGuitar();
     * guitar.setBrand("Gibson Les Paul");
     * guitar.setRockStarUsesIt(true);  // Used by Slash, Jimmy Page, etc.
     * }</pre>
     * 
     * <p>This property can be useful for marketing or collector purposes,
     * as guitars associated with famous musicians often have higher value.</p>
     * 
     * @param yesOrNo true if a rock star uses this guitar, false otherwise
     * @see #getRockStarUsesIt()
     */
    void setRockStarUsesIt(boolean yesOrNo) {
        rockStarUsesIt = yesOrNo;
    }
}
