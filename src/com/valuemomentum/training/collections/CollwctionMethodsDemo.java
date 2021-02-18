package com.valuemomentum.training.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollwctionMethodsDemo {

	public static void main(String[] args) {
		 // Create a list of strings
        ArrayList<String> al = new ArrayList<String>();
        al.add("Java For Developers");
        al.add("Friends");
        al.add("Dear");
        al.add("Is");
        al.add("Superb");
 
        /* Collections.sort method is sorting the
        elements of ArrayList in ascending order. */
        Collections.sort(al);
 
        // Let us print the sorted list
        System.out.println("List after the use of" +
                           " Collection.sort() :\n" + al);
    int pos=Collections.binarySearch(al,"Superb");
    System.out.println("The position of \"Superb\" in Arraylist is :"+pos);
    
     Collections.reverse(al);
    System.out.println("List after the Reversing"+ al);

     Collections.swap(al,4,1);
    System.out.println("List after the SWaping"+ al);
    Collections.shuffle(al);
    System.out.println("List after using shuffle function is: "+al);
    ArrayList<String> n=new ArrayList<String>(5);
    n.add("a");
    n.add("b");
    n.add("c");
    n.add("d");
    n.add("e");
    System.out.println(n);
    Collections.copy(n,al);
    System.out.println("--------------the new arraylist contains-----------------");
    System.out.println(n);
    n=al;
    System.out.println(n);
    ArrayList<String> n1add=new ArrayList<String>(5);
    n1add.addAll(al);
    System.out.println(n1add);
    
    
    
	}

}
