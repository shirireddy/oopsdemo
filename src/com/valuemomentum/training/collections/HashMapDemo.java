package com.valuemomentum.training.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> languages=new HashMap<Integer,String>();
		languages.put(1,"java");
		languages.put(2,"python");
		languages.put(3,"javascript");
		System.out.println("Hashmap: "+languages);
		String str=languages.get(1);
		System.out.println("value at index 1 is: "+str);
		Set<Integer> keys;
		keys=languages.keySet();
		Iterator<Integer> itr=keys.iterator();
		while(itr.hasNext()) {
			int k=itr.next();
			System.out.println("hashmap element at index "+k+" is: "+languages.get(k));
		}
		System.out.println("keys: "+languages.keySet());
		System.out.println("values: "+languages.values());
		System.out.println("the hashmap is: "+languages.entrySet());
		languages.replace(2,"c++");
		System.out.println("keys:");
		for(Integer key1:languages.keySet()) {
			System.out.println(key1);
			System.out.println("value at "+key1+" is: "+languages.get(key1));
		}
		 System.out.print("\nEntries: ");
		    for (Entry<Integer, String> entry : languages.entrySet()) {
		      System.out.print(entry);
		      System.out.print(", ");
		    }
		
	}

}
