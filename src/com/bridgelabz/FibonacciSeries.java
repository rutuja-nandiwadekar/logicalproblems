package com.bridgelabz;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		int firstTerm = 0, secondTerm = 1;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int num = sc.nextInt();

		System.out.println("Fibonacci Series till " + num);

		for (int i = 1; i <= num; ++i) {
			System.out.print(firstTerm + " ");

			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
		sc.close();
	}
}
