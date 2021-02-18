
abstract class Animal1{
	abstract void makeSound();
	public void eat() {
		System.out.println("i can eat");
	}
}
class Dog1 extends Animal1{
	void makeSound() {
		System.out.println("i bark");
	}
}
class Cat extends Animal1{
	void makeSound() {
		System.out.println("i meow");
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal1 d=new Dog1();
		d.eat();
		d.makeSound();
		Animal1 c=new Cat();
		c.eat();
		c.makeSound();
	}

}
