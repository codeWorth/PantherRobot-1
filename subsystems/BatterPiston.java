package org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.util.Hardware;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class BatterPiston extends Subsystem {
    
    DoubleSolenoid batterPiston;
    boolean isRetracted;
    
    public BatterPiston(boolean isIn)
    {
    	batterPiston = Hardware.batterSolenoid;
    	setPiston(!isIn);
    }

    public void initDefaultCommand() {
    }
    
    public void extendPiston()
    {
    	batterPiston.set(Value.kForward);
    }
    
    public void retractPiston(){
    	batterPiston.set(Value.kReverse);
    }
    
    public void setPiston(boolean isIn)
    {
    	if(isIn)
    	{
    		extendPiston();
    		isRetracted = true;
    	}
    	else
    	{
    		retractPiston();
    		isRetracted = false;
    	}
    }
    
    public void toggleShift()
    {
    	setPiston(!isRetracted);
    }
}

