package com.valuemomentum.training.collections;

class Employee10
{
	private String name;

	public Employee10(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

interface pair<K,V>
{
	public K GetKey();
	public V getValue();
}

class OrderedPair<K,V> implements pair<K,V>
{
  private K key;
  private V value;
  
	public OrderedPair(K key, V value) {
	super();
	this.key = key;
	this.value = value;
}

	@Override
	public K GetKey() {
				return key;
	}

	@Override
	public V getValue() {
				return value;
	}
	
}
public class GenericMultipleTypeParameters {

	public static void main(String[] args) {
		OrderedPair<Integer,String> op1=new OrderedPair<Integer,String>(101,"java");
		OrderedPair<String,String> op2=new OrderedPair<String,String>("database","mysql");
		OrderedPair<Integer,Employee10> op3=new OrderedPair<Integer,Employee10>(1,new Employee10("phila"));
		System.out.println(op1.GetKey()+"\t\t: "+op1.getValue());
		
		System.out.println(op2.GetKey()+"\t: "+op2.getValue());
	
		System.out.println(op3.GetKey()+"\t\t: "+op3.getValue().getName());
		
		
		
	}

}
