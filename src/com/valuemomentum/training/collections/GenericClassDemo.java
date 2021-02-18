package com.valuemomentum.training.collections;

import java.util.ArrayList;

class Sample<T>{
	private T data;
	

	public Sample(T data) {
		super(); //giving a call to base class-object
		this.data = data;
	}

	public T getData() {
		return data;
	}

	/*public void setData(T data) {
		this.data = data;
	}
	*/
	
}

public class GenericClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample<Integer> s=new Sample<Integer>(15);
		//s.setData(15);
		System.out.println(s.getData());
		Sample<String> s1=new Sample<String>("java generics");
		//s1.setData("Java Generics");
		System.out.println("Generic class passing string "+s1.getData());
		
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		//s2.setData(a1);
		Sample<ArrayList> s2=new Sample<ArrayList>(a1);
		System.out.println("passing an arraylist: "+s2.getData());
	}

}
