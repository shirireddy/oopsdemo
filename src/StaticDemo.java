
public class StaticDemo {
	static int count;
	StaticDemo(){
		count=count+1;
	}
	 static void display()
	{
	System.out.println("the No of object created is: "+count);
	}
		public static void main(String[] args) {
	StaticDemo sd1=new StaticDemo();
	StaticDemo sd2=new StaticDemo();
	StaticDemo sd3=new StaticDemo();
	//ways to call static methods
	StaticDemo.display();	 //with class name
	sd3.display(); 			//with object
	display();				//just method
	}

}
