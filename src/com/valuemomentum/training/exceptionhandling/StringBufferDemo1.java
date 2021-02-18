package com.valuemomentum.training.exceptionhandling;

public class StringBufferDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer stb=new StringBuffer("JamesGhosling");
		int length=stb.length();
		System.out.println("length of the string buffer is :"+length);
		System.out.println("The capacity of string is :"+stb.capacity());
		System.out.println("the reverse of stb is :"+stb.reverse());
		System.out.println("the substring is :"+stb.substring(0, 5));

	}

}
