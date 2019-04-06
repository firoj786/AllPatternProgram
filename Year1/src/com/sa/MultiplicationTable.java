package com.sa;

import java.util.Scanner;

class MultiplicationTable
{
   public static void main(String args[])
   {
      int n, a;
	  Scanner in = new Scanner(System.in);
      System.out.println("Enter an integer to print it's multiplication table");
      n = in.nextInt();
      System.out.println("Multiplication table of "+n+" is :-");
 
      for ( a = 1 ; a<= 10 ; a++ )
         System.out.println(n+"*"+a+" = "+(n*a));
   }
}