package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		// 2. create an array of 5 robots.
		Robot[] rob = new Robot[600];

		// 3. use a for loop to initialize the robots.
		for (int o = 0; o < rob.length; o++) {
			rob[o]=new Robot();
			rob[o].setX(850/rob.length*o+50);
			rob[o].setY(500);
			rob[o].setSpeed(50);
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		int robNum = 3443;
		boolean isRacing = true;
		while (isRacing == true) {
		for (int o = 0; o < rob.length; o++) {
			Random ran = new Random();
			rob[o].move(ran.nextInt(50));
			if (rob[o].getY() < 0) {
				isRacing = false;
				robNum = o+1;
			}
		}
		}
		
		System.out.println("Robot " + robNum + " is the winner");
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	}
}
