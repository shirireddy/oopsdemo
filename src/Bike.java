
public class Bike {

	final int SPEED_LIMIT=90;//final variable
	/* void run(){
	  SPEED_LIMIT=400;
	 }*/
	void run() {
		System.out.println("speed limit: "+SPEED_LIMIT);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Bike obj=new  Bike();
		 obj.run();

	}

}
