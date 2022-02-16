package com.bridgelabz;

import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {

	public static void main(String[] args) {
		System.out.println("Enter number of coupon you want to generate = ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i;
		for (i = 1; i <= n; i++) {
			Random coupon = new Random();
			int coup[] = new int[n];
			coupon.nextInt(6);
			System.out.println(coup);
		}
		sc.close();
	}
}
