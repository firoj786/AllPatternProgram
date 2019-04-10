package com.ia.string;

import java.util.HashSet;

public class FindDuplicatedInArray 
{ 
    // Driver program 
    public static void main(String[] args) {
    	 int arr[] =  {4,5,8,7,4,7,6,7};
    HashSet<Integer> hs=new HashSet<>();
  for(int i=0;i<arr.length;i++){
	   hs.add(arr[i]);
	   
   }
   for(int no:hs){
	   System.out.print(no+" ");
   }
   }
}
       
         