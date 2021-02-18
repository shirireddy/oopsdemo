package com.valuemomentum.training.inputoutput;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Reader reader=new FileReader("c:/training/java/filedemo.txt");
			int data=reader.read(); //points to the first character in the file here s i.e data=83 since ascii value of S is 83
			System.out.println("data: "+data);
			while(data!=-1) { //when the stream ends data=-1
				System.out.println((char)data);
				data=reader.read(); //pointing it to the next data
				
			}
			reader.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
