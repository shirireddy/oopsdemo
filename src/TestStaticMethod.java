
class Student200{
	private int rollno;
	private String name;
	static String college="KMIT";
	
	public static void changeCollege() {
		college="CBIT";
		//rollno=1;
	}
	public Student200(int r,String n){
		rollno=r;
		name=n;
	}
	public void display() {
		System.out.println(rollno+" "+name+" "+college);
	}
}

public class TestStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student200.changeCollege();
		Student200 stu=new Student200(101,"phila");
		Student200 stu2=new Student200(102,"andy");
		Student200 stu3=new Student200(103,"hope");
		stu.display();
		stu2.display();
		stu3.display();
		

	}

}
