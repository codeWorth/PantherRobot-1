package org.usfirst.frc.team5026.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.SpeedController;

public class ThreeMotorGroup extends Subsystem implements SpeedController {
	
    public SpeedController m_drive1;
    public SpeedController m_drive2;
    public SpeedController m_drive3;
    
    boolean isInverted;
    
    public ThreeMotorGroup(SpeedController a, SpeedController b, SpeedController c, boolean isLeftSide) {
    	m_drive1 = a;
    	m_drive2 = b;
    	m_drive3 = c;
    	isInverted = isLeftSide;
    }
    
    public double get() {
    	return m_drive1.get();
    }
    
    public void set(double speed, byte syncGroup) {
        set(isInverted ? -speed : speed);
    }
    
    public void set(double speed) {
    	m_drive1.set(-speed); // Top motor in gearbox
    	m_drive2.set(speed);
    	m_drive3.set(speed);
    }
    
    public void setInverted(boolean isLeftSide) {
    	isInverted = isLeftSide;
    }

    public boolean getInverted() {
    	return isInverted;
    }
    
    public void disable() {
    	m_drive1.disable();
    	m_drive2.disable();
    	m_drive3.disable();
    }
    
    public void pidWrite(double output) {
    	m_drive1.pidWrite(output);
    	m_drive2.pidWrite(output);
    	m_drive3.pidWrite(output);
    }

    public void initDefaultCommand() {}
}
