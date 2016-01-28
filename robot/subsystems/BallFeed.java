package org.usfirst.frc.team5026.robot.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class BallFeed extends Subsystem {
    
	public Servo ballServo;
	boolean isServoFoward;
	
	public BallFeed(Servo feederServo) {
		ballServo = feederServo;
		resetServo();
	}
	
	public void fowardServo() {
		ballServo.setAngle(90);
		isServoFoward = true;
	}
	
	public void resetServo() {
		ballServo.setAngle(0.0);
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

