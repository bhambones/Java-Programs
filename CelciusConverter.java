import javax.swing.*;
import java.awt.event.*;

public class CelciusConverter extends JFrame {
	
	private JPanel panel; // To reference a panel
	private JLabel messageLabel; // to reference a label
	private JTextField celTextField; // To reference a text field
	private JButton calcButton; // To reference a button
	private final int WINDOW_WIDTH = 200; // Window width
	private final int WINDOW_HEIGHT = 150; // Window height
	
	/**
	 * constructor
	 */
	public CelciusConverter()
	{
		// Set the window title.
		setTitle("Celcius Converter");
		
		// Set the size of the window.
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		//Specify what happens when the close button is called
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Build the panel and add it to the frame
		buildPanel();
		
		//Add the panel the the frame's content pane.
		add(panel);
		
		//Display the window
		setVisible(true);	
	}
	
	/**
	 * The buildPanel method adds a label,
	 * a text field, and a button to a panel
	 */
	
	private void buildPanel()
	{
		//Create a label to display instructions
		messageLabel = new JLabel("Enter a distance in Celcius");
		
		//Create a text field 10 characters wide
		celTextField = new JTextField(10);
		
		//Create a button with the caption "Convert"
		calcButton = new JButton("Convert");
		
		//Add an action listener to the button.
		calcButton.addActionListener(new CalcButtonListener());
		
		//Create a JPanel object and let the panel field reference it
		panel = new JPanel();
		
		//Add the label, text field, and button components to the panel
		panel.add(messageLabel);
		panel.add(celTextField);
		panel.add(calcButton);
	}
	
	/**
	 * CalcButtonListener is an action listener class for the Calculate button
	 */
	
	private class CalcButtonListener implements ActionListener
	{
		/**
		 *The actionPerformed method executes when the user clicks
		  on the calculate button.
		  @param e The event object.
		 */
		
		public void actionPerformed(ActionEvent e)
		{
			
			String input; // To hold the users input
			double fahrenheit; // Degrees in fahrenheit
			
			//Get the text entered by the user into the text field
			input = celTextField.getText();
			
			//Convert the input into fahrenheit
			fahrenheit= Double.parseDouble(input) * 9/5 + 32;
			
			//Display the result.
			JOptionPane.showMessageDialog(null, input + 
			" Celsius is " + fahrenheit + " fahrenheit.");
		}
	}
	
	public static void main(String[] args)
	{
		new CelciusConverter();
	}
}
