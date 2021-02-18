package com.valuemomentum.training.collections;


import java.util.TreeSet;


public class TreeSetExample {

	public static void main(String[] args) {
		 TreeSet<Integer> imput = new TreeSet<>();
			imput.add(1);
			imput.add(3);
			imput.add(4);
			imput.add(5);
			imput.add(6);
			imput.add(10);
			System.out.println("first element:"+imput.first());
			System.out.println("last element: "+imput.last());
			System.out.println("element higher that 4: "+imput.higher(4));
			System.out.println("element lower than 3: "+imput.lower(3));
			System.out.println("Using ceiling: " + imput.ceiling(9));
	        // Using floor()
	        System.out.println("Using floor: " + imput.floor(0));
	        System.out.println("Using floor: " + imput.floor(2));
	        System.out.println("Using ceiling: " + imput.ceiling(3));
	        
	        

	}

}
