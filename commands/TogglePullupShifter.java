package org.usfirst.frc.team5026.robot.commands;

import org.usfirst.frc.team5026.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class TogglePullupShifter extends Command {

    public TogglePullupShifter() {
    	requires(Robot.pullupShifter);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.pullupShifter.togglePullupMotorPiston();
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
