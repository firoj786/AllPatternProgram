package com.sa.nacre;

//Java program to find factorial of given number 
public class Factorial {
	// method to find factorial of given number
	static int factorial(int n) {
		if (n == 0)
			return 1;

		return n * factorial(n - 1);
	}

	// Driver method
	public static void main(String[] args) {
		int num = 5;
		System.out.println("Factorial of:" + num + "\tis:" + factorial(5));
	}

}
