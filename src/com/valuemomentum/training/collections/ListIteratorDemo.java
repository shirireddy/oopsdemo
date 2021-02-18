package com.valuemomentum.training.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public final class ListIteratorDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names=new ArrayList<String>();
		names.add("shiri");
		names.add("rhea");
		names.add("phila");
		System.out.println("element at 2nd position is:"+names.get(2));
		Iterator<String> its=names.listIterator();
		while(its.hasNext()) {
			System.out.println(its.next()+" ");
		}
		
		while(((ListIterator<String>) its).hasPrevious()) {
			System.out.println(((ListIterator<String>) its).previous()+" ");
		}
		 LinkedList<String> carList = new LinkedList<String>();
		    carList.add("Audi");
		    carList.add("Jaguar");
		    carList.add("BMW");
		    carList.add("Mini Cooper");
		    //Getting ListIterator
		    ListIterator<String> ltr = carList.listIterator(); 
		    while(ltr.hasNext()){
		      String car = ltr.next();
		      
		      if(car.equals("BMW")) { //inserts bmw  after mercedes
		          ltr.add("Mercedes");
		      }
		      if(car.equals("Mini Cooper")) { //sets minincooper as camry
		          ltr.set("Camry");
		      }
		    }
		   
		    System.out.println("List elements- " + carList);
	}

}
