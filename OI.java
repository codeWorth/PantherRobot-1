package org.usfirst.frc.team5026.robot;

import org.usfirst.frc.team5026.robot.commands.FeedBall;
import org.usfirst.frc.team5026.robot.commands.Shift;
import org.usfirst.frc.team5026.robot.commands.ShootRoutine;
import org.usfirst.frc.team5026.robot.commands.ToggleShooter;
import org.usfirst.frc.team5026.robot.util.Hardware;

import edu.wpi.first.wpilibj.command.Command;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public static Command shiftCmd = new Shift();
	public static Command shootCmd = new ToggleShooter();
	public static Command servoCmd = new FeedBall();
	public static Command shoot = new ShootRoutine();
	
	public OI(){
		//joystick 1
		Hardware.mainTrigJoy1.whenPressed(shiftCmd);
		//Hardware.sideTrigJoy1.whenPressed(shootCmd);
		//Hardware.fourthButtonJoy1.whenPressed(servoCmd);
		Hardware.sideTrigJoy1.whenPressed(shoot);
		
		//joystick 2
	}
}

