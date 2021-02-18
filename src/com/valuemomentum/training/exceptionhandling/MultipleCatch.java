package com.valuemomentum.training.exceptionhandling;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		int result;
	int[] a1=new int[5];
	try
	{
		a1[0]=1;
		a1[1]=1;
		a1[2]=1;
		a1[3]=3;
		a1[4]=4;
		//a1[5]=5;
		result=a/b;
		System.out.println("result of division: "+result);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	/*catch(ArithmeticException e) {
	System.out.println(e);	
	}
	catch(ArrayIndexOutOfBoundsException ae){
		System.out.println(ae);
		
	}*/
	finally {
		System.out.println("end of program");
	}
	}

}
