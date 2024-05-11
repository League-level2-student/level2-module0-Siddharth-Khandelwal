package extra;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 2
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SwingReview implements ActionListener, KeyListener {
	// Creates necessary Swing components to use for this program
	JFrame frame;
	JPanel panel;
	JLabel label;
	JButton button1;
	JButton button2;

	public void run() throws Exception {
		// 1. Initialize your JFrame variable as an object of the JFrame class
		frame=new JFrame();
		// 2. Set your JFrame object to be visible
		// JFrames are hidden by default! Make sure you are telling it to set visible, not asking if it is visible!
frame.setVisible(true);
		// 3. Run your program. Do you see your window? It's probably very
		// small.

		// 4. Set the default close operation to JFrame.EXIT_ON_CLOSE
		// This makes the program actually close when we hit the red X in the corner! Without it, our program keeps
		// running in the background even after we hit the red X.
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 5. Initialize your JPanel variable as an object of the JPanel class
panel = new JPanel();
		// 6. Initialize your JLabel variable as an object of the JLabel class
label = new JLabel("Good day mate!");
		// 7. Set the text of the JLabel to a lovely greeting.

		// 8. Add the JPanel object to the JFrame
frame.add(panel);
		// 9. Add the JLabel object to the JPanel
panel.add(label);
		// 10. Pack your JFrame.
frame.pack();
		// 11. Run your program again. Do you see your message?

		// 12. Use the loadImage method to set the icon of the JLabel object.
label.setIcon(loadImage("smiley.jpeg")); 
		// 13. Re-pack the JFrame object.
frame.pack();
		// 14. Run your program again. Do you see the image?

		// 15. Initialize your first JButton variable as an object of the JButton class
button1 = new JButton();
		// 16. Add the JButton object to the JPanel
panel.add(button1);
		// 17. Pack your JFrame
frame.pack();
		// 18. Add an action listener to the button
button1.addActionListener(this);
		// 19. Set the text of your button to "Click Me"
button1.setText("Click Me");
		// 20. Pack your JFrame
frame.pack();
		// 21. Add a second JButton and action listener to the button
button2 = new JButton();
panel.add(button2);
frame.pack();
button2.addActionListener(this);
		// 22. Set the text of your button to "No, Click Me"
button2.setText("No, Click Me");
		// 23. Uncomment the 2 lines below (Ignore what they do for now)
		 button1.setFocusable(false);
		 button2.setFocusable(false);

		// 29. Add a key listener to the frame
frame.addKeyListener(this);
	}

	public ImageIcon loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		return new ImageIcon(imageURL);
	}
int timespressed1 = 0;
	@Override
	public void actionPerformed(ActionEvent e) {
		// 24. Uncomment the 2 lines below
		JButton buttonClicked = (JButton)e.getSource();
		 System.out.println(buttonClicked.getText());

		// 25. Check which button was clicked
		// 26. If the "Click Me" button was clicked, use JOptionPane pop-up to say "Good
		// Choice"
		 if(buttonClicked==button1) {
			 JOptionPane.showMessageDialog(null, "Good Choice");
			 timespressed1++;
		 }

		// 27. If the "No, Click Me button" was clicked, say "A Better Choice"
if(buttonClicked ==button2) {
	JOptionPane.showMessageDialog(null, "A Better Choice");
}
		// 28. If the "Click Me" button is clicked 3 times, change the text of the button
		// to say "Stop Clicking Me"
if(timespressed1==3) {
	button1.setText("Stop Clicking Me");
}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// 30. Save the key typed by the user to a variable
		// HINT: Look at the methods that KeyEvent e has
char keytyped=e.getKeyChar();
		// 31. Use JOptionPane pop-up to tell the user which key they typed
JOptionPane.showMessageDialog(null, keytyped);
	}

	@Override
	public void keyPressed(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}
}