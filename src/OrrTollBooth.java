
public class OrrTollBooth implements TollBooth {
int total_trucks=0;
int total_money=0;
	@Override
	public void calculate(Truck truck) {
		int due=0;
		int no_of_axles=truck.get_axle();
		int totalWeight=truck.get_weights();
		due=5*(no_of_axles)+10*(totalWeight/1000);
		total_trucks++;
		total_money=total_money+due;

	}

	@Override
	public void display() {
		System.out.println("******Collecting receipts******");
		System.out.println("Totals since the last collection-Receipts: "+total_money+" Trucks: "+total_trucks);

	}

	@Override
	public void clearScreen() {
		System.out.println("******After clearing of screen*****");
		total_trucks=0;
		total_money=0;
		display();
	}

}
