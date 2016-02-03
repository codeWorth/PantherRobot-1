package org.usfirst.frc.team5026.robot.util;

import edu.wpi.first.wpilibj.Joystick;
import org.usfirst.frc.team5026.robot.util.Constants;

public class PrimaryDriver extends Joystick {
	
	public int power;
	public PrimaryDriver(int port, JoystickCurve jPower) {
		super(port);
		
		switch(jPower) {
			case LINEAR: {
				power = JoystickCurve.LINEAR.getPower();
				break;
			}
			case SQUARED: {
				power = JoystickCurve.SQUARED.getPower();
				break;
			}
			case CUBIC: {
				power = JoystickCurve.CUBIC.getPower();
				break;
			}
		}
	}

	public double getXAxis() {
		double xAxis = getX();

		if(Math.abs(xAxis) > Constants.kPrimaryJoystickDeadZone) {
			return inversionValue(xAxis)*Math.pow(xAxis, power);
		}
		else {
			return 0;
		}
	}
	
	public double getYAxis() {
		double yAxis = getY();
		
		if(Math.abs(yAxis) > Constants.kPrimaryJoystickDeadZone) {
			return inversionValue(yAxis)*Math.pow(yAxis, power);
		}
		else {
			return 0;
		}
	}
	
	private double inversionValue(double joyVal){
		double inverter = joyVal/Math.abs(joyVal);
		return Math.pow(inverter, power-1);
	}

}