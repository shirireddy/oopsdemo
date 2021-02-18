
public class Calculate {

	void sum() {
		System.out.println("Method overloading");
	}
	void sum(int a,int b) {
		System.out.println("sum of int: "+(a+b));
	}
	void sum(float a,float b) {
		System.out.println("sum of float: "+(a+b));
	}
	void sum(String a,String b) {
		System.out.println("concatenation: "+(a+b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate c=new Calculate();
		c.sum();
		c.sum(5,6);
		c.sum(0.6f,0.8f);
		c.sum("hello","world");
	}

}
