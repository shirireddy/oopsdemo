
public class Nissan implements Truck {
	private int axle;
	private int weight;

	Nissan(int axles,int weights){
		axle=axles;
		weight=weights;
	}
	@Override
	public int get_axle() {
		// TODO Auto-generated method stub
		return axle;
	}
	@Override
	public int get_weights() {
		// TODO Auto-generated method stub
		return weight;
	}


}
