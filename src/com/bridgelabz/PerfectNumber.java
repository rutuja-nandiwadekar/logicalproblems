package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {

		int i, sum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number");
		int num = sc.nextInt();

		for (i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == num) {
			System.out.println(num + " is a Perfect Number");
		} else {
			System.out.println(num + " is not a Perfect Number");
		}
		sc.close();
	}
}
