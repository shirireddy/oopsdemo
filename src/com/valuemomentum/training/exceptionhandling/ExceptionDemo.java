package com.valuemomentum.training.exceptionhandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		String[] language= {"C","C++","JAVA","c#","Perl"};
		try {
			for(int i=0;i<=5;i++) {
				System.out.println(language[i]);
			}
		}
		catch(Exception e){
			//System.out.println("An exception is caught: "+e);
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("end of program");
		}
	}

}
