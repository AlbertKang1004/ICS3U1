package exampleproject;

import java.util.Arrays;
import java.util.Scanner;

public class contestrevised {

	static Scanner scan = new Scanner(System.in);
	
	public static void findHighestSpeed(int[][] timeAndSpeed) {
		Arrays.sort(timeAndSpeed, (a, b) -> Double.compare(a[0], b[0]));
		
		int time[] = new int[timeAndSpeed[0].length];
		time = timeAndSpeed[0];
		int speed[] = new int[timeAndSpeed[0].length];
		speed = timeAndSpeed[1];
		
		for(int e : time) {
			System.out.println(e);
		}
		for(int f : speed) {
			System.out.println(f);
		}
		//return ;
	}
	
	public static void main(String[] args) {
		int lineNum = scan.nextInt();
		int timeAndSpeed[][] = new int[lineNum][lineNum];
		int row = lineNum;
		int col = lineNum;
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				timeAndSpeed[i][j] = scan.nextInt();
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println(timeAndSpeed[i][j]);
			}
		}
		
		findHighestSpeed(timeAndSpeed);
		
	}

}
