/*package com.valuemomentum.training.inputoutput;


import java.io.*;
import java.io.FileInputStream;
public class InputStreamFileCopy {

	public static void main(String[] args) {
		try {
            InputStream is =  new FileInputStream("c:/training/countries.txt");
            
            OutputStream os = new FileOutputStream("c:/training/countries_copy.txt");
            
            byte[] buffer = new byte[1024];
            int bytesRead;
            //read from is to buffer
            while((bytesRead = ((FileInputStream) is).read(buffer)) !=-1){
                os.write(buffer, 0, bytesRead);
            }
            System.out.println("File Copied");
            is.close();
            //flush OutputStream to write any buffered data to file
            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();        }    }	}*/


