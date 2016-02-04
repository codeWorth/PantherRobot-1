package org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.util.Hardware;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

/**
 *
 */
public class Pullup extends Subsystem {
    	
	DoubleSolenoid armShifter;
	DoubleSolenoid armPistons;
	
	public boolean isEngaged;
	
	public Pullup() {
		armShifter = Hardware.pullupShiftSolenoid;
		armPistons = Hardware.pullupArmSolenoid;
		disengagePullupMotors();
	}
	
	public void engagePullupMotors() {
		armShifter.set(Value.kForward);
		isEngaged = true;
	}
	
	public void disengagePullupMotors() {
		armShifter.set(Value.kReverse);
		isEngaged = false;
	}
	
	public void togglePullupMotorPiston() {
		if(isEngaged) {
			disengagePullupMotors();
		}
		else {
			engagePullupMotors();
		}
	}
	
	

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

