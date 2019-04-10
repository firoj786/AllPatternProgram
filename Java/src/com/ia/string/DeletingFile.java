package com.ia.string;

import java.io.File;
public class DeletingFile {
public static void main(String[] args) {
    File f=new File("D:\\test.txt");
    f.delete();
    if(!f.exists()) {
    	System.out.println("File is deleted");
    	  }
    else {
    	System.out.println("File is not Deleted");
    }
	}
}
