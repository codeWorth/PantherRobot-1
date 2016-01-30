
package org.usfirst.frc.team5026.robot;

import org.usfirst.frc.team5026.robot.commands.AutoCommands;
import org.usfirst.frc.team5026.robot.subsystems.BallFeed;
import org.usfirst.frc.team5026.robot.subsystems.Shifter;
import org.usfirst.frc.team5026.robot.subsystems.Shooter;
import org.usfirst.frc.team5026.robot.util.Hardware;
import org.usfirst.frc.team5026.robot.util.PrimaryDriver;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
/**
 * The VM is configured to automatically run this class, and to call 
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {	
	public Command autonomousCommand = new AutoCommands();
	
	public static final BallFeed ballFeeder = new BallFeed();
	public static final Shifter shifter = new Shifter(true);
	public static final Shooter shooter = new Shooter();
	
	public PrimaryDriver joystickWrapper1 = new PrimaryDriver(Hardware.joystick1, Hardware.driveBase);	
	
	public static OI oi;
	
	public double encVel;
	public long startTime;
	public long deltatime;
	public double startPos;
	
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	oi = new OI();
        // instantiate the command used for the autonomous period
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        // schedule the autonomous command (example)
        //if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        //if (autonomousCommand != null) autonomousCommand.cancel();	
    	
    	
    	startTime = System.nanoTime();
    	startPos = Hardware.upperShooterMotor1.getEncPosition();
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){
    	
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        encVel = Hardware.upperShooterMotor1.getEncPosition()-startPos;
        //encVel2 = Hardware.upperShooterMotor2.getEnc
        
        SmartDashboard.putNumber("DELTA ENC VAL", encVel);
        deltatime = System.nanoTime()-startTime;
        SmartDashboard.putNumber("Delta Time", deltatime);
        
        encVel *= 1000000000 / deltatime;
        
        SmartDashboard.putNumber("encVel 2 ", encVel);
        
        joystickWrapper1.driveArcade();
        
        startTime = System.nanoTime();
        startPos = Hardware.upperShooterMotor1.getEncPosition();
       
        Robot.shooter.update();
        Hardware.lowerShooterGroup.update();
        Hardware.upperShooterGroup.update();
        
        SmartDashboard.putNumber("Vel Upper 1", Hardware.upperShooterMotor1.getEncVelocity());
        SmartDashboard.putNumber("RPS upper", Hardware.upperShooterGroup.rps);
    	SmartDashboard.putNumber("Pos Upper 1", Hardware.upperShooterMotor1.getEncPosition());
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
    
}
