package org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.util.Hardware;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shifter extends Subsystem {	
	boolean isHigh;
	
	public Shifter(boolean highShift) {
		setShift(highShift);
	}
	
    public void initDefaultCommand() {}
    
    public void setShift(boolean highShift) {
    	if(highShift) {
    		Hardware.shifterSolenoid.set(Value.kForward);
    		isHigh = true;
    	}
    	
    	else {
    		Hardware.shifterSolenoid.set(Value.kReverse);
    		isHigh = false;
    	}
    }
    
    public void toggleShift() {
    	setShift(!isHigh);
    }
}

