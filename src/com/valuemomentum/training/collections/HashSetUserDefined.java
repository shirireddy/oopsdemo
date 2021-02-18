package com.valuemomentum.training.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetUserDefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> empset=new HashSet<Employee>();
		 Employee e=new Employee(100,"phila",1000);
		 Employee e1=new Employee(101,"andy",2000);
		 Employee e2=new Employee(102,"hope",3000);
		 Employee e3=new Employee(103,"josie",4000);
		 empset.add(e);
		 empset.add(e1);
		 empset.add(e2);
		 empset.add(e3);
		 for(Employee emp:empset) {
			 System.out.println("id of employee"+emp.id);
			 System.out.println("name of the employee: "+emp.name);
			 System.out.println("salary: "+emp.salary);
		 }
		 
	}

}
