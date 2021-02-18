
public class Car1 {
	 //final will make sure engine is initialized
    private final Engine engine;  
    String nameOfCar;
    String modell;
    public Car1(String nameOfCar,String modell) {
    	engine=new Engine("POWERHIGH","ABC");
    	this.nameOfCar=nameOfCar;
    	this.modell=modell;
    }
    
    
    public void showAlldetails()
    {
        System.out.println("Name of Car ="+nameOfCar);
        System.out.println("Name of Model ="+modell);
        System.out.println("Engine used in Car ="+engine.typeOfEngine);
        System.out.println("Engine name of Car ="+engine.nameOfEngine);
    }
    
}
