
public class ThisDemo {
	int instvar;
	ThisDemo(int instvar){
		this.instvar=instvar;
		System.out.println("this reference= "+this);
	}
	public static void main(String[] args) {
		ThisDemo obj=new ThisDemo(56);
		System.out.println("object reference: "+obj);

	}

}
