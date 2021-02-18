
public class Complex {
	double real;
	double imaginary;
	public Complex(double r,double i) 
	{
	real=r;  //automatic initialization to r and i to real and imaginary
	imaginary=i;
	}
	void add(Complex obj2) {
		this.real += obj2.real; //here this.real reps to the real part of obj1 and obj2.real reps the real part of the passed param i.e obj2
		this.imaginary += obj2.imaginary;
	}
	void display() {
		System.out.println(this.real+"+i"+this.imaginary); //here this reps the final real part of oj1 that we get after adding 2 complex numbs
	}

	public static void main(String[] args) {
		Complex obj1=new Complex(10.3,67.5);
		Complex obj2=new Complex(0.7,3.6);
		obj1.add(obj2);
		System.out.println("the addition of 2 complex numbers is: ");
		obj1.display();

	}

}
