package org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.util.Hardware;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem {
	Talon intakeMotor;
	DoubleSolenoid intakeSolenoid;
	boolean isIntakeOut;
	public boolean isBallTaken;
	
	public boolean isIntakeRunning = false;
	
	public Intake() {
		intakeMotor = Hardware.intakeMotor;
		intakeSolenoid = Hardware.intakeSolenoid;
		extendPiston();
	}
	
    public void initDefaultCommand() {
    }
    
    public void spinIn() {
    	intakeMotor.set(0.5);
    	isBallTaken = true; 
    }
    
    public void spinOut() {
    	intakeMotor.set(-0.5);
    	isBallTaken = false;
    }
    
    public void stop() {
    	intakeMotor.set(0);
    }
    
    public void setIntakeMotor(boolean isBallOut) {
    	if(isBallOut) {
    		spinIn();
    	}
    	else if(isBallOut == false) {
    		spinOut();
    	}
    	else {
    		stop();
    	}  
    }
    
    public void extendPiston() {
    	intakeSolenoid.set(Value.kForward);
    	isIntakeOut = true;
    }
    
    public void retractPiston() {
    	intakeSolenoid.set(Value.kReverse);
    	isIntakeOut = false;
    }
    
    public void setPiston(boolean isOut) {
    	if(isOut) {
    		retractPiston();
    	}
    	else {
    		extendPiston();
    	}
    }
    
    public void togglePiston() {
    	setPiston(isIntakeOut);
    }
}

