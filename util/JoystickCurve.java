
package org.usfirst.frc.team5026.robot.util;

public enum JoystickCurve {
	LINEAR (1),
	SQUARED (2),
	CUBIC (3);
	
	private int power;
	JoystickCurve(int power) {
		this.power = power;
	}
	
	public int getPower() {
		return power;
	}
}