package com.ia.string;

import java.util.Scanner;

public class AddWithOutMethod {

	public static void main(String[] args) {
          int a;
          int b;
          int c;
          Scanner sc=new Scanner(System.in);
         System.out.println("Enter Integer No::");
          a=sc.nextInt();
          System.out.println("Enter Integer No::");
          b=sc.nextInt();
          System.out.println("Enter Integer No::");
          c=sc.nextInt();
          
          
          int result=a+b+c;
          System.out.println("result:"+result);
	}

}
