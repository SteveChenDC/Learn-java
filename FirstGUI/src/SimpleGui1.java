import javax.swing.*;

/**
 * SimpleGui1 - A basic Java Swing GUI application demonstrating window creation.
 * 
 * <p>This class creates a simple graphical user interface using Java Swing components.
 * It demonstrates fundamental GUI programming concepts including:</p>
 * <ul>
 *   <li>JFrame creation and configuration</li>
 *   <li>JButton component usage</li>
 *   <li>Layout management</li>
 *   <li>Window sizing and visibility</li>
 * </ul>
 * 
 * <h2>Components Used:</h2>
 * <ul>
 *   <li><b>JFrame</b> - The main application window</li>
 *   <li><b>JButton</b> - An interactive button component</li>
 * </ul>
 * 
 * <h2>Usage Example:</h2>
 * <pre>{@code
 * // Run the GUI application
 * SimpleGui1.main(new String[]{});
 * 
 * // This will display a 300x300 window with a button labeled "click me"
 * }</pre>
 * 
 * <h2>Window Properties:</h2>
 * <ul>
 *   <li>Width: 300 pixels</li>
 *   <li>Height: 300 pixels</li>
 *   <li>Close operation: EXIT_ON_CLOSE (terminates application on window close)</li>
 * </ul>
 * 
 * @author stevechen
 * @version 1.0
 * @since 2017-02-17
 * @see javax.swing.JFrame
 * @see javax.swing.JButton
 */
public class SimpleGui1 {
    
    /**
     * Main entry point for the SimpleGui1 application.
     * 
     * <p>Creates and displays a simple GUI window with the following steps:</p>
     * <ol>
     *   <li>Instantiates a JFrame (main window)</li>
     *   <li>Creates a JButton with label "click me"</li>
     *   <li>Configures the frame to exit on close</li>
     *   <li>Adds the button to the frame's content pane</li>
     *   <li>Sets the window size to 300x300 pixels</li>
     *   <li>Makes the window visible</li>
     * </ol>
     * 
     * <h3>Thread Safety:</h3>
     * <p>Note: In production code, Swing components should be created and modified
     * on the Event Dispatch Thread (EDT) using SwingUtilities.invokeLater().</p>
     * 
     * <h3>Example Output:</h3>
     * <p>Displays a window with a button that currently has no action listener attached.
     * The button can be clicked but will not perform any action.</p>
     * 
     * @param args Command line arguments (not used)
     * 
     * @see javax.swing.JFrame#setDefaultCloseOperation(int)
     * @see javax.swing.JFrame#setSize(int, int)
     * @see javax.swing.JFrame#setVisible(boolean)
     * @see javax.swing.SwingUtilities#invokeLater(Runnable)
     */
    public static void main (String[] args){
        JFrame frame = new JFrame();
        JButton button = new JButton("click me");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(button);

        frame.setSize(300,300);

        frame.setVisible(true);
    }
}
