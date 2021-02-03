package cost;

public class Pins implements Join {
	int cost = 10;
	private int id;
	
	public int cost() {
		return cost;
		
	}
	public int getId() {
		return id;
	}
	@Override
	public int cost(String name) {
		// TODO Auto-generated method stub
		return 10;
	}
}
