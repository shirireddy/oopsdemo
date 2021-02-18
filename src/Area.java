import java.util.Scanner;
public class Area {
 int length=0;
 int breadth=0;
 int k=1;
 Scanner sc=new Scanner(System.in);
	
	Area(int length,int breadth){
		System.out.println("enter length");	
		this.length=sc.nextInt();
		System.out.println("enter breadth");
		this.breadth=sc.nextInt();
		
	} 
	public int returnArea() {
		k=length*breadth;
		return k;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0;
		int l=0;
		Area rectangle=new Area(k,l);
		int area=rectangle.returnArea();
		System.out.println("Area of rectangle is: "+area);

	}

}
