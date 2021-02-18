
public class StudentSortTest {

	public static void main(String[] args) {
		StudentSort stu1=new StudentSort(123,"phila","cse",510);
		StudentSort stu2=new StudentSort(456,"andy","cse",534);
		String[] names=new String[2];
		int[] marklist=new int[2];
		names[0]=stu1.name;
		names[1]=stu2.name;
		marklist[0]=stu1.marks;
		marklist[1]=stu2.marks;
		if(marklist[0]<marklist[1]) {
			int temp=marklist[0];
			marklist[0]=marklist[1];
			marklist[1]=temp;
			String tempname=names[0];
			names[0]=names[1];
			names[1]=tempname;
			
		}
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		
	}

}
