package com.bridgelabz;
import java.util.Scanner;

public class StopWatch {
	static char start;
	static char stop;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		elapsedTime();
	}

	public static void elapsedTime() {
		
		// Ask user to press any key to start the stop watch
		System.out.println("Enter a key to start the stop watch");
		char start = sc.next().charAt(0);

		// Ask user to press any key to stop the stop watch
		System.out.println("Enter a key to stop the stop watch");
		char stop = sc.next().charAt(0);

		// Condition to calculate the Elapsed time
		double timeElapsed = (double) (stop - start) / 1000;
		System.out.println("Time Elapsed = " + timeElapsed + " Seconds");
	}
}
