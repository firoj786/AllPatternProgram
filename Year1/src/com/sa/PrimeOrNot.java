package com.sa;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any valid integer :");
		int num = sc.nextInt();

		if (isPrime(num)) {
			System.out.println(num + " is a prime number.");
		} else
			System.out.println(num + " is not a prime number.");
	}

	private static boolean isPrime(int num) {
		if (num <= 0)
			return false;
		else if (num == 2)
			return true;
		else {
			for (int i = 3; i < (num); i++) {
				if (num % i == 0) {
					return false;
				}
			}
		}
		return true;

	}
}