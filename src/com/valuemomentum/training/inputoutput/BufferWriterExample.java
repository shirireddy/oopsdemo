package com.valuemomentum.training.inputoutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterExample{ 
public static void main(String args[]) { 

// Writing to a file using BufferedWriter in Java 

try { 
FileWriter writer = new FileWriter("c:/training/java/filedemo.txt",true); //true here appends the data to ur existing data in file...whe ut us said false it will rewrite the data 
BufferedWriter bwr = new BufferedWriter(writer);  

bwr.write(" James"); 
bwr.write("\n"); // bwr.newLine();
bwr.write("Hobert"); 
bwr.close(); 

System.out.println("succesfully written to a file"); } 
catch (IOException ioe) { 
ioe.printStackTrace(); 

}
 } 
}

