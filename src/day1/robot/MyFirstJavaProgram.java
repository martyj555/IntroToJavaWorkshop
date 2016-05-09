package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot robo = new Robot();
	robo.penDown();
	robo.setSpeed(7);
	robo.setPenColor(Color.red);
	robo.move(200);
	robo.turn(90);
	robo.setPenColor(Color.BLUE);
	robo.move(200);
	robo.turn(90);
	robo.setPenColor(Color.red);
	robo.move(200);
	robo.turn(90);
	robo.setPenColor(Color.BLUE);
	robo.move(200);
	for (int i = 0; i < 4; i++) {
		robo.setPenColor(Color.BLUE);
		robo.move(200);
		robo.turn(90);
		
	}
	}
}
