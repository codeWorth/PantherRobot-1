package org.usfirst.frc.team5026.robot.util;

public class Constants {
	
	// Joysticks
	public static final int kPrimaryJoystick = 0;
	public static final int kSecondaryJoystick = 1;
	
	public static final double kPrimaryJoystickDeadZone = 0.08;
	
	public static final double kSecondaryJoystickDeadZone = 0;
	
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
	
	// Servos
	public static final int kFeederServo = 6;
	
	// DoubleSolenoids
	public static final int kShiftSolenoidForwardChannel = 0;
	public static final int kShiftSolenoidReverseChannel = 1;
	
	public static final int kBatterSolenoidForwardChannel = 2;
	public static final int kBatterSolenoidReverseChannel = 3;
	
	public static final int kShooterSolenoidForwardChannel = 4;
	public static final int kShooterSolenoidReverseChannel = 5;
	
	public static final int kIntakeSolenoidForwardChannel = 6;
	public static final int kIntakeSolenoidReverseChannel = 7;
	
	public static final int kPullupShiftSolenoidForwardChannel = 8;
	public static final int kPullupShiftSolenoidReverseChannel = 9;
	
	public static final int kPullupArmSolenoidForwardChannel = 10;
	public static final int kPullupArmSolenoidReverseChannel = 11;


	
	// DIO
	
	// Math Constants
	public static final int kWheelRadius = 6; //inches
	public static final double kEncoderCPR = 256;
	
	public static final int yAveCount = 10;
	public static final int xAveCount = 6;
	
	public static final double upperPercentage = 1;
	
	public static final double kDriveP = 0;
	public static final double kDriveI = 0;
	public static final double kDriveD = 0;
	
	public static final double kShooterP = 0;
	public static final double kShooterI = 0;
	public static final double kShooterD = 0;
	
	public static final int kIntakeMotor = 9;
}