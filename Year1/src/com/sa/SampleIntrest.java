package com.sa;
import java.util.Scanner;
public class SampleIntrest {
public static void main(String[] args) {
		int p, n, count;
		float r, si;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Values p");
		p = sc.nextInt();
		System.out.println("Enter Values n");
		n = sc.nextInt();
		System.out.println("Enter Values r");
		r = sc.nextFloat();
		count = 0;
	while(count<=3) {
		si = p * n * r / 100;
		System.out.println("Simple intrest:" + si);
		count = count + 1;
		 }
		// return;

	}

}
