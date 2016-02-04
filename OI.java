package org.usfirst.frc.team5026.robot;

import org.usfirst.frc.team5026.robot.commands.Batter;
import org.usfirst.frc.team5026.robot.commands.FeedBall;
import org.usfirst.frc.team5026.robot.commands.IntakeBall;
import org.usfirst.frc.team5026.robot.commands.OutakeBall;
import org.usfirst.frc.team5026.robot.commands.Shift;
import org.usfirst.frc.team5026.robot.commands.ShootRoutine;
import org.usfirst.frc.team5026.robot.commands.TogglePullupShifter;
import org.usfirst.frc.team5026.robot.commands.ToggleShooter;
import org.usfirst.frc.team5026.robot.commands.ToggleShooterElevation;
import org.usfirst.frc.team5026.robot.subsystems.Pullup;
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
	public static Command batter = new Batter();
	public static Command intakeCmd = new IntakeBall();
	public static Command outakeCmd = new OutakeBall();
	public static Command shooterElevationCmd = new ToggleShooterElevation();
	public static Command pullupCmd = new TogglePullupShifter();
	
	public OI(){
		
		// Joystick 1
		//Hardware.mainTrigJoy1.whenPressed(shiftCmd);
		Hardware.sideTrigJoy1.whenPressed(batter);
		Hardware.mainTrigJoy1.whenPressed(outakeCmd);
		//Hardware.fourthButtonJoy1.whenPressed(servoCmd);
		//Hardware.thirdButtonJoy1.whenPressed(shoot);
		
		// Joystick 2
	}
}

