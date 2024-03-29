package org.usfirst.frc.team5026.robot.commands;

import org.usfirst.frc.team5026.robot.util.Hardware;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */

public class ShooterSpeedDrop extends Command {

	private double minSpeedDropPercent = 0.1;
	private double prevSpeed = 0;
	
    public ShooterSpeedDrop() {
        // Use requires() here to declare subsystem dependencies
    	setTimeout(10);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if (isTimedOut()){
    		return true;
    	}
		SmartDashboard.putNumber("prev speed", prevSpeed);
		SmartDashboard.putNumber("cur speed", Hardware.upperShooterGroup.rps);
    	if (Hardware.upperShooterGroup.rps < prevSpeed * minSpeedDropPercent){
    		return true;
    	} else {
    		prevSpeed = Hardware.upperShooterGroup.rps;
    		return false;
    	}
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
    
}
