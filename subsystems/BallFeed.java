package org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.util.Hardware;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class BallFeed extends Subsystem {
    
	boolean isServoFoward = false;
	
	public BallFeed() {
		resetServo();
	}
	
	public void fowardServo() {
		Hardware.feedServo.setAngle(0.0);
		isServoFoward = true;
	}
	
	public void resetServo() {
		Hardware.feedServo.setAngle(75);
		isServoFoward = false;
	}
	
	public void toggleServo() {
		if(isServoFoward) {
			resetServo();
		}
		else {
			fowardServo();
		}
	}

    public void initDefaultCommand() {

    }
}

