package com.valuemomentum.training.inputoutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferReaderDemo {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("c:/training/countries.txt")));
			String line = "";
			while((line=br.readLine())!=null){ //reads line by line
				System.out.println(line);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not exists or insufficient rights");
			e.printStackTrace(); 
		} catch (IOException e) {
			System.out.println("An exception occured while reading the file");
			e.printStackTrace();		}	

	}

}
