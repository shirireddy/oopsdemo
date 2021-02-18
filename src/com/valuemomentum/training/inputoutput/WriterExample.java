package com.valuemomentum.training.inputoutput;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class WriterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Writer w=new FileWriter("c:/training/java/filedemo.txt");
			String content="She sells sea shells at the sea shore";
			
			w.write(content);
			w.close();
			System.out.println("Data written");
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
