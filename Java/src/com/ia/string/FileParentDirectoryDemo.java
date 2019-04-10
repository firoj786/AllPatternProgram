package com.ia.string;
import java.io.File;
import java.io.IOException;
public class FileParentDirectoryDemo {
public static void main(String[] args) throws IOException {
      File f=new File("D:\\test.txt");
      f.createNewFile();
      System.out.println("f:"+f);
	}

}
