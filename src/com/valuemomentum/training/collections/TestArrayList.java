package com.valuemomentum.training.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a1=new ArrayList<String>();
		a1.add("Jim");
		a1.add("Michael");
		a1.add("Carl");
		a1.add("Damon");
		Iterator<String> itr=a1.iterator();
		while(itr.hasNext()) {
			String name=itr.next();					//ITERATOT
			System.out.println("Name :"+name);
		}
		System.out.println("----------------display after for each---------------");
		for(String name:a1) {						//USING FOR EACH
			System.out.print(name+" ");
		}
		System.out.println();						//USING ITERATOR AND FOR EACH
		System.out.println("----------------display after iterator and for each--------------");
		a1.forEach(name->System.out.println(name));
		System.out.println("-------------adding stefan----------------");
		a1.add("stefan");
		System.out.println(a1);
		a1.remove(3);
		System.out.println("-------------remove damon------------");
		System.out.println(a1);
		a1.add(3, "klaus");
		System.out.println("----------------add klaus--------------");
		System.out.println(a1);

	}

}
