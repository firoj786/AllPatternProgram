package com.sa.nacre;

// import java.util.*;  
import java.util.Scanner;

//Q.write a program to swap two numbers without using third variable.
class Swap {
	public static void main(String a[]) {
		System.out.println("Enter the value of x and y:");
		Scanner sc = new Scanner(System.in);
		/* Define variables */
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("before swapping numbers: " + x + " " + y);
		/* Swapping */
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swapping: " + x + "  " + y);
	}
}
/*
  Output:
  Enter the value of x and y 23 43
  before swapping numbers: 23 43 
   After swapping: 43 23
 */
