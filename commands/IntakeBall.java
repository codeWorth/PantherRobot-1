package org.usfirst.frc.team5026.robot.commands;

import org.usfirst.frc.team5026.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class IntakeBall extends Command {
	
    public IntakeBall() {
        requires(Robot.intake);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (Robot.intake.isIntakeRunning){
    		Robot.intake.stop();
    	} else {
    		Robot.intake.spinIn();
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.intake.isIntakeRunning = !Robot.intake.isIntakeRunning;
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
