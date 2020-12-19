package exampleproject;

import java.util.Scanner;
import java.lang.Math;

public class contest {

	static Scanner scan = new Scanner(System.in);
	
	public static double findHighestSpeed(double[] speed, double[] time) {
		double speedDiff[] = new double[speed.length - 1];
		double timeDiff[] = new double[time.length - 1];
		double maxValue = -10000000.00;
		for (int i = 0; i < speed.length - 1; i++) {
				speedDiff[i] = Math.abs(speed[i+1] - speed[i]);
				timeDiff[i] = Math.abs(time[i+1] - time[i]);
			}
		for (int j = 0; j < speedDiff.length; j++) {
			if ((timeDiff[j])/(speedDiff[j]) > maxValue) {
			maxValue = (timeDiff[j])/(speedDiff[j]);
			}
		}
		return maxValue;
		}
	
	public static void main(String[] args) {
		int lineNum = scan.nextInt();
		double speed[] = new double[lineNum];
		double time[] = new double[lineNum];
		
		for (int i = 0; i < lineNum; i++) {
			speed[i] = scan.nextDouble();
			time[i] = scan.nextDouble();
		}
		
		findHighestSpeed(speed,time);
		
		double result = findHighestSpeed(speed, time);
		System.out.println(result);
	}

}
