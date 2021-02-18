
public class Doctor {
	protected String name;
	protected int idNumber;
	protected String address;
	Doctor()
	{
	}
	Doctor(final String str,final int num,final String  addr)
	{
		name=str;
		idNumber=num;
		address=addr;
	}
	void display() 
	{
		System.out.println("Name of the doctor  is: "+name);
		System.out.println("His/Her idnumber is: "+idNumber);
		System.out.println("His/Her address is: "+address);
	}
}
