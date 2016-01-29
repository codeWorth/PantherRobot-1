package org.usfirst.frc.team5026.robot.util;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;



public class PrimaryDriver { //This class assumes arcade drive	
	private Joystick stick;
	private RobotDrive driveBase;
	
	private double[] yMovingAverage;
	public static final int yAveCount = 10;

	private double[] xMovingAverage;
	public static final int xAveCount = 6;
	
	public static final double xSensAmount = 0.6;
	
	public PrimaryDriver(Joystick joystick, RobotDrive base){
		stick = joystick;
		driveBase = base;
		
		yMovingAverage = new double[yAveCount];
		xMovingAverage = new double[xAveCount];
	}
	
	public void driveArcade(){
		updateYAxis();
		updateXAxis();
		
		driveBase.arcadeDrive(yWithThrottle(), xWithThrottle()); //first param throttle, second param turning
	}
	
	private void updateYAxis(){
		double newVal = stick.getY();
		addAndShift(yMovingAverage, newVal);
	}
	
	private void updateXAxis(){
		double newVal = stick.getX();
		addAndShift(xMovingAverage, newVal);
	}
	
	public double readYAverage(){
		double sum = 0;
		for (double val : yMovingAverage){
			sum += val;
		}
		
		return sum/yAveCount;
	}
	
	public double yWithThrottle(){
		return -readYAverage()*throttle();
	}
	
	public double xWithThrottle(){
		return -readXAverage()*throttle()*xSensAmount;
	}
	
	public double throttle(){
		return (-stick.getThrottle() + 1)/2;
	}
	
	public double readXAverage(){
		double sum = 0;
		for (double val : xMovingAverage){
			sum += val;
		}
		
		return sum/xAveCount;
	}
	
	private void addAndShift(double[] list, double val){
		for (int i = 1; i < list.length; i++){
			 list[i-1] = list[i];
		}
		
		list[list.length-1] = val;
	}
}
