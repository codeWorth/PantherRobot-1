package org.usfirst.frc.team5026.robot.util;


public class MovingAverage {	
	private double[] movAveList;
	private int listLength = 0;
		
	public MovingAverage(int listSize){	
		listLength = listSize;
		movAveList = new double[listSize];
	}
	
	public void update(double source){
		addAndShift(source);
	}
	
	public double readAverage(){
		double sum = 0;
		for (double val : movAveList){
			sum += val;
		}
		
		return sum/listLength;
	}
	
	private void addAndShift(double val){
		for (int i = 1; i < listLength; i++){
			movAveList[i-1] = movAveList[i];
		}
		
		movAveList[listLength-1] = val;
	}
}
