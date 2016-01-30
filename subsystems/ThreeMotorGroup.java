




package org.usfirst.frc.team5026.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.SpeedController;

/**
 *
 */
public class ThreeMotorGroup extends Subsystem implements SpeedController {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public SpeedController motorController1;
	public SpeedController motorController2;
	public SpeedController motorController3;
	
	public boolean isRight;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

    	
    	public ThreeMotorGroup(SpeedController a, SpeedController b, SpeedController c) {
    		motorController1 = a;
    		motorController2 = b;
    		motorController3 = c;
    	}
    	
    	public double get() {
    		return motorController1.get();

    	}
    	
    	public void set(double speed, byte whatever) {
    		motorController1.set(-speed);
    		motorController2.set(speed);
    		motorController3.set(speed);
    	}
    	 
       	public void set(double speed) {
    		motorController1.set(-speed);
    		motorController2.set(speed);
    		motorController3.set(speed);
    	}

    	public void disable() {
    		motorController1.disable();
    		motorController2.disable();
    		motorController3.disable();
    	}

    	public void pidWrite(double output) {
    		motorController1.pidWrite(output); 
    		motorController2.pidWrite(output);
    		motorController3.pidWrite(output);
    	}


		@Override
		public void setInverted(boolean isInverted) {			
		}


		@Override
		public boolean getInverted() {
			return false;
		}

    	
    }

