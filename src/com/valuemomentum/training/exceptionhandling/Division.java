package com.valuemomentum.training.exceptionhandling;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		int a,b;
		int result;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		try{
			result=a/b;
		System.out.println("result: "+result);
		}
		catch(Exception e) {
			System.out.println("An exception has occured: "+e);
		}
		finally {
			sc.close();
			System.out.println("-----------------end of the program-----------------------");
		}
		

	}

}
