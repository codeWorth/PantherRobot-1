package org.usfirst.frc.team5026.robot.util;

import org.usfirst.frc.team5026.robot.subsystems.ThreeMotorGroup;
import org.usfirst.frc.team5026.robot.subsystems.TwoMotorGroup;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class Hardware {
	
	public static final SpeedController leftM1 = new Talon(Constants.kLeftDrive1);
	public static final SpeedController leftM2 = new Talon(Constants.kLeftDrive2);
	public static final SpeedController leftM3 = new Talon(Constants.kLeftDrive3);
	
	public static final SpeedController rightM1 = new Talon(Constants.kRightDrive1);
	public static final SpeedController rightM2 = new Talon(Constants.kRightDrive2);
	public static final SpeedController rightM3 = new Talon(Constants.kRightDrive3);
	
	public static final ThreeMotorGroup leftGroup = new ThreeMotorGroup(leftM1, leftM2, leftM3);
	public static final ThreeMotorGroup rightGroup = new ThreeMotorGroup(rightM1, rightM2, rightM3);
	
	public static final RobotDrive driveBase = new RobotDrive(leftGroup, rightGroup);
	
	public static final DoubleSolenoid shifterSolenoid = new DoubleSolenoid(Constants.kLeftShiftSolenoidForwardChannel, Constants.kLeftShiftSolenoidReverseChannel); 
	
	public static final Joystick joystick1 = new Joystick(Constants.kPrimaryJoystick);
	
	public static final CANTalon lowerShooterMotor1 = new CANTalon(Constants.kLowerShooter1);
	public static final CANTalon lowerShooterMotor2 = new CANTalon(Constants.kLowerShooter2);
	
	public static final CANTalon upperShooterMotor1 = new CANTalon(Constants.kUpperShooter1);
	public static final CANTalon upperShooterMotor2 = new CANTalon(Constants.kUpperShooter2);
	
	public static final TwoMotorGroup lowerShooterGroup = new TwoMotorGroup(lowerShooterMotor1, lowerShooterMotor2);
	public static final TwoMotorGroup upperShooterGroup = new TwoMotorGroup(upperShooterMotor1, upperShooterMotor2);
	
	public static final Servo feedServo = new Servo(Constants.kFeederServo);
	
	public static final Button mainTrigJoy1 = new JoystickButton(joystick1, 1);
	public static final Button sideTrigJoy1 = new JoystickButton(joystick1, 2);
	public static final Button thirdButtonJoy1 = new JoystickButton(joystick1, 3);
	public static final Button fourthButtonJoy1 = new JoystickButton(joystick1, 4);
	
}
