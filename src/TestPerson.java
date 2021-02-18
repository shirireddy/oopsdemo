
public class TestPerson {

	public static void main(String[] args) {
		Person p=new Person();
		Person p2=new Person("shiri",22);
		Person p3=new Person("reeva",18,"Hyderabad");
		p.input();
		p.print();
		p2.print();
		p3.print();
	}

}
