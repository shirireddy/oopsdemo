package com.valuemomentum.training.collections;

import java.util.Iterator;
import java.util.Stack;


public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> s=new Stack<String>();
		s.push("java");
		s.push("c++");
		s.push("python");
		s.push("c#");
		
	    Iterator<String> itr=s.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	    System.out.println("----------------after pop---------");
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println("----------------after peek------------");
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println("----------------using search function------------");
		System.out.println(s.search("java"));
		System.out.println(s.search("c#"));
		
	}
}
