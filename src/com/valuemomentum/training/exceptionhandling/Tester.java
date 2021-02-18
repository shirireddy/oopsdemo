package com.valuemomentum.training.exceptionhandling;

public class Tester {
	int eid;
	String name;
	int sal;
	
	

	public Tester(int eid, String name, int sal) {
		super();
		this.eid = eid;
		this.name = name;
		this.sal = sal;
	}



	@Override
	public String toString() {
		return "Tester [eid=" + eid + ", name=" + name + ", sal=" + sal + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tester t1=new Tester(101,"hope",2000);
		System.out.println(t1);
	}

}
