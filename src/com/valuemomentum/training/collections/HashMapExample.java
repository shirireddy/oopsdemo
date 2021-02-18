package com.valuemomentum.training.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,Book1> mapBook=new HashMap<Integer,Book1>();
		 Book1 b1=new Book1(101,"Let us C","Yashwant Kanetkar","BPB",8);
		    Book1 b2=new Book1(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
		    Book1 b3=new Book1(103,"Operating System","Galvin","Wiley",6);
		    mapBook.put(1,b1);
		    mapBook.put(1,b2);
		    mapBook.put(1,b3);
		    for(Map.Entry<Integer,Book1> e:mapBook.entrySet()) {
		    	int key=e.getKey();
		    	Book1 b=e.getValue();
		    	System.out.println("boook "+key+" details");
		    	System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		    }
		
	}

}
