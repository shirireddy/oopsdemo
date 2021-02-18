
public class Contact {
	public void createContact(String name,long num) {
		System.out.println("Name of the person: "+name);
		System.out.println("Contact number of "+name+": "+num);
	}
	public void createContact(String name,long num,long num2) {
		System.out.println("Name of the person: "+name);
		System.out.println("Contact number1 of "+name+": "+num);
		System.out.println("Contact number2 of "+name+": "+num2);
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			Contact c1=new Contact();
			c1.createContact("phila", 9848287165L);
			c1.createContact("andy",9876749371L,9847295491L);

	}

}
