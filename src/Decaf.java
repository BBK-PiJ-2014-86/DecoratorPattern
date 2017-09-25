
public class Decaf extends Beverage {

	private double cost = 1.05;
	
	public Decaf () {
		description = "Decaf";
	}

	@Override
	public double cost() {
		
		return cost ;
	}

}
