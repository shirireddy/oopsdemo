
public class TollBoothTest {

	public static void main(String[] args) {
		TollBooth booth=new OrrTollBooth();
		Truck ford= new Ford(5,12500);
		Truck nissan=new Nissan(2,5000);
		Truck daewoo=new Daewoo(6,17000);
		booth.calculate(ford);
		booth.calculate(nissan);
		booth.calculate(daewoo);
		booth.display();
		booth.clearScreen();
		booth.display();
	}

}
