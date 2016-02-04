package org.usfirst.frc.team5026.robot.commands;

import org.usfirst.frc.team5026.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ToggleShooterElevation extends Command {

    public ToggleShooterElevation() {
    	requires(Robot.shooterElevation);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.shooterElevation.toggleElevation();
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
