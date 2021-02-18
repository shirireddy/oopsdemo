package com.valuemomentum.training.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> stu=new ArrayList<Student>();
		Student s1=new Student("phila",20,20);
		Student s2=new Student("andy",21,22);
		Student s3=new Student("taylor",22,21);
		Student s4=new Student("stefan",23,20);
		stu.add(s1);
		stu.add(s2);
		stu.add(s3);
		stu.add(s4);
		System.out.println("---------------before sort-----------------");
		for(Student sl:stu) {
			System.out.print("Name: "+sl.name);
			System.out.print("\trollno: "+sl.rollno);
			System.out.print("\tage: "+sl.age);
			System.out.println();
		}
		System.out.println("------------------after sort----------------");
		Collections.sort(stu);
		for(Student sl:stu) {
			System.out.print("Name: "+sl.name);
			System.out.print("\trollno: "+sl.rollno);
			System.out.print("\tage: "+sl.age);
			System.out.println();
		}
	}

}
