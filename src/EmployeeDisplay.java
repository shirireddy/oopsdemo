
public class EmployeeDisplay {
	String name;
	int year_of_joining;
	String address;
	EmployeeDisplay(String n,int y,String a){
		this.name=n;
		this.year_of_joining=y;
		this.address=a;
	}
	public void display() {
		System.out.println(name+"\t"+year_of_joining+" \t\t"+address);
	}

}
