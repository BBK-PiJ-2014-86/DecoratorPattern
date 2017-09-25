
public class SteamedMilk extends CondimentDecorator{

	Beverage beverage;
	
	public SteamedMilk (Beverage beverage) {
		description = "Steamed Milk";
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
