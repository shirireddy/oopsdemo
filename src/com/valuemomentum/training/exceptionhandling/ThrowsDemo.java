package com.valuemomentum.training.exceptionhandling;

public class ThrowsDemo {
	void Division() throws ArithmeticException{
		int a=45,b=0,rs;
		rs=a/b;
		System.out.println("\n\tThe result is: "+rs);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsDemo t=new ThrowsDemo();
		try 
		{
		t.Division();	
		}
		catch(ArithmeticException ex) {
			System.out.println("\n\tError : "+ex.getMessage());
		}
		System.out.println("end of program.");

	}

}
