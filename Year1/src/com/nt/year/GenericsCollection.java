package com.nt.year;

import java.util.ArrayList;

class GenericsCollection 
{
	public static void main(String[] args) 
	{
		ArrayList<Object> al = new ArrayList<Object>();
		al.add("10");
		al.add("20");
		al.add("30");
		al.add("40");
		al.add("50");
		
		System.out.println(al);
		System.out.println(al);
		System.out.println(al);
		System.out.println(al);
		System.out.println(al);


	}
}

//Kathy Sierra