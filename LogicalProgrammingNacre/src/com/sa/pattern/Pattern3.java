package com.sa.pattern;
/*
54321
5432
543
54
5
*/
public class Pattern3{
	public static void main(String[] args) {
		for(int i=1; i<=5; i++){
	        for(int j=5; j>=i; j--){
	            System.out.print("\t"+j);
	            
	        }
	        System.out.println();
	    }
	}
	}