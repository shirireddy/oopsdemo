import java.util.Comparator;

public class StudentFile {
	int rollNo;
	String name,address;
	
	

	public StudentFile(int rollNo2, String name2, String address2) {
		// TODO Auto-generated constructor stub
		this.rollNo = rollNo2;
		this.name = name2;
		this.address = address2;
	}

	@Override
	public String toString() {
		return "StudentFile [rollNo=" + rollNo + ", Name=" + name + ", address=" + address + "]";
	}
		
}
	class SortByRoll implements Comparator<StudentFile>{

		@Override
		public int compare(StudentFile s1, StudentFile s2) {
			// TODO Auto-generated method stub
		
			return s1.rollNo-s2.rollNo;
		}
	}
	class SortByName implements Comparator<StudentFile>{

		@Override
		public int compare(StudentFile s1, StudentFile s2) {
			// TODO Auto-generated method stub
			return s1.name.compareTo(s2.name);
		}
		
	}
	

