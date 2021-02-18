
public class EmployeeDisplayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDisplay ed1=new EmployeeDisplay("phila",2020,"71G Wallstreet");
		EmployeeDisplay ed2=new EmployeeDisplay("andy",2017,"68D Wallstreet");
		EmployeeDisplay ed3=new EmployeeDisplay("josie",2021,"67C Wallstreet");
		System.out.println("Name\tYear_Of_Joining\t\tAddress");
		ed1.display();
		ed2.display();
		ed3.display();

	}

}
