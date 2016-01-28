package org.usfirst.frc.team5026.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

public class Shifter extends Subsystem {
    
	DoubleSolenoid leftShiftSolenoid = new DoubleSolenoid(0, 1);
	DoubleSolenoid rightShiftSolenoid = new DoubleSolenoid(2, 3);
	
	boolean isHigh;
	
	public Shifter(boolean highShift) {
		setShift(highShift);
	}
	
    public void initDefaultCommand() {}
    
    public void setShift(boolean highShift) {
    	if(highShift) {
    		leftShiftSolenoid.set(Value.kForward);
    		rightShiftSolenoid.set(Value.kForward);
    		isHigh = true;
    	}
    	
    	else {
    		leftShiftSolenoid.set(Value.kReverse);
    		rightShiftSolenoid.set(Value.kReverse);
    		isHigh = false;
    	}
    }
    
    public void toggleShift() {
    	setShift(!isHigh);
    }
}

