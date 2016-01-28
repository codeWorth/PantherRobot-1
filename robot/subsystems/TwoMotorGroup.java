package org.usfirst.frc.team5026.robot.subsystems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class TwoMotorGroup extends Subsystem implements SpeedController {
    
	// Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public CANTalon motorController1;
	public SpeedController motorController2;
	
	private int encStart; 
	private long encVel = 0;
	public long rps = 0;
	private long startTime;
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

    	
	public TwoMotorGroup(CANTalon a, SpeedController b) {
		motorController1 = a;
		motorController2 = b;
	}
	
	public double get() {
		return motorController1.get();
	}
	
	public void set(double speed, byte whatever) {
	}
	 
   	public void set(double speed) {
		motorController1.set(speed);
		motorController2.set(speed);
	}

	public void disable() {
		motorController1.disable();
		motorController2.disable();
	}

	public void pidWrite(double output) {
		motorController1.pidWrite(output); 
		motorController2.pidWrite(output);
	}
	
	public void start(){
		encStart = motorController1.getEncPosition();
		
		startTime = System.nanoTime();
	}
	
	public void update() {
		/*if (System.nanoTime() - startTime <= 1000000000) {
    		if (Hardware.upperShooterMotor1.getEncPosition() >= encStart) {
    			encVel += Hardware.upperShooterMotor1.getEncPosition() - encStart;

    		}
    		
    		encStart = Hardware.upperShooterMotor1.getEncPosition();
    		SmartDashboard.putNumber("REAL? TICKS PER SECOND", encVel);
    	}
    	else
    	{
    		times++;
    		SmartDashboard.putNumber("SECONDS PASSED?", times);
    		SmartDashboard.putNumber("RPS:", encVel/7);
    		startTime = System.nanoTime();
    		encVel = 0.0;
    	}*/
		
		encVel = motorController1.getEncPosition() - encStart;
		
		SmartDashboard.putNumber("Enc VEL LOL", encVel);
		
		encVel *= 1000000000 / (System.nanoTime() - startTime); //1 bil
						
		SmartDashboard.putNumber("Enc VEL LOL v2 after done go", encVel);
		SmartDashboard.putNumber("Delta Time", System.nanoTime() - startTime);
		
		rps = (long) encVel;
		
		encStart = motorController1.getEncPosition();
		startTime = System.nanoTime();
	}


	@Override
	public void setInverted(boolean isInverted) {
		
	}


	@Override
	public boolean getInverted() {
		return false;
	}
}

