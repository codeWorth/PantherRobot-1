package org.usfirst.frc.team5026.robot.commands;

import org.usfirst.frc.team5026.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;


public class ShootBall extends Command {
	
	//public static final double spinTime = 2;
	private boolean running = false;

    public ShootBall() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.shooter);
        //setTimeout(spinTime);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (running){
    		Robot.shooter.stop();
    	} 
    	else 
    	{
    		Robot.shooter.pushOut();
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return true;
    	// insert print is finished?
    }

    // Called once after isFinished returns true
    protected void end() {
    	running = !running;
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
