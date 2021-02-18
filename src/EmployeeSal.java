
public class EmployeeSal {
	int salary;
	int no_of_working_hours;
	int total_salary;
	EmployeeSal(){
		salary=0;
		no_of_working_hours=0;
	}
	void getInfo(int salary,int no_of_working_hours) {
		this.salary=salary;
		this.no_of_working_hours=no_of_working_hours;
		total_salary=salary;
	}
	
	void addSal() {
		if(salary<500) {
			total_salary+=10;
		}
	}
	int addWork() {
		if(no_of_working_hours>6) {
			total_salary+=5;
		}
		return total_salary;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeSal phila=new EmployeeSal();
		phila.getInfo(455, 7);
		phila.addSal();
		int k=phila.addWork();
		System.out.println("Total salary is: "+k);

	}

}
