package com.valuemomentum.training.inputoutput;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriterDemo {

	public static void main(String[] args) throws IOException {
		  CharArrayWriter out=new CharArrayWriter(); 
		   
          out.write("Welcome to IO Programming in Java");    
          FileWriter f1=new FileWriter("c:/training/hello.txt");    
          FileWriter f2=new FileWriter("c:/training/hello1.txt");    
          FileWriter f3=new FileWriter("c:/training/hello2.txt");    
          FileWriter f4=new FileWriter("c:/training/hello3.txt");

    
          out.writeTo(f1);    
          out.writeTo(f2);    
          out.writeTo(f3);    
          out.writeTo(f4);    

          f1.close();    
          f2.close();    
          f3.close();    
          f4.close();    
          System.out.println("Success...");    

	}

}
