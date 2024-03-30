package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		Robot[] array = new Robot[5];
		



		//2. create an array of 5 robots.

		//3. use a for loop to initialize the robots.
		for (int i = 0; i < array.length; i++) {
			array[i] = new Robot();
			array[i].setX(200+(150*i));
			array[i].setY(600);
			array[i].setSpeed(5);
		}
		//4. make each robot start at the bottom of the screen, side by side, facing up

		//5. use another for loop to iterate through the array and make each robot move 
		//   a random amount less than 50.
		boolean raceprogress = true;
		int winner = 0;
		while (raceprogress) {


			for (int i = 0; i < array.length; i++) {
				Random rand = new Random();
				int g = rand.nextInt(51);
				array[i].move(g);
				if(array[i].getY()<0) {
					winner = i;
					raceprogress = false;
					break;
				}
			}
		}
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.



		//7. declare that robot the winner and throw it a party
		JOptionPane.showMessageDialog(null, "Robot "+winner+" is the winner");
		array[winner].setY(300);
		array[winner].setX(400);
		array[winner].sparkle();
		
			
		for (int i = 0; i < array.length; i++) {
			if(i!=winner){
				array[i].hide();
			}
		}
		//8. try different races with different amounts of robots.

		//9. make the robots race around a circular track.
	}
}
