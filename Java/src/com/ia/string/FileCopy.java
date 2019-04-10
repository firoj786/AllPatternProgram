package com.ia.string;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws FileNotFoundException,IOException{
		FileInputStream fis=new FileInputStream("D:\\test.txt");
	//	FileOutputStream fos=new FileOutputStream("D:\\bbc.txt",true);
		FileOutputStream fos=new FileOutputStream("D:\\cbc.txt",true);

		int i;
		while(( i=fis.read())!=-1){
			
		fos.write(i);
		}
		System.out.println("Data Has Writen :");
		
   
	}

}
