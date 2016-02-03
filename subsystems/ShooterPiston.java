package org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.util.Hardware;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ShooterPiston extends Subsystem {
    
    DoubleSolenoid shooterPiston;
    
    public ShooterPiston()
    {
    	shooterPiston = Hardware.shooterSolenoid;
    	retractPiston();
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void extendPiston()
    {
    	shooterPiston.set(Value.kForward);
    }
    
    public void retractPiston()
    {
    	shooterPiston.set(Value.kReverse);
    }
}

