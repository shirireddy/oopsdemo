package com.valuemomentum.training.collections;

import java.util.Hashtable;

public class HashTableDemo1 {

	public static void main(String[] args) {
		 Hashtable<Integer,String> map=new Hashtable<Integer,String>();          
	     map.put(100,"Amit");    
	     map.put(102,"Ravi");   
	     map.put(101,"Vijay");    
	     map.put(103,"Rahul");    

	     //Here, we specify the if and else statement as arguments of the method  
	     System.out.println(map.getOrDefault(101, "Not Found"));  //if found return value else not found
	     System.out.println(map.getOrDefault(105, "Not Found"));  

	      map.remove(102);  
	       System.out.println("After remove: "+ map); 

	//Inserts, as the specified pair is unique  
	     map.putIfAbsent(104,"Gaurav");  
	     System.out.println("Updated Map: "+map);
	}

}
