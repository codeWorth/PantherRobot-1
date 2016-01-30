package org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.util.Constants;
import org.usfirst.frc.team5026.robot.util.Hardware;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {
	public boolean running = false;
	
    public static final double mSpeed = -0.42;
    //.43 for 13 ft.
    
    public static final double targetRPS = 50000000;
    
    public void initDefaultCommand() 
    {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void update(){
    	if (running){
    		pushOut();
    	} else {
    		stop();
    	}
    }
    
    public void pushOut() //has to be repeatedly call
    {
    	//SmartDashboard.putNumber("RPS lower", Hardware.lowerShooterGroup.rps);
    	
    	Hardware.lowerShooterGroup.start();
    	Hardware.upperShooterGroup.start();
    	
    	//SmartDashboard.putNumber("Vel Upper 2", Hardware.upperShooterMotor2.getEncVelocity());
    	
    	//SmartDashboard.putNumber("Pos Upper 2", Hardware.upperShooterMotor2.getEncPosition());
    	
    	if (Hardware.lowerShooterGroup.rps < targetRPS){
    		Hardware.lowerShooterGroup.set(mSpeed);
    	} else {
    		Hardware.lowerShooterGroup.set(0);
    	}
    	
    	if (Hardware.upperShooterGroup.rps < targetRPS * Constants.upperPercentage){
    		Hardware.upperShooterGroup.set(-mSpeed * Constants.upperPercentage);
    	} else {
    		Hardware.upperShooterGroup.set(0);
    	}
    }
    
    public void shootBall() {
    	Hardware.lowerShooterGroup.set(0.5);
    	Hardware.upperShooterGroup.set(-0.5);
    }
    
    public void stop()
    {
    	Hardware.lowerShooterGroup.set(0);
    	Hardware.upperShooterGroup.set(0);
    }
    
}
