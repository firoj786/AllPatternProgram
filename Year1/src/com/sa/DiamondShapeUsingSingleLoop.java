package com.sa;

import java.util.Arrays;

class DiamondShapeUsingSingleLoop
{
	
	public static void main(String args[]) {
		int size = 5;
		
		for (int i = -size + 1; i < size; i++) 
		{
			
			char row[] = new char[2 * size - Math.abs(i) - 1];
			
			Arrays.fill(row, 0, Math.abs(i), ' ');
			
			Arrays.fill(row, Math.abs(i), row.length, '*');
			
			System.out.println(String.valueOf(row));
		}
	}
}