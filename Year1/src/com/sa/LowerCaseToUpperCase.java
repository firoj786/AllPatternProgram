package com.sa;

import java.io.*;
import java.util.Scanner;

public class LowerCaseToUpperCase
{
	public static void main(String []args)
	{
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Character:");
		char ch=sc.next().charAt(0);
		if (Character.isLowerCase(ch))
		{
			s=Character.toString(ch);
			System.out.println(s.toUpperCase());
		}
		else if(Character.isUpperCase(ch))
		{
			s=Character.toString(ch);
		
		System.out.println(s.toLowerCase());
		}
	}
}