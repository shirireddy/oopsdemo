
public class Patternp {
	  public void display() {
		    for (int i = 0; i < 30; i++) {
		      System.out.print("*");
		    }
		  }

		  // method with single parameter
		  public void display(char symbol) {
		    for (int i = 0; i < 30; i++) {
		      System.out.print(symbol);
		    }
		  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patternp d1 = new Patternp();

	    // call method without any argument
	    d1.display();
	    System.out.println("\n");

	}

}
