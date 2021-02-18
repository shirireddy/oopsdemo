
abstract class Shape{
	String objectName=" ";
	Shape(String name){
		this.objectName=name;
	}
	public void moveTo(int x,int y) {
		System.out.println(this.objectName+" "+"has beenmoved to x= "+x+",y= "+y);
	}
	abstract double area();
	abstract public void draw();
}
class Rectangle extends Shape{
	int length,width;
	Rectangle(int length,int width,String name){
		super(name);
		this.length=length;
		this.width=width;
	}
	public void draw() {
		System.out.println("Rectangle has been drawn");
	}
	public double area() {
		double area=(length*width);
		return area;
	}
	
}
class Circle extends Shape{
	double pi=3.14;
	int radius;
	Circle(int radius,String name){
		super(name);
		this.radius=radius;
	}
	public void draw() {
		System.out.println("Circle is drawn");
	}
	public double area() {
		return (double)(pi*radius*radius);
		}
}
public class AbstractDemo1 {

	public static void main(String[] args) {
		Shape s=new Rectangle(15,20,"rectangle");
		s.draw();
		System.out.println("Area of rectangle is: "+s.area());
		s.moveTo(1, 2);
		Shape s2=new Circle(10,"circle");
		s2.draw();
		System.out.println("Area of circle is: "+s2.area());
		s2.moveTo(2, 4);
	}

}
