package org.usfirst.frc.team5026.robot.util;

public class Constants {
	
	// Joysticks
	public static final int kPrimaryJoystick = 0;
	public static final int kSecondaryJoystick = 1;
	
	public static final double kPrimaryJoystickDeadZone = 0;
	public static final double kPrimaryJoystickSensitivity = 0;
	
	public static final double kSecondaryJoystickDeadZone = 0;
	public static final double kSecondaryJoystickSensitivity = 0;
	
	// Motors
	public static final int kLeftDrive1 = 0;
	public static final int kLeftDrive2 = 1;
	public static final int kLeftDrive3 = 2;
	
	public static final int kRightDrive1 = 3;
	public static final int kRightDrive2 = 4;
	public static final int kRightDrive3 = 5;
	
	public static final int kUpperShooter1 = 1; //SRX
	public static final int kUpperShooter2 = 2; //SRX
	public static final int kLowerShooter1 = 3; //SRX
	public static final int kLowerShooter2 = 4; //SRX
	
	// DoubleSolenoids
	public static final int kLeftShiftSolenoidForwardChannel = 0;
	public static final int kLeftShiftSolenoidReverseChannel = 1;
	
	public static final int kRightShiftSolenoidForwardChannel = 2;
	public static final int kRightShiftSolenoidReverseChannel = 3;
	
	// DIO
	
	// Math Constants
	public static final int kWheelRadius = 6; //inches
	public static final double kEncoderCPR = 256;
	
	public static final double upperPercentage = 1 - 0.00826;
	
	public static final double kDriveP = 0;
	public static final double kDriveI = 0;
	public static final double kDriveD = 0;
	
	public static final double kShooterP = 0;
	public static final double kShooterI = 0;
	public static final double kShooterD = 0;
}