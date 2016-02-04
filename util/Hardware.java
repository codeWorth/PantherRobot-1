package org.usfirst.frc.team5026.robot.util;

import org.usfirst.frc.team5026.robot.subsystems.ThreeMotorGroup;
import org.usfirst.frc.team5026.robot.subsystems.TwoMotorGroup;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class Hardware {
	
	private static final Talon leftM1 = new Talon(Constants.kLeftDrive1);
	private static final Talon leftM2 = new Talon(Constants.kLeftDrive2);
	private static final Talon leftM3 = new Talon(Constants.kLeftDrive3);
	
	public static final Talon rightM1 = new Talon(Constants.kRightDrive1);
	public static final Talon rightM2 = new Talon(Constants.kRightDrive2);
	public static final Talon rightM3 = new Talon(Constants.kRightDrive3);
	
	public static ThreeMotorGroup leftDrive = new ThreeMotorGroup(leftM1, leftM2, leftM3, false);
	public static ThreeMotorGroup rightDrive = new ThreeMotorGroup(rightM1, rightM2, rightM3, true);
		
	public static final DoubleSolenoid shifterSolenoid = new DoubleSolenoid(Constants.kShiftSolenoidForwardChannel, Constants.kShiftSolenoidReverseChannel); 
	public static final DoubleSolenoid shooterSolenoid = new DoubleSolenoid(Constants.kShooterSolenoidForwardChannel, Constants.kShooterSolenoidReverseChannel);
	public static final DoubleSolenoid batterSolenoid = new DoubleSolenoid(Constants.kBatterSolenoidForwardChannel, Constants.kBatterSolenoidReverseChannel);
	public static final DoubleSolenoid intakeSolenoid = new DoubleSolenoid(Constants.kIntakeSolenoidForwardChannel, Constants.kIntakeSolenoidReverseChannel);
	public static final DoubleSolenoid pullupShiftSolenoid = new DoubleSolenoid(Constants.kPullupShiftSolenoidForwardChannel, Constants.kPullupShiftSolenoidReverseChannel);
	public static final DoubleSolenoid pullupArmSolenoid = new DoubleSolenoid(Constants.kPullupArmSolenoidForwardChannel, Constants.kPullupArmSolenoidReverseChannel);


	public static final PrimaryDriver primaryJoystick = new PrimaryDriver(Constants.kPrimaryJoystick, JoystickCurve.SQUARED);
	
	public static final CANTalon lowerShooterMotor1 = new CANTalon(Constants.kLowerShooter1);
	public static final CANTalon lowerShooterMotor2 = new CANTalon(Constants.kLowerShooter2);
	
	public static final CANTalon upperShooterMotor1 = new CANTalon(Constants.kUpperShooter1);
	public static final CANTalon upperShooterMotor2 = new CANTalon(Constants.kUpperShooter2);
	
	public static final TwoMotorGroup lowerShooterGroup = new TwoMotorGroup(lowerShooterMotor1, lowerShooterMotor2);
	public static final TwoMotorGroup upperShooterGroup = new TwoMotorGroup(upperShooterMotor1, upperShooterMotor2);
	
	public static final Servo feedServo = new Servo(Constants.kFeederServo);
	
	public static final Button mainTrigJoy1 = new JoystickButton(primaryJoystick, 1);
	public static final Button sideTrigJoy1 = new JoystickButton(primaryJoystick, 2);
	public static final Button thirdButtonJoy1 = new JoystickButton(primaryJoystick, 3);
	public static final Button fourthButtonJoy1 = new JoystickButton(primaryJoystick, 4);
	
	public static final Talon intakeMotor = new Talon(Constants.kIntakeMotor);
	

}
