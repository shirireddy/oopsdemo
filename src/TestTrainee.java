import java.util.Scanner;
class Trainee{
	//it is an instance class..it has properties and methods
	int tId;
	String tName;
	String technology;
	float salary,stipend;
	Scanner sc=new Scanner(System.in);
	void input() 
	{
	System.out.println("enter Id,Nme,Technology,Salary of a Trainee:");
	tId=sc.nextInt();
	tName=sc.next();
	technology=sc.next();
	salary=sc.nextFloat();
	}
	float calculate() 
	{
		stipend=salary-200;
		return stipend;	
	}
	void display() 
	{
		System.out.println("-----TRAINEE DETAILS-------");
		System.out.println("Trainee ID	: "+tId);
		System.out.println("Trainee Name	: "+tName);
		System.out.println("Tehnology	: "+technology);
		//System.out.println("Stipend		: "+salary);
	}
}
public class TestTrainee {

	public static void main(String[] args) {
		//this is main class...it has creation od objects and methid call
		Trainee t=new Trainee();
		Trainee t2=new Trainee();
		t.input();
		t2.input();
	
		t.display();
		System.out.println("Stipend		:"+t.calculate());
		t2.display();
		System.out.println("Stipend		:"+t2.calculate());
		

	}

}
