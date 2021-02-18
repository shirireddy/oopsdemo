import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<StudentFile> al=new ArrayList<StudentFile>();
		
		StudentFile s1=new StudentFile(1,"phila","hyderabad");
		StudentFile s2=new StudentFile(40,"hope","hyderabad");
		StudentFile s3=new StudentFile(16,"josie","hyderabad");
		StudentFile s4=new StudentFile(20,"lizzie","hyderabad");
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);

		System.out.println("-------------unsorted arraylist-------------------------");
		//System.out.println(al);
		//invokes the toString method in studentfile class and gives output as [StudentFile [rollNo=1, Name=phila, address=hyderabad], StudentFile [rollNo=10, Name=hope, address=hyderabad], StudentFile [rollNo=16, Name=josie, address=hyderabad], StudentFile [rollNo=20, Name=lizzie, address=hyderabad]]
		for (int i=0; i<al.size(); i++)
            System.out.println(al.get(i));

		Collections.sort(al, new SortByRoll());
	System.out.println("---------------after sorting by roll number-----------------");
	for (int i=0; i<al.size(); i++)
        System.out.println(al.get(i));
	
	Collections.sort(al,new SortByName());
	System.out.println("-------------------------after sorting by name--------------");
	for (int i=0; i<al.size(); i++)
        System.out.println(al.get(i));

}
}
