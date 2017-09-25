
public class HouseBlend extends Beverage {

	private double cost = 0.89;
	
	public HouseBlend() {
		description = "House Blend";
	}
	
	@Override
	public double cost() {
		return cost;
	}

}
