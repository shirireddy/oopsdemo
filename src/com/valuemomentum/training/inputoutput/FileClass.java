package com.valuemomentum.training.inputoutput;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileClass {

	public static void main(String[] args) {
		File f=new File("hello.txt");
		try {
			//File f=new File("c:/training/hello.txt");
			if(f.createNewFile()) {
				System.out.println("new file is created");
			}
			else
				System.out.println("file already exists");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Name of the file is: "+f.getName());
		System.out.println("Path of the file: "+f.getPath());
		System.out.println("Parent if the file: "+f.getParent());
		System.out.println("File last modified: "+new Date(f.lastModified()));
		System.out.println("Size of the file: "+f.length());
		System.out.println("file deleted: "+f.delete());
		System.out.println(f.getPath());
		System.out.println(f.canRead());
	}

}
