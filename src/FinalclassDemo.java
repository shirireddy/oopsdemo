final class FinalClass {
  public void display() {
    System.out.println("This is a final method.");
  }

// try to extend the final class
/*
class FinalClassDemo extends FinalClass { //final methods cannot be overridden
  public  void display() {
    System.out.println("The final method is overridden.");
  }*/

  public static void main(String[] args) {
    FinalClass obj = new FinalClass();
    obj.display();
  }
  }
