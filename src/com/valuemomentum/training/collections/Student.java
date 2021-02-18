package com.valuemomentum.training.collections;
public class Student implements Comparable<Student> {

		String name;
		int rollno;
		int age;
		
	public Student(String name, int rollno, int age) {
			super();
			this.name = name;
			this.rollno = rollno;
			this.age = age;
		}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		   if(age==o.age)
	            return 0;
	        else if(age>o.age)
	            return 1;
	        else
	            return -1;
	}

}
