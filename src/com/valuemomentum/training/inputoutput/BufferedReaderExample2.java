package com.valuemomentum.training.inputoutput;
//using inputstream to take input at runtime
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderExample2{    
public static void main(String args[])throws Exception{             
    InputStreamReader r=new InputStreamReader(System.in);    
    BufferedReader br=new BufferedReader(r);            
    System.out.println("Enter your name");    
    String name=br.readLine();  
    System.out.println("Enter age: ");
    String ages=br.readLine();
    int age=Integer.parseInt(ages);
    System.out.println("Welcome "+name);  
    System.out.println("Age:"+age);
}    
}  