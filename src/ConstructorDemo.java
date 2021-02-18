
public class ConstructorDemo 
{
	int id;
	ConstructorDemo()
	{
	System.out.println("in constructor");
	id=10;
	}
	void display() 
	{
		System.out.println(id);
	}
	public static void main(String[] args) {
		ConstructorDemo cd=new ConstructorDemo();
		ConstructorDemo cd2=new ConstructorDemo(); 
		cd.display();
	}

}
