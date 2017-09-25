
public class Whip extends CondimentDecorator{

	Beverage beverage;
	
	public Whip (Beverage beverage) {
		description = "Whip";
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", " + description;
	}

	@Override
	public double cost() {
		return 0.10 + beverage.cost();
	}
	

}
